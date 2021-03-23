package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ICMDocumentsPage extends BasePage {

    public ICMDocumentsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//li[text()='Documents']")
    protected WebElement elmntDocSubModule;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Document - SOP']")
    protected WebElement elmntAddDocSOP;

    @FindBy(how = How.XPATH, using = "//h1[text()='Add Document - SOP']")
    protected WebElement txtAddDocSOP;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Document - Attachment']")
    protected WebElement AddDocAttachment;

    @FindBy(how = How.XPATH, using = "//a[text()='Attachment at SOP']")
    protected WebElement txtAttachmentAtSOP;

    @FindBy(how = How.ID, using = "ui-id-2")
    protected WebElement txtAttachmentAtPolicy;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Document - Policy']")
    protected WebElement elmntAddDocPolicy;

    @FindBy(how = How.XPATH, using = "//h1[text()='Add Document - Policy']")
    protected WebElement txtAddPolicy;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Document - Client Manual']")
    protected WebElement elmntAddDocClientManual;

    @FindBy(how = How.XPATH, using = "//h1[text()='Add Document - Client Manual']")
    protected WebElement txtAddDocClientManual;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Cover Page, Header & Footer']")
    protected WebElement elmntAddCoverPageHeaderFooter;

    @FindBy(how = How.ID, using = "ui-id-1")
    protected WebElement txtCoverPage;

    @FindBy(how = How.ID, using = "ui-id-2")
    protected WebElement txtHeaderFooter;

    @FindBy(how = How.XPATH, using = "//a[text()='View Approval List']")
    protected WebElement elmntViewApprovalList;

    @FindBy(how = How.XPATH, using = "//h1[text()='View Approval List']")
    protected WebElement txtViewApprovalList;

    @FindBy(how = How.XPATH, using = "//a[text()='Document Dashboard']")
    protected WebElement elmntDocDashboard;

    @FindBy(how = How.XPATH, using = "//a[text()='Remove']")
    protected WebElement btnRemove;

    @FindBy(how = How.XPATH, using = "//a[text()='Document Repository']")
    protected WebElement elmntDocRepository;

    @FindBy(how = How.XPATH, using = "//h1[text()='Document Repository']")
    protected WebElement txtDocRepository;

    @FindBy(how = How.XPATH, using = "//a[text()='Mass Download']")
    protected WebElement elmntMassDownload;

    @FindBy(how = How.ID, using = "ui-id-1")
    protected WebElement txtSOPMassDownload;

    @FindBy(how = How.ID, using = "ui-id-2")
    protected WebElement txtPolicyMassDownload;

    @FindBy(how = How.ID, using = "ui-id-3")
    protected WebElement txtVendorDocMassDownload;



    public boolean verifyDocSubModule() {
        waitForElement(elmntDocSubModule);
        return verifyElement(elmntDocSubModule);
    }

    public void clickAddDocSOP() {
        click(waitForElement(elmntAddDocSOP));
    }

    public boolean verifyAddDocumentSOPPage() {
        waitForElement(txtAddDocSOP);
        return verifyElement(txtAddDocSOP);
    }

    public void clickAddDocAttachment() {
        click(waitForElement(AddDocAttachment));
    }

    public boolean verifyAttachmentAtSOP() {
        waitForElement(txtAttachmentAtSOP);
        return verifyElement(txtAttachmentAtSOP);
    }

    public void clickAttachmentAtPolicy() {
        click(waitForElement(txtAttachmentAtPolicy));
    }


    public boolean verifyAttachmentAtPolicy() {
        waitForElement(txtAttachmentAtPolicy);
        return verifyElement(txtAttachmentAtPolicy);
    }


    public void clickAddDocPolicy() {
        click(waitForElement(elmntAddDocPolicy));
    }

    public boolean verifyAddDocPolicyPage() {
        waitForElement(txtAddPolicy);
        return verifyElement(txtAddPolicy);
    }


    public void clickAddDocClientManual() {
        click(waitForElement(elmntAddDocClientManual));
    }

    public boolean verifyAddDocClientManualPage() {
        waitForElement(txtAddDocClientManual);
        return verifyElement(txtAddDocClientManual);
    }


    public void clickAddCoverPage() {
        click(waitForElement(elmntAddCoverPageHeaderFooter));
    }

    public boolean verifyAddCoverPage() {
        waitForElement(txtCoverPage);
        return verifyElement(txtCoverPage);
    }

    public void clickAddHeaderFooter() {
        click(waitForElement(txtHeaderFooter));
    }

    public boolean verifyAddHeaderFooterPage() {
        waitForElement(txtHeaderFooter);
        return verifyElement(txtHeaderFooter);
    }

    public void clickApprovalList() {
        click(waitForElement(elmntViewApprovalList));
    }

    public boolean verifyApprovalListPage() {
        waitForElement(txtViewApprovalList);
        return verifyElement(txtViewApprovalList);
    }


    public void clickDocDashboard() {
        click(waitForElement(elmntDocDashboard));
    }

    public boolean verifyDocDashboardPage() {
        waitForElement(btnRemove);
        return verifyElement(btnRemove);
    }

    public void clickDocRepository() {
        click(waitForElement(elmntDocRepository));
    }

    public boolean verifyDocRepositoryPage() {
        waitForElement(txtDocRepository);
        return verifyElement(txtDocRepository);
    }

    public void clickMassDownload() {
        click(waitForElement(elmntMassDownload));
    }

    public boolean verifyMassDownloadSOPPage() {
        waitForElement(txtSOPMassDownload);
        return verifyElement(txtSOPMassDownload);
    }

    public void clickMassDownloadPolicy() {
        click(waitForElement(txtPolicyMassDownload));
    }

    public boolean verifyMassDownloadPolicyPage() {
        waitForElement(txtPolicyMassDownload);
        return verifyElement(txtPolicyMassDownload);
    }


    public void clickMassDownloadVendorDocument() {
        click(waitForElement(txtVendorDocMassDownload));
    }

    public boolean verifyMassDownloadVendorDocPage() {
        waitForElement(txtVendorDocMassDownload);
        return verifyElement(txtVendorDocMassDownload);
    }
}