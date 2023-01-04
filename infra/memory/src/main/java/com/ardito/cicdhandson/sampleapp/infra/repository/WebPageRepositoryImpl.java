package com.ardito.cicdhandson.sampleapp.infra.repository;

import com.ardito.cicdhandson.sampleapp.domain.enterprise.WebPageTitle;
import com.ardito.cicdhandson.sampleapp.donain.application.repository.WebPageRepository;
import org.springframework.stereotype.Repository;

@Repository
public class WebPageRepositoryImpl implements WebPageRepository {
    @Override
    public WebPageTitle fetchTitle() {
        return new WebPageTitle("Ardito CICD Handson deploy 202301041656");
    }
}
