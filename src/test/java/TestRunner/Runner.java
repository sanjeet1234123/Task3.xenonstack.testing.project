package TestRunner;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/xs391-sanjha/IdeaProjects/demo/src/test/java/Features",
        glue="StepDefinition",
        plugin = {"pretty","html:target/HtmlReports/html-report.html"}
)
public class Runner {

}
