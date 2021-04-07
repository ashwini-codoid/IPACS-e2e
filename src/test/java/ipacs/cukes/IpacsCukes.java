package ipacs.cukes;

import cap.helpers.Constants;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.Platform;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;


@CucumberOptions(features = {"src/test/resources/features/ipacs/smoke"},
        monochrome = true,
        tags = {"@NavSmoke"},
        glue = {"ipacs"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:",
                "pretty", "html:target/cucumber-report/",
                "json:target/cucumber-report/cucumber.json",
                "rerun:target/cucumber-report/rerun.txt"})

public class IpacsCukes extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setup() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath(System.getProperty("user.dir") + "/reports/report.html");
    }

    @AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("config/extent-config.xml"));
        Reporter.setSystemInfo("User", System.getProperty("user.name"));
        Reporter.setSystemInfo("Source Machine os", Platform.getCurrent().name());
        Reporter.setSystemInfo("Build Version", "0.0.1");
        Reporter.setSystemInfo("Automation Version", "1.0");
        Reporter.setSystemInfo("Browser", System.getProperty(Constants.ENV_VARIABLE_BROWSER_NAME));
        Reporter.setSystemInfo("Execution Type", System.getProperty("execution_type"));

    }
}
