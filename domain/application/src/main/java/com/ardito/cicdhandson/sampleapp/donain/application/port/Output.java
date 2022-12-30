package com.ardito.cicdhandson.sampleapp.donain.application.port;

public interface Output {
    default boolean isLogEnable() {
        return false;
    }

    default String getLogMessage() {
        return "";
    }
}
