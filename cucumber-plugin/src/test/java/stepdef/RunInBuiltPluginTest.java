package stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "junit:target/junit/junit.xml", "testng:target/testng/testng.xml", "html:target/html",
		"pretty:target/pretty/pretty.txt", "progress:target/progress/progress.txt", "json:target/json/json.json",
		"usage:target/usage/usage.json", "rerun:target/rerun/rerun.txt", "default_summary",
		"unused:target/unused/unused.txt", "timeline:target/timeline" }, monochrome = true)
public class RunInBuiltPluginTest {
}
