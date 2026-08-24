package com.BDDAutomationTesting;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "Features",
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true,
        publish = false
)

public class AppTest {

}