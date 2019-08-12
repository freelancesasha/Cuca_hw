import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.Feature;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"steps.com.ua"},
        plugin = "pretty"
)


public class RunTest {


}

