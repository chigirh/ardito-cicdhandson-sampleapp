package com.ardito.cicdhandson.sampleapp.donain.application.port.webpage;

public interface WebPageFetchPort {
    WebPageFetchOutput useCase(WebPageFetchInput input);
}
