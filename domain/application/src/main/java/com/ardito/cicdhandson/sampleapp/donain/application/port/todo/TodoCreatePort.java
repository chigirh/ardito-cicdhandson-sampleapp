package com.ardito.cicdhandson.sampleapp.donain.application.port.todo;

import com.ardito.cicdhandson.sampleapp.donain.application.port.DefaultOutput;

public interface TodoCreatePort {
    DefaultOutput useCase(TodoCreateInput input);
}
