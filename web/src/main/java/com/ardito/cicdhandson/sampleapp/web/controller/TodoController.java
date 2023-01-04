package com.ardito.cicdhandson.sampleapp.web.controller;

import com.ardito.cicdhandson.sampleapp.donain.application.port.DefaultInput;
import com.ardito.cicdhandson.sampleapp.donain.application.port.todo.TodoCreateInput;
import com.ardito.cicdhandson.sampleapp.donain.application.port.todo.TodoCreatePort;
import com.ardito.cicdhandson.sampleapp.donain.application.port.todo.TodoFetchPort;
import com.ardito.cicdhandson.sampleapp.web.dto.TodoAddForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoFetchPort todoFetchPort;
    private final TodoCreatePort todoCreatePort;

    @GetMapping(value = "/todo")
    public String index(Model model) {
        var output = todoFetchPort.useCase(new DefaultInput());
        model.addAttribute("todos", output.getResult());
        return "todo/index";
    }

    @PostMapping(value = "todo/add")
    public String add(TodoAddForm form) {
        todoCreatePort.useCase(new TodoCreateInput(form.getTitle()));
        return "redirect:/todo";
    }
}
