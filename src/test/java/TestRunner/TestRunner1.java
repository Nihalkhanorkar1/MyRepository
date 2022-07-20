package TestRunner;

/*import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=" src//test//resources//Features//cucumber.feature ",
glue= {"stepdefination"})
public class TestRunner1 {
	
}
*/
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="src//test//resources//Features",
glue= {"stepdefination"},
plugin= {"pretty","html:target/HTML_Reports","json:traget/JSON_Reports/json_report.json",
		"junit:target/JUNIT_Report/junit_report.xml"},monochrome = true
)
public class TestRunner1 extends AbstractTestNGCucumberTests


{
	
}