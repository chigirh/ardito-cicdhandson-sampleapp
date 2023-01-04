package com.ardito.cicdhandson.sampleapp.donain.application.port.todo;

import com.ardito.cicdhandson.sampleapp.domain.enterprise.model.Todo;
import com.ardito.cicdhandson.sampleapp.donain.application.port.DefaultInput;
import com.ardito.cicdhandson.sampleapp.donain.application.port.Port;
import com.ardito.cicdhandson.sampleapp.donain.application.port.SimpleOutput;
import com.ardito.cicdhandson.sampleapp.donain.application.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TodoFetchInteractor extends Port<DefaultInput, SimpleOutput<List<Todo>>> implements TodoFetchPort {

    private final TodoRepository todoRepository;

    @Override
    protected SimpleOutput<List<Todo>> handle(DefaultInput input) {
        var results = todoRepository.fetch();
        return new SimpleOutput<>(results);
    }
}
