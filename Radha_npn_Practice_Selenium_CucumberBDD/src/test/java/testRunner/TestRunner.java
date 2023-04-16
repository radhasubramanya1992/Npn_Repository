package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features={"src\\test\\java\\features\\TestFirstFeature.feature","src\\test\\java\\features\\TestSeleniumFeature.feature"},
glue="stepDefinitions",
monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
