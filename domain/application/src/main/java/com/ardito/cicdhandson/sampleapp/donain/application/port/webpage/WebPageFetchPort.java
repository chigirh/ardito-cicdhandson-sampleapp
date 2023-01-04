package com.ardito.cicdhandson.sampleapp.donain.application.port.webpage;

import com.ardito.cicdhandson.sampleapp.donain.application.port.DefaultInput;

public interface WebPageFetchPort {
    WebPageFetchOutput useCase(DefaultInput input);
}
