package org.example.ceiba.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = {
                "src/test/resources/features/ConfirmOrder.feature"
        },
        glue = "org.example.ceiba.definitions",
        plugin = {}
)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
}
