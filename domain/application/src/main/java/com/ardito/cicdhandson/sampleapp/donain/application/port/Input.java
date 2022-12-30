package com.ardito.cicdhandson.sampleapp.donain.application.port;

public interface Input {
    default boolean isLogEnable() {
        return false;
    }

    default String getLogMessage() {
        return "";
    }
}
