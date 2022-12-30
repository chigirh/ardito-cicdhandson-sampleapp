package com.ardito.cicdhandson.sampleapp.web.controller;

import com.ardito.cicdhandson.sampleapp.donain.application.port.webpage.WebPageFetchInput;
import com.ardito.cicdhandson.sampleapp.donain.application.port.webpage.WebPageFetchPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final WebPageFetchPort webPageFetchPort;

    @GetMapping("/")
    public String hello(Model model) {
        var output = webPageFetchPort.useCase(new WebPageFetchInput());
        model.addAttribute("title", output.webPageTitle.raw());
        return "main/index";
    }
}
