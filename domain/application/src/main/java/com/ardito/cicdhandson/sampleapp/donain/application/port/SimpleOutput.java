package com.ardito.cicdhandson.sampleapp.donain.application.port;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SimpleOutput<E> implements Output {
    private E result;
}
