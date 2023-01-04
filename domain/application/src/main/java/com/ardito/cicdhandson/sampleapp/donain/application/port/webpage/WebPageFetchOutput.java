package com.ardito.cicdhandson.sampleapp.donain.application.port.webpage;

import com.ardito.cicdhandson.sampleapp.domain.enterprise.model.vo.WebPageTitle;
import com.ardito.cicdhandson.sampleapp.donain.application.port.Output;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WebPageFetchOutput implements Output {
    public WebPageTitle webPageTitle;
}
