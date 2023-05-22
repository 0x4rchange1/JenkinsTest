

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/mk/eclipse-workspace/Irctc-project/src/main/java/bdd/petstore.feature", glue = {
		"bdd_bindings" })
public class Runner extends AbstractTestNGCucumberTests{

}
