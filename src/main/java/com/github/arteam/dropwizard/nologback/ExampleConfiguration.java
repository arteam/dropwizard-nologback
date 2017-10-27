package com.github.arteam.dropwizard.nologback;

import io.dropwizard.Configuration;

public class ExampleConfiguration extends Configuration {

    private String version = "0.1";

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
