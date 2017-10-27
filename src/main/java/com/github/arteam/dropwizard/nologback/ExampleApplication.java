package com.github.arteam.dropwizard.nologback;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleApplication extends Application<ExampleConfiguration> {

    private static final Logger log = LoggerFactory.getLogger(ExampleApplication.class);

    @Override
    protected void bootstrapLogging() {
    }

    @Override
    public void run(ExampleConfiguration exampleConfiguration, Environment environment) throws Exception {
        log.info("Version: {}", exampleConfiguration.getVersion());

        environment.jersey().register(new ExampleResource());
    }

    public static void main(String[] args) throws Exception {
        new ExampleApplication().run(args);
    }
}
