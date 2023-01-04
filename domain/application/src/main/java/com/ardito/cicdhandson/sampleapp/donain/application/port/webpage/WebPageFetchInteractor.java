package com.ardito.cicdhandson.sampleapp.donain.application.port.webpage;

import com.ardito.cicdhandson.sampleapp.donain.application.port.DefaultInput;
import com.ardito.cicdhandson.sampleapp.donain.application.port.Port;
import com.ardito.cicdhandson.sampleapp.donain.application.repository.WebPageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WebPageFetchInteractor extends Port<DefaultInput, WebPageFetchOutput> implements WebPageFetchPort {

    private final WebPageRepository webPageRepository;

    @Override
    protected WebPageFetchOutput handle(DefaultInput input) {
        var title = webPageRepository.fetchTitle();
        return new WebPageFetchOutput(title);
    }
}
