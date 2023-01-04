package com.ardito.cicdhandson.sampleapp.donain.application.port.todo;

import com.ardito.cicdhandson.sampleapp.domain.enterprise.model.Todo;
import com.ardito.cicdhandson.sampleapp.domain.enterprise.model.vo.TodoId;
import com.ardito.cicdhandson.sampleapp.donain.application.port.DefaultOutput;
import com.ardito.cicdhandson.sampleapp.donain.application.port.Port;
import com.ardito.cicdhandson.sampleapp.donain.application.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class TodoCreateInteractor extends Port<TodoCreateInput, DefaultOutput> implements TodoCreatePort {

    private final TodoRepository todoRepository;

    @Override
    protected DefaultOutput handle(TodoCreateInput input) {
        var todo = new Todo();
        todo.setId(new TodoId(UUID.randomUUID().toString()));
        todo.setTitle(input.getTitle());
        todo.setDone(false);
        todo.setUpdatedAt(LocalDateTime.now());

        todoRepository.create(todo);
        return new DefaultOutput();
    }
}
