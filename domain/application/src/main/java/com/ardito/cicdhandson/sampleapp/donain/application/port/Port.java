package com.ardito.cicdhandson.sampleapp.donain.application.port;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Port<I extends Input, O extends Output> {
    public O useCase(I input) {
        if (input.isLogEnable()) {
            log.info(input.getLogMessage());
        }

        var output = handle(input);

        if (output.isLogEnable()) {
            log.info(output.getLogMessage());
        }

        return output;
    }

    abstract protected O handle(I input);
}
