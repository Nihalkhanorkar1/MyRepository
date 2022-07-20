package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src//test//resources//Features",
glue= {"stepdefination"},
plugin= {"pretty","html:target/HTML_Reports","json:traget/JSON_Reports/json_report.json",
		"junit:target/JUNIT_Report/junit_report.xml"},monochrome = true)
public class TestRunner2 extends AbstractTestNGCucumberTests  {

}
