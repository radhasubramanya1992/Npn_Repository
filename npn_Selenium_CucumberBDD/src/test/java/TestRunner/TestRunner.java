package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = {"src\\test\\java\\features\\MyFirstFeature.feature","src\\test\\java\\features\\MyFirstSeleniumf.feature"},
glue = "stepDefinitions",
monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
