package runner;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)

@CucumberOptions(

features = {"src/main/resources/test.feature"},
plugin = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},
glue={"src/test/java/step/stepdefi.java"},

tags = {"@tag"}

)


public class runnerClass {

	
}
