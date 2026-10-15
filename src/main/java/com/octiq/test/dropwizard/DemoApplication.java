package com.octiq.test.dropwizard;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Environment;

public class DemoApplication extends Application<DemoConfiguration> {

    public static void main(String[] args) throws Exception {
        new DemoApplication().run(args);
    }

    @Override
    public void run(DemoConfiguration configuration, Environment environment) {
        environment.jersey().register(new HelloResource());
    }
}
