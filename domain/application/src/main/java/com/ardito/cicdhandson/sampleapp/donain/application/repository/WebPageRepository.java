package com.ardito.cicdhandson.sampleapp.donain.application.repository;

import com.ardito.cicdhandson.sampleapp.domain.enterprise.WebPageTitle;

public interface WebPageRepository {
    WebPageTitle fetchTitle();
}
