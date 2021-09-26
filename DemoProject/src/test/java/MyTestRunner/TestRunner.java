package MyTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/ANZSampleDemo.feature",
glue= {"stepDefination", "Hooks"},
//dryRun=true,
monochrome=true,
plugin= {"pretty"})
public class TestRunner {

}
