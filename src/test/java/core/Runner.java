package core;


import io.cucumber.gherkin.internal.com.eclipsesource.json.Json;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Feature",
        glue= {"steps"},
        plugin = { "pretty", "html:target/cucumber-reports", "Json:target/cucumber.json" },
        monochrome = true
)


public class Runner {
}
