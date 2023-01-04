package com.ardito.cicdhandson.sampleapp.domain.enterprise.model;

import com.ardito.cicdhandson.sampleapp.domain.enterprise.model.vo.TodoId;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Todo {
    private TodoId id;
    private String title;
    private boolean isDone;
    private LocalDateTime updatedAt;
}
