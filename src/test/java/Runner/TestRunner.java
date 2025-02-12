package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDef", "Hooks"},
        monochrome = true,
        //tags ="@WebValidation or @MobileValidation",
        plugin = {"pretty", "html:target/report/cucumber_htmlRepo.html",
                "pretty", "json:target/report/cucumber_jsonRepo.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
