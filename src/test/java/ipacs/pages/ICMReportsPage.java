package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ICMReportsPage extends BasePage {

    public ICMReportsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Reports']")
    protected WebElement elmntReportsSubModule;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Certification']")
    protected WebElement elmntCertification;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space()='View Certification-Reports']")
    protected WebElement txtViewCertificationReports;

    @FindBy(how = How.CSS, using = "#ui-id-1")
    protected WebElement elmntViewCertificationSOP;

    @FindBy(how = How.CSS, using = "#ui-id-3")
    protected WebElement elmntCurrentCertificationSOP;

    @FindBy(how = How.CSS, using = "#ui-id-4")
    protected WebElement elmntExpiredCertificationSOP;

    @FindBy(how = How.CSS, using = "#ui-id-5")
    protected WebElement elmntCertificationHistorySOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Current Certifications']")
    protected WebElement tblValueCurrentCertificationSOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Expired Certifications']")
    protected WebElement tblValueExpiredCertificationSOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Certification History']")
    protected WebElement tblValueCertificationHistorySOP;


    @FindBy(how = How.CSS, using = "#ui-id-2")
    protected WebElement elmntViewCertificationPolicy;

    @FindBy(how = How.CSS, using = "#ui-id-6")
    protected WebElement elmntCurrentCertificationPolicy;

    @FindBy(how = How.CSS, using = "#ui-id-7")
    protected WebElement elmntExpiredCertificationPolicy;

    @FindBy(how = How.CSS, using = "#ui-id-8")
    protected WebElement elmntCertificationHistoryPolicy;

    @FindBy(how = How.XPATH, using = "//a[@id='ui-id-6']")
    protected WebElement tblValueCurrentCertificationPolicy;

    @FindBy(how = How.XPATH, using = "//a[@id='ui-id-7']")
    protected WebElement tblValueExpiredCertificationPolicy;

    @FindBy(how = How.XPATH, using = "//a[@id='ui-id-8']")
    protected WebElement tblValueCertificationHistoryPolicy;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Approval List']")
    protected WebElement elmntApprovalList;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space()='View Approval List-Reports']")
    protected WebElement txtApprovalList;

    @FindBy(how = How.CSS, using = "#SopMain")
    protected WebElement elmntViewApprovalListSOP;

    @FindBy(how = How.CSS, using = "#SopCurrentLink")
    protected WebElement elmntCurrentApprovalListSOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Current Approval List - SOP']")
    protected WebElement tblValueCurrentApprovalListSOP;

    @FindBy(how = How.CSS, using = "#SopHistoryLink")
    protected WebElement elmntApprovalListHistorySOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Approval List History - SOP']")
    protected WebElement tblValueApprovalListHistorySOP;

    @FindBy(how = How.CSS, using = "#PolicyMain")
    protected WebElement elmntViewApprovalListPolicy;

    @FindBy(how = How.CSS, using = "#PolicyCurrentLink")
    protected WebElement elmntCurrentApprovalListPolicy;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Current Approval List - Policy']")
    protected WebElement tblValueCurrentApprovalListPolicy;

    @FindBy(how = How.CSS, using = "#PolicyHistoryLink")
    protected WebElement elmntApprovalListHistoryPolicy;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Approval List History - Policy']")
    protected WebElement tblValueApprovalListHistoryPolicy;

    @FindBy(how = How.CSS, using = "#TestMain")
    protected WebElement elmntViewApprovalListTest;

    @FindBy(how = How.CSS, using = "#TestCurrentLink")
    protected WebElement elmntCurrentApprovalListTest;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Current Approval List - Test']")
    protected WebElement tblValueCurrentApprovalListTest;

    @FindBy(how = How.CSS, using = "#TestHistoryLink")
    protected WebElement elmntApprovalListHistoryTest;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Approval List History - Test']")
    protected WebElement tblValueApprovalListHistoryTest;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Audit Summary Reports']")
    protected WebElement elmntAuditSummaryReports;

    @FindBy(how = How.ID, using = "internalAuditTypeName_chzn")
    protected WebElement txtInternalAuditSummaryReports;

    @FindBy(how = How.CSS, using = "#ui-id-2")
    protected WebElement elmntExternalAuditAuditReport;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Select a Client Name']")
    protected WebElement txtExternalAuditSummaryReports;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Employee Report']")
    protected WebElement elmntEmployeeReport;

    @FindBy(how = How.CSS, using = "#DepttName_chzn")
    protected WebElement ddlChooseDepartmentName;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Employee Test History Report']")
    protected WebElement elmntEmployeeTestHistoryReport;

    @FindBy(how = How.CSS, using = "#UserId_chzn")
    protected WebElement ddlSelectUser;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Company Test History Report']")
    protected WebElement elmntCompanyTestHistoryReport;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space()='Company Test History Report']")
    protected WebElement txtCompanyTestHistoryReport;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Passing Score Test Report']")
    protected WebElement elmntPassingScoreTestReport;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space()='Passing Score Test Report']")
    protected WebElement txtPassingScoreTestReport;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Test Questions & Responses Report']")
    protected WebElement elmntTestQuestionsResponsesReport;

    @FindBy(how = How.CSS, using = "input[value='Select Some Options']")
    protected WebElement txtChooseEmployeeName;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Vendor Document Status Report']")
    protected WebElement elmntVendorDocStatusReport;

    @FindBy(how = How.CSS, using = "#getvendorreports")
    protected WebElement btnVendorDocStatusReport;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Vendor Details Report']")
    protected WebElement elmntVendorDetailsReport;

    @FindBy(how = How.CSS, using = "#getvendorreports")
    protected WebElement btnVendorDetailsReport;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Trend Analysis of Non-Conformities']")
    protected WebElement elmntTrendAnalysisOfNonConformities;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Get Report']")
    protected WebElement btnGetReportTrendAnalysis;




    public boolean verifyReportsSubModule() {
        waitForElement(elmntReportsSubModule);
        return verifyElement(elmntReportsSubModule);
    }


    public void clickCertification() {
        click(waitForElement(elmntCertification));
    }

    public boolean verifyCertificationPage() {
        waitForElement(txtViewCertificationReports);
        return verifyElement(txtViewCertificationReports);
    }


    public void clickSOPCertification() {
        click(waitForElement(elmntViewCertificationSOP));
    }


    public void clickCurrentCertificationSOP() {
        click(waitForElement(elmntCurrentCertificationSOP));
    }

    public boolean verifyCurrentCertificationSOPPage() {
        waitForElement(tblValueCurrentCertificationSOP);
        return verifyElement(tblValueCurrentCertificationSOP);
    }

    public void clickExpiredCertificationSOP() {
        click(waitForElement(elmntExpiredCertificationSOP));
    }

    public boolean verifyExpiredCertificationSOPPage() {
        waitForElement(tblValueExpiredCertificationSOP);
        return verifyElement(tblValueExpiredCertificationSOP);
    }

    public void clickCertificationHistorySOP() {
        click(waitForElement(elmntCertificationHistorySOP));
    }

    public boolean verifyCertificationHistorySOPPage() {
        waitForElement(tblValueCertificationHistorySOP);
        return verifyElement(tblValueCertificationHistorySOP);
    }

    public void clickPolicyCertification() {
        click(waitForElement(elmntViewCertificationPolicy));
    }

    public void clickCurrentCertificationPolicy() {
        click(waitForElement(elmntCurrentCertificationPolicy));
    }

    public boolean verifyCurrentCertificationPolicyPage() {
        waitForElement(tblValueCurrentCertificationPolicy);
        return verifyElement(tblValueCurrentCertificationPolicy);
    }

    public void clickExpiredCertificationPolicy() {
        click(waitForElement(elmntExpiredCertificationPolicy));
    }

    public boolean verifyExpiredCertificationPolicyPage() {
        waitForElement(tblValueExpiredCertificationPolicy);
        return verifyElement(tblValueExpiredCertificationPolicy);
    }

    public void clickCertificationHistoryPolicy() {
        click(waitForElement(elmntCertificationHistoryPolicy));
    }

    public boolean verifyCertificationHistoryPolicyPage() {
        waitForElement(tblValueCertificationHistoryPolicy);
        return verifyElement(tblValueCertificationHistoryPolicy);
    }

    public void clickApprovalList() {
        click(waitForElement(elmntApprovalList));
    }

    public boolean verifyApprovalListPage() {
        waitForElement(txtApprovalList);
        return verifyElement(txtApprovalList);
    }

    public void clickSOPApprovalList() {
        click(waitForElement(elmntViewApprovalListSOP));
    }


    public void clickCurrentApprovalListSOP() {
        click(waitForElement(elmntCurrentApprovalListSOP));
    }

    public boolean verifyCurrentApprovalListSOPPage() {
        waitForElement(tblValueCurrentApprovalListSOP);
        return verifyElement(tblValueCurrentApprovalListSOP);
    }

    public void clickApprovalListHistorySOP() {
        click(waitForElement(elmntApprovalListHistorySOP));
    }

    public boolean verifyApprovalListHistorySOPPage() {
        waitForElement(tblValueApprovalListHistorySOP);
        return verifyElement(tblValueApprovalListHistorySOP);
    }


    public void clickPolicyApprovalList() {
        click(waitForElement(elmntViewApprovalListPolicy));
    }


    public void clickCurrentApprovalListPolicy() {
        click(waitForElement(elmntCurrentApprovalListPolicy));
    }

    public boolean verifyCurrentApprovalListPolicyPage() {
        waitForElement(tblValueCurrentApprovalListPolicy);
        return verifyElement(tblValueCurrentApprovalListPolicy);
    }

    public void clickApprovalListHistoryPolicy() {
        click(waitForElement(elmntApprovalListHistoryPolicy));
    }

    public boolean verifyApprovalListHistoryPolicyPage() {
        waitForElement(tblValueApprovalListHistoryPolicy);
        return verifyElement(tblValueApprovalListHistoryPolicy);
    }


    public void clickTestApprovalList() {
        click(waitForElement(elmntViewApprovalListTest));
    }


    public void clickCurrentApprovalListTest() {
        click(waitForElement(elmntCurrentApprovalListTest));
    }

    public boolean verifyCurrentApprovalListTestPage() {
        waitForElement(tblValueCurrentApprovalListTest);
        return verifyElement(tblValueCurrentApprovalListTest);
    }

    public void clickApprovalListHistoryTest() {
        click(waitForElement(elmntApprovalListHistoryTest));
    }

    public boolean verifyApprovalListHistoryTestPage() {
        waitForElement(tblValueApprovalListHistoryTest);
        return verifyElement(tblValueApprovalListHistoryTest);
    }


    public void clickAuditSummaryReports() {
        click(waitForElement(elmntAuditSummaryReports));
    }

    public boolean verifyInternalAuditSummaryReportsPage() {
        waitForElement(txtInternalAuditSummaryReports);
        return verifyElement(txtInternalAuditSummaryReports);
    }

    public void clickExternalAuditAuditReport() {
        click(waitForElement(elmntExternalAuditAuditReport));
    }

    public boolean verifyExternalAuditSummaryReportsPage() {
        waitForElement(txtExternalAuditSummaryReports);
        return verifyElement(txtExternalAuditSummaryReports);
    }

    public void clickEmployeeReport() {
        click(waitForElement(elmntEmployeeReport));
    }

    public boolean verifyEmployeeReportPage() {
        waitForElement(ddlChooseDepartmentName);
        return verifyElement(ddlChooseDepartmentName);
    }

    public void clickEmployeeTestHistoryReport() {
        click(waitForElement(elmntEmployeeTestHistoryReport));
    }

    public boolean verifyEmployeeTestHistoryReportPage() {
        waitForElement(ddlSelectUser);
        return verifyElement(ddlSelectUser);
    }

    public void clickCompanyTestHistoryReport() {
        click(waitForElement(elmntCompanyTestHistoryReport));
    }

    public boolean verifyCompanyTestHistoryReportPage() {
        waitForElement(txtCompanyTestHistoryReport);
        return verifyElement(txtCompanyTestHistoryReport);
    }

    public void clickPassingScoreTestReport() {
        click(waitForElement(elmntReportsSubModule));
        jsScrollDown();
        click(waitForElement(elmntPassingScoreTestReport));
    }

    public boolean verifyPassingScoreTestReportPage() {
        waitForElement(txtPassingScoreTestReport);
        return verifyElement(txtPassingScoreTestReport);
    }

    public void clickTestQuestionsResponsesReport() {
        click(waitForElement(elmntReportsSubModule));
        jsScrollDown();
        click(waitForElement(elmntTestQuestionsResponsesReport));
    }

    public boolean verifyTestQuestionsResponsesReportPage() {
        waitForElement(txtChooseEmployeeName);
        return verifyElement(txtChooseEmployeeName);
    }

    public void clickVendorDocStatusReport() {
        click(waitForElement(elmntReportsSubModule));
        jsScrollDown();
        click(waitForElement(elmntVendorDocStatusReport));
    }

    public boolean verifyVendorDocStatusReportPage() {
        waitForElement(btnVendorDocStatusReport);
        return verifyElement(btnVendorDocStatusReport);
    }

    public void clickVendorDetailsReport() {
        click(waitForElement(elmntReportsSubModule));
        jsScrollDown();
        click(waitForElement(elmntVendorDetailsReport));
    }

    public boolean verifyVendorDetailsReportPage() {
        waitForElement(btnVendorDetailsReport);
        return verifyElement(btnVendorDetailsReport);
    }

    public void clickTrendAnalysisOfNonConformities() {
        click(waitForElement(elmntReportsSubModule));
        jsScrollDown();
        click(waitForElement(elmntTrendAnalysisOfNonConformities));
    }

    public boolean verifyTrendAnalysisOfNonConformitiesPage() {
        waitForElement(btnGetReportTrendAnalysis);
        return verifyElement(btnGetReportTrendAnalysis);
    }

}