package com.ardito.cicdhandson.sampleapp.infra.repository;

import com.ardito.cicdhandson.sampleapp.domain.enterprise.model.Todo;
import com.ardito.cicdhandson.sampleapp.domain.enterprise.model.vo.TodoId;
import com.ardito.cicdhandson.sampleapp.donain.application.repository.TodoRepository;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class TodoRepositoryImpl implements TodoRepository {

    private static final Comparator<Todo> UPDATED_AT_COMPARATOR = Comparator.comparing(Todo::getUpdatedAt);

    private final Map<TodoId, Todo> store = new HashMap<>();

    @Override
    public List<Todo> fetch() {
        return store.values().stream().sorted(UPDATED_AT_COMPARATOR).collect(Collectors.toList());
    }

    @Override
    public void create(Todo model) {
        store.put(model.getId(), model);
    }
}
