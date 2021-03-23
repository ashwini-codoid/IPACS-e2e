package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ICMAuditCompliancePage extends BasePage {

    public ICMAuditCompliancePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//li/child::a[contains(.,'Internal Audit')]")
    protected WebElement optnInternalAudit;

    @FindBy(how = How.XPATH, using = "//li/child::a[contains(.,'External Audit')]")
    protected WebElement optnExternalAudit;

    @FindBy(how = How.XPATH, using = "//li/child::a[contains(.,'Non-Conformity And Corrective Action')]")
    protected WebElement optnCorrectiveAction;

    @FindBy(how = How.XPATH, using = "//li/child::a[contains(.,'Client Issue')]")
    protected WebElement optnClientIssue;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'Internal Audit')]")
    protected WebElement titleInternalAudit;

    @FindBy(how = How.XPATH, using = "//li/child::a[@id='auditProfileLink']")
    protected WebElement tabAuditProfile;

    @FindBy(how = How.XPATH, using = "//div[@class=\'rightpanel\']/div[@class=\'pageheader\']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.=\'Audit Profile\']")
    protected WebElement tabAuditProfileUnderInternalAudit;

    @FindBy(how = How.XPATH, using = "//li/child::a[@id='auditManagementLink']")
    protected WebElement tabAuditManagement;

    @FindBy(how = How.XPATH, using = "//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Audit Management']")
    protected WebElement tabAuditManagementUnderInternalAudit;

    @FindBy(how = How.XPATH, using = "//li/child::a[@id='auditDocumentsLink']")
    protected WebElement tabAuditDocument;

    @FindBy(how = How.XPATH, using = "//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Audit Documents']")
    protected WebElement tabAuditDocumentUnderInternalAudit;

    @FindBy(how = How.XPATH, using = "//li/child::a[@id='auditScorecardLink']")
    protected WebElement tabScorecardTemplate;

    @FindBy(how = How.XPATH, using = "//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Scorecard Template']")
    protected WebElement tabScorecardTemplateUnderInternalAudit;

    @FindBy(how = How.XPATH, using = "//li/child::a[@id='auditScorecardLinkAudited']")
    protected WebElement tabScorecardAnalysis;

    @FindBy(how = How.XPATH, using = "//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Scorecard Template']")
    protected WebElement tabScorecardAnalysisUnderInternalAudit;


    protected String strOptnDetail = new StringBuilder()
            .append("//li/child::a[contains(.,'")
            .append("<<OPTION>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'External Audit')]" )
    protected WebElement titleExternalAudit;

    @FindBy(how = How.ID, using = "companyDataForAuditLink")
    protected WebElement tabCompanyDataforAudit;

    @FindBy(how = How.XPATH, using = "//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Company data for audit']")
    protected WebElement tabCompanyDataforAuditUnderExternalAudit;

    @FindBy(how = How.ID, using = "clientAuditLink")
    protected WebElement tabClientAudit;

    @FindBy(how = How.XPATH, using = "//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Client audits']")
    protected WebElement tabClientAuditUnderExternalAudit;

    @FindBy(how = How.ID, using = "questionnaireLink")
    protected WebElement tabQuestionnaireTab;

    @FindBy(how = How.XPATH, using = "//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Questionnaire']")
    protected WebElement tabQuestionnaireUnderExternalAudit;

    @FindBy(how = How.ID, using = "auditTypeLink")
    protected WebElement tabAddNewAuditType;

    @FindBy(how = How.XPATH, using ="//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Add New Audit Type']")
    protected WebElement tabAddNewAuditTypeUnderExternalAudit;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'Non-Conformity And Corrective Action')]" )
    protected WebElement titleNonConformityAndCorrectiveAction;

    @FindBy(how = How.ID, using = "ui-id-1")
    protected WebElement tabNonConformityLog;

    @FindBy(how = How.ID, using = "ui-id-2")
    protected WebElement tabAddNonConformityLog;

    @FindBy(how = How.ID, using = "ui-id-3")
    protected WebElement tabCorrectiveAction;

    @FindBy(how = How.XPATH, using ="//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Corrective Action']")
    protected WebElement tabCorrectiveActionUnderNonConformityPage;

    @FindBy(how = How.XPATH, using ="//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Non-Conformity Log']")
    protected WebElement tabNonConformityLogUnderNonConformityPage;

    @FindBy(how = How.XPATH, using ="//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Add Non-Conformity']")
    protected WebElement tabAddNonConformityUnderNonConformityPage;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'Client Issue')]" )
    protected WebElement titleClientIssue;

    @FindBy(how = How.XPATH, using = "//a[.='Client Issue Log']")
    protected WebElement tabClientIssueLog;

    @FindBy(how = How.XPATH, using = "//a[.='Add Client Issue']")
    protected WebElement tabAddClientIssue;

    @FindBy(how = How.XPATH, using ="//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Client Issue Log']")
    protected WebElement tabClientIssueLogUnderClientIssuePage;

    @FindBy(how = How.XPATH, using ="//div[@class='rightpanel']/div[@class='pageheader']/descendant::h1/ancestor::div[2]/following-sibling::div/descendant::li/a[.='Add Client Issue']")
    protected WebElement tabAddClientIssueUnderClientIssuePage;


    public void verifyOptionsInAuditandCompliance()
    {
        waitForElement(optnInternalAudit);
        verifyElement(optnInternalAudit);
        waitForElement(optnExternalAudit);
        verifyElement(optnExternalAudit);
        waitForElement(optnCorrectiveAction);
        verifyElement(optnCorrectiveAction);
        waitForElement(optnClientIssue);
        verifyElement(optnClientIssue);
    }


    public void ClickOptnInAuditAndCompliance(String strOption){
        WebElement optnName = waitForElement(By.xpath(strOptnDetail.replace("<<OPTION>>", strOption)));
        click(optnName);

    }

    public boolean verifyInternalAuditPage()
    {
        return verifyElement(titleInternalAudit);
    }

    public void clickAuditProfileTab()
    {
        waitForElement(tabAuditProfile);
        click(tabAuditProfile);
    }

    public boolean verifyAuditProfileUnderInternalAudit()
    {
        waitForElement(tabAuditProfileUnderInternalAudit);
        return verifyElement(tabAuditProfileUnderInternalAudit);
    }

    public void clickAuditManagementTab()
    {
        waitForElement(tabAuditManagement);
        click(tabAuditManagement);
    }

    public boolean verifyAuditManagementUnderInternalAudit()
    {
        waitForElement(tabAuditManagementUnderInternalAudit);
        return verifyElement(tabAuditManagementUnderInternalAudit);
    }

    public void clickAuditDocumentsTab(){
        waitForElement(tabAuditDocument);
        click(tabAuditDocument);
    }

    public boolean verifyAuditDocumentsUnderInternalAudit()
    {
        waitForElement(tabAuditDocumentUnderInternalAudit);
        return verifyElement(tabAuditDocumentUnderInternalAudit);
    }

    public void clickScorecardTemplateTab(){
        waitForElement(tabScorecardTemplate);
        click(tabScorecardTemplate);
    }

    public boolean verifyScorecardTemplateUnderInternalAudit()
    {
        waitForElement(tabScorecardTemplateUnderInternalAudit);
        return verifyElement(tabScorecardTemplateUnderInternalAudit);
    }

    public void clickScorecardAnalysisTab(){
        waitForElement(tabScorecardAnalysis);
        click(tabScorecardAnalysis);
    }

    public boolean verifyScorecardAnalysisUnderInternalAudit()
    {
        waitForElement(tabScorecardAnalysisUnderInternalAudit);
        return verifyElement(tabScorecardAnalysisUnderInternalAudit);
    }

    public boolean verifyExternalAuditPage()
    {
        return verifyElement(titleExternalAudit);
    }


    public void clickCompanyDataForAuditTab(){
        waitForElement(tabCompanyDataforAudit);
        click(tabCompanyDataforAudit);
    }

    public boolean verifyCompanyDataForAuditUnderExternalAudit()
    {
        waitForElement(tabCompanyDataforAuditUnderExternalAudit);
        return verifyElement(tabCompanyDataforAuditUnderExternalAudit);
    }

    public void clickClientAuditTab(){
        waitForElement(tabClientAudit);
        click(tabClientAudit);
    }

    public boolean verifyClientAuditUnderExternalAudit()
    {
        waitForElement(tabClientAuditUnderExternalAudit);
        return verifyElement(tabClientAuditUnderExternalAudit);
    }

    public void clickQuestionnaireTab(){
        waitForElement(tabQuestionnaireTab);
        click(tabQuestionnaireTab);
    }

    public boolean verifyQuestionnaireUnderExternalAudit()
    {
        waitForElement(tabQuestionnaireUnderExternalAudit);
        return verifyElement(tabQuestionnaireUnderExternalAudit);
    }

    public void clickAddNewAuditType()
    {
        waitForElement(tabAddNewAuditType);
        click(tabAddNewAuditType);
    }

    public boolean verifyAddNewAuditTypeUnderExternalAudit(){
        waitForElement(tabAddNewAuditTypeUnderExternalAudit);
        return verifyElement(tabAddNewAuditTypeUnderExternalAudit);
    }

    public boolean verifyNonConformityAndCorrectiveActionPage()
    {
        return verifyElement(titleNonConformityAndCorrectiveAction);
    }

    public void clickNonConformityLog()
    {
        waitForElement(tabNonConformityLog);
        click(tabNonConformityLog);
    }

    public boolean verifyNonConformityLogUnderNonConformityPage()
    {
        waitForElement(tabNonConformityLogUnderNonConformityPage);
        return verifyElement(tabNonConformityLogUnderNonConformityPage);
    }

    public void clickAddNonConformity()
    {
        waitForElement(tabAddNonConformityLog);
        click(tabAddNonConformityLog);
    }

    public boolean verifyAddNonConformityUnderNonConformityPage()
    {
        waitForElement(tabAddNonConformityUnderNonConformityPage);
        return verifyElement(tabAddNonConformityUnderNonConformityPage);
    }

    public void clickCorrectiveAction()
    {
        waitForElement(tabCorrectiveAction);
        click(tabCorrectiveAction);
    }

    public boolean verifyCorrectiveActionUnderNonConformityPage()
    {
        waitForElement(tabCorrectiveActionUnderNonConformityPage);
        return verifyElement(tabCorrectiveActionUnderNonConformityPage);
    }

    public boolean verifyClientIssuePage(){
        waitForElement(titleClientIssue);
        return verifyElement(titleClientIssue);
    }

    public void clickClientIssueLog(){
        waitForElement(tabClientIssueLog);
        click(tabClientIssueLog);
    }

    public boolean verifyClientIssueLogUnderClientIssuePage(){
        waitForElement(tabClientIssueLogUnderClientIssuePage);
        return verifyElement(tabClientIssueLogUnderClientIssuePage);
    }

    public void clickAddClientIssue()
    {
        waitForElement(tabAddClientIssue);
        click(tabAddClientIssue);
    }

    public boolean verifyAddClientIssueUnderClientIssuePage(){
        waitForElement(tabAddClientIssueUnderClientIssuePage);
        return verifyElement(tabAddClientIssueUnderClientIssuePage);
    }

}