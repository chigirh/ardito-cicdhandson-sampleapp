package com.ardito.cicdhandson.sampleapp.donain.application.repository;

import com.ardito.cicdhandson.sampleapp.domain.enterprise.model.Todo;

import java.util.List;

public interface TodoRepository {
    List<Todo> fetch();

    void create(Todo model);
}
