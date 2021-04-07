package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ICMComplaintDisputeMgmtPage extends BasePage {

    public ICMComplaintDisputeMgmtPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//li[text()='Complaints/Disputes Mgmt']")
    protected WebElement elmntComplaintsDisputesMgmtSubModule;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Complaint']")
    protected WebElement elmntAddComplaint;

    @FindBy(how = How.ID, using = "btnAddComplaint")
    protected WebElement btnAddComplaint;

    @FindBy(how = How.XPATH, using = "//a[text()='Complaints/Disputes Log']")
    protected WebElement elmntComplaintsDisputesLog;

    @FindBy(how = How.XPATH, using = "//a[text()='COMPLAINTS/DISPUTES LOG']")
    protected WebElement btnComplaintsDisputesLog;

    @FindBy(how = How.XPATH, using = "//a[text()='IMPORTED RECORDS']")
    protected WebElement elmntImportedRecords;

    @FindBy(how = How.XPATH, using = " //th[text()=' complaint Log History Id']")
    protected WebElement txtImportedRecords;

    @FindBy(how = How.XPATH, using = "//a[text()='Client Specific Complaint Log']")
    protected WebElement elmntClientSpecificLog;

    @FindBy(how = How.ID, using = "btnViewClientSpecificComplaintLog")
    protected WebElement btnClientSpecificLog ;

    @FindBy(how = How.XPATH, using = " //a[text()='Add/Edit Template ']")
    protected WebElement elmntAddEditTemplate;

    @FindBy(how = How.XPATH, using = "//div[text()='Edit Existing Template']")
    protected WebElement btnAddEditTemplate ;

    @FindBy(how = How.XPATH, using = "//a[text()='Manage Template']")
    protected WebElement elmntManageTemplate;

    @FindBy(how = How.ID, using = "lnkDelteTemplate")
    protected WebElement btnManageTemplate;

    @FindBy(how = How.XPATH, using = "//a[text()='Client Specific Complaint Instructions']")
    protected WebElement elmntClientSpecificComplaintInstructions;

    @FindBy(how = How.ID, using = "saveClientSpecificComplaintInstruction")
    protected WebElement btnClientSpecificComplaintInstructions;

    @FindBy(how = How.XPATH, using = " //a[text()='Import Complaints/Disputes']")
    protected WebElement elmntImportComplaintsDisputes;

    @FindBy(how = How.ID, using = "btnsorexcel")
    protected WebElement btnImportComplaintsDisputes;

    @FindBy(how = How.XPATH, using = "//a[text()='Complaint/Dispute Log Set Up']")
    protected WebElement elmntComplaintDisputeLogSetUp;

    @FindBy(how = How.ID, using = "CompliantLog_link")
    protected WebElement tabComplaintsDisputesMgmtSectionICM;

    @FindBy(how = How.ID, using = "savedtemplateattributebtn")
    protected WebElement btnComplaintDisputeLogSetUp;

    @FindBy(how = How.XPATH, using = "//a[text()='Classify Step 1 Attribute']")
    protected WebElement elmntClassifyStepOneAttribute;

    @FindBy(how = How.ID, using = "savedClassifyattributebtn")
    protected WebElement btnClassifyStepOneAttribute;

    @FindBy(how = How.XPATH, using = "//a[text()='CCP Attribute']")
    protected WebElement elmntCcpAttribute;

    @FindBy(how = How.ID, using = "closeCCPAccessBlockerPopUp")
    protected WebElement btnCcpAttribute;


    public boolean verifyComplaintsDisputesMgmtSubModule() {
        waitForElement(elmntComplaintsDisputesMgmtSubModule);
        return verifyElement(elmntComplaintsDisputesMgmtSubModule);
    }

    public void clickAddComplaint() {
        click(waitForElement(elmntAddComplaint));
    }
    public boolean verifyAddComplaint() {
        waitForElement(btnAddComplaint);
        return verifyElement(btnAddComplaint);
    }

    public void clickComplaintsDisputesLog() {
        click(waitForElement(elmntComplaintsDisputesLog));
    }
    public boolean verifyComplaintsDisputesLog() {
        waitForElement(btnComplaintsDisputesLog);
        return verifyElement(btnComplaintsDisputesLog);
    }

    public void clickImportedRecords() {
        click(waitForElement(elmntImportedRecords));
    }
    public boolean verifyImportedRecords() {
        waitForElement(txtImportedRecords);
        return verifyElement(txtImportedRecords);
    }
    public void clickClientSpecificLog() {
        click(waitForElement(elmntClientSpecificLog));
    }
    public boolean verifyClientSpecificLog() {
        waitForElement(btnClientSpecificLog);
        return verifyElement(btnClientSpecificLog);
    }
    public void clickAddEditTemplate() {
        click(waitForElement(elmntAddEditTemplate));
    }
    public boolean verifyAddEditTemplate() {
        waitForElement(btnAddEditTemplate);
        return verifyElement(btnAddEditTemplate);
    }
    public void clickManageTemplate() {
        click(waitForElement(elmntManageTemplate));
    }
    public boolean verifyManageTemplate() {
        waitForElement(btnManageTemplate);
        return verifyElement(btnManageTemplate);
    }
    public void clickClientSpecificComplaintInstructions() {
        click(waitForElement( elmntClientSpecificComplaintInstructions));
    }
    public boolean verifyClientSpecificComplaintInstructions() {
        waitForElement(btnClientSpecificComplaintInstructions);
        return verifyElement(btnClientSpecificComplaintInstructions);
    }
    public void clickImportComplaintsDisputes() {
        click(waitForElement(elmntImportComplaintsDisputes));
    }

    public boolean verifyImportComplaintsDisputes() {
        waitForElement(btnImportComplaintsDisputes);
        return verifyElement(btnImportComplaintsDisputes);
    }
    public void clickComplaintDisputeLogSetUp() {
        click(waitForElement(elmntComplaintDisputeLogSetUp));
    }

    public void clickComplaintsDisputesMgmtSectionICM() {
        jsScrollDown();
        click(waitForElement(tabComplaintsDisputesMgmtSectionICM));
    }
    public boolean verifyComplaintDisputeLogSetUp() {
        waitForElement(btnComplaintDisputeLogSetUp);
        return verifyElement(btnComplaintDisputeLogSetUp);
    }
    public void clickClassifyStepOneAttribute() {
        click(waitForElement(elmntClassifyStepOneAttribute));
    }
    public boolean verifyClassifyStepOneAttribute() {
        waitForElement(btnClassifyStepOneAttribute);
        return verifyElement(btnClassifyStepOneAttribute);
    }
    public void clickCcpAttribute() {
        click(waitForElement(elmntCcpAttribute));
    }
    public boolean verifyCcpAttribute() {
        waitForElement(btnCcpAttribute);
        return verifyElement(btnCcpAttribute);
    }
    public void clickCcpAttributeGoBack() {
        click(waitForElement(btnCcpAttribute));
    }
}