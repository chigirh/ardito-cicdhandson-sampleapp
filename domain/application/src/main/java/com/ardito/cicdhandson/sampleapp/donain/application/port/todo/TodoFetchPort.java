package com.ardito.cicdhandson.sampleapp.donain.application.port.todo;

import com.ardito.cicdhandson.sampleapp.domain.enterprise.model.Todo;
import com.ardito.cicdhandson.sampleapp.donain.application.port.DefaultInput;
import com.ardito.cicdhandson.sampleapp.donain.application.port.SimpleOutput;

import java.util.List;

public interface TodoFetchPort {
    SimpleOutput<List<Todo>> useCase(DefaultInput input);
}
