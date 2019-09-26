package stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"plugin.CustomPlugin","summary","progress"}, monochrome = true)
public class RunCustomPluginTest {
}
