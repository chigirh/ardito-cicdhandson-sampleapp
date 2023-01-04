package com.ardito.cicdhandson.sampleapp.donain.application.port.todo;

import com.ardito.cicdhandson.sampleapp.donain.application.port.Input;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TodoCreateInput implements Input {
    private String title;
}
