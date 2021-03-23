package ipacs;

import cap.utilities.DateUtil;
import cap.utilities.SharedDriver;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import ipacs.pages.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class IpacsPageContainer {
    private WebDriver driver;
    public ICMLoginPage icmLoginPage;
    public ICMHomePage icmHomePage;
    public ICMAdminPage icmAdminPage;
    public ICMAssignSopPoliciesPage icmAssignSopPoliciesPage;
    public ICMAuditCompliancePage icmAuditCompliancePage;
    public ICMBCPMgmtPage icmBCPMgmtPage;
    public ICMCompanyProfilePage icmCompanyProfilePage;
    public ICMComplaintDisputeMgmtPage icmComplaintDisputeMgmtPage;
    public ICMDocumentsPage icmDocumentsPage;
    public ICMEmployeeTrainingPage icmEmployeeTrainingPage;
    public ICMMasterListClientPage icmMasterListClientPage;
    public ICMMasterListPoliciesPage icmMasterListPoliciesPage;
    public ICMMasterListSOPPage icmMasterListSOPPage;
    public ICMMasterListVendorsPage icmMasterListVendorsPage;
    public ICMReportsPage icmReportsPage;
    public ICMVendorMgmtPage icmVendorMgmtPage;

    public IpacsPageContainer() {
        driver = SharedDriver.getDriver();
        initPages();
    }

    private void initPages() {
        icmLoginPage = new ICMLoginPage(driver);
        icmHomePage = new ICMHomePage(driver);
        icmAdminPage = new ICMAdminPage(driver);
        icmAssignSopPoliciesPage = new ICMAssignSopPoliciesPage(driver);
        icmAuditCompliancePage = new ICMAuditCompliancePage(driver);
        icmBCPMgmtPage = new ICMBCPMgmtPage(driver);
        icmCompanyProfilePage = new ICMCompanyProfilePage(driver);
        icmComplaintDisputeMgmtPage = new ICMComplaintDisputeMgmtPage(driver);
        icmDocumentsPage = new ICMDocumentsPage(driver);
        icmEmployeeTrainingPage = new ICMEmployeeTrainingPage(driver);
        icmMasterListClientPage = new ICMMasterListClientPage(driver);
        icmMasterListPoliciesPage = new ICMMasterListPoliciesPage(driver);
        icmMasterListSOPPage = new ICMMasterListSOPPage(driver);
        icmMasterListVendorsPage = new ICMMasterListVendorsPage(driver);
        icmReportsPage = new ICMReportsPage(driver);
        icmVendorMgmtPage = new ICMVendorMgmtPage(driver);

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
