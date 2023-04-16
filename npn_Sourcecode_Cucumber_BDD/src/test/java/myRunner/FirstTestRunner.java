package myRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="E:\\NPN\\Class-workspace\\BDD-Cucumber\\src\\test\\java\\features\\Examples.feature",
		glue="stepDefinitions",
		plugin= {"pretty","html:HTML-Reprots"},
		monochrome=true
		)
public class FirstTestRunner extends AbstractTestNGCucumberTests {

}
