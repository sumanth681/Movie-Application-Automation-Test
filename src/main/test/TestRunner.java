import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "src/main/resources/Features")

public class TestRunner extends AbstractTestNGCucumberTests {
}
