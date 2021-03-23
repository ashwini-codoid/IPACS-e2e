package iconnect;

import cap.utilities.DateUtil;
import cap.utilities.SharedDriver;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import iconnect.pages.IconnectLoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import iconnect.pages.IconnectHomePage;
import java.io.File;
import java.io.IOException;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class IconnectPageContainer {
    private WebDriver driver;
    public IconnectLoginPage iconnectLoginPage;
    public IconnectHomePage iconnectHomePage;

    public IconnectPageContainer() {
        driver = SharedDriver.getDriver();
        initPages();
    }

    private void initPages() {
        iconnectLoginPage = new IconnectLoginPage(driver);
        iconnectHomePage = new IconnectHomePage(driver);
    }

    @Before
    public void beforeScenario(Scenario scenario1) {
        System.out.println(scenario1.getName());
    }

    @After("~@mobile")
    public void afterScenario(Scenario scenario) {
        if (driver == null) {
        } else {
            String strFilePath = Reporter.getExtentHtmlReport().config().getFilePath().replace("report.html", "");
            String strReportDir = System.getProperty("user.dir") + "/reports";
            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                //This takes a screenshot from the driver at save it to the specified location
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                //Building up the destination path for the screenshot to save
                //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
                String strDestinationPath = System.getProperty("user.dir") + "/reports/images/" + screenshotName + ".png";
                //Copy taken screenshot from source location to destination location
                FileUtils.copyFile(sourcePath, new File(strFilePath + "/images/" + screenshotName + DateUtil.getCurrentDate("dd-MM-yyyy-HH-mm-ss-sss") + ".png"));
                //This attach the specified screenshot to the test
                Reporter.addScreenCaptureFromPath("images/" + screenshotName + DateUtil.getCurrentDate("dd-MM-yyyy-HH-mm-ss-sss") + ".png");
            } catch (IOException e) {
            }
            System.out.println("\n scenario Name: : " + scenario.getName());
            System.out.println("\n scenario Status: " + scenario.getStatus());
        }

    }

}
