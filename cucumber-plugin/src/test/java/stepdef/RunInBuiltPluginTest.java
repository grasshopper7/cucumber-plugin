package stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "junit:report/junit/junit.xml", "testng:report/testng/testng.xml", "html:report/html",
		"pretty:report/pretty/pretty.txt", "progress:report/progress/progress.txt", "json:report/json/json.json",
		"usage:report/usage/usage.json", "rerun:report/rerun/rerun.txt", "summary",
		"unused:report/unused/unused.txt", "timeline:report/timeline" }, monochrome = true)
public class RunInBuiltPluginTest {
}
