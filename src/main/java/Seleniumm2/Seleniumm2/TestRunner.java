package Seleniumm2.Seleniumm2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Feature",
    glue = {"stepDefinition"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
