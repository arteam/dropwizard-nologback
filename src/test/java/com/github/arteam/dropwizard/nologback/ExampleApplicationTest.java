package com.github.arteam.dropwizard.nologback;

import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.junit.Rule;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExampleApplicationTest {

    @Rule
    public DropwizardAppRule<ExampleConfiguration> appRule = new DropwizardAppRule<ExampleConfiguration>(
            ExampleApplication.class, ResourceHelpers.resourceFilePath("test-example.yml"));


    @Test
    public void testAppIsWorking() {
        String response = appRule.client()
                .target("http://localhost:" + appRule.getLocalPort() + "/application/hello")
                .queryParam("name", "Fred")
                .request()
                .get(String.class);
        assertThat(response).isEqualTo("Hello, Fred!");
    }
}