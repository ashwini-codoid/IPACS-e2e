package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ICMVendorMgmtPage extends BasePage {

    public ICMVendorMgmtPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Vendor Management']")
    protected WebElement elmntVendorMgmtSubModule;

    @FindBy(how = How.XPATH, using = "(//a[text()='View Master List'])[4]")
    protected WebElement elmntViewMasterListVendorMgmt;

    @FindBy(how = How.CSS, using = "td[class='dataTables_empty']")
    protected WebElement tblValueViewMasterListVendorMgmt;

    @FindBy(how = How.XPATH, using = "(//a[text()='Add Vendor'])[1]")
    protected WebElement elmntAddVendor;

    @FindBy(how = How.CSS, using = "#name")
    protected WebElement txtVendorNameAddVendor;

    @FindBy(how = How.CSS, using = "#documentationLink")
    protected WebElement elmntDocAddVendor;

    @FindBy(how = How.CSS, using = "#vendorName")
    protected WebElement txtVendorNameDocAddVendor;

    @FindBy(how = How.XPATH, using = "(//a[text()='Add Vendor Category'])[1]")
    protected WebElement elmntAddVendorCategory;

    @FindBy(how = How.CSS, using = "#name")
    protected WebElement txtEnterVendorCategoryNameAddVendor;


    public boolean verifyVendorMgmtSubModule() {
        waitForElement(elmntVendorMgmtSubModule);
        return verifyElement(elmntVendorMgmtSubModule);
    }

    public void clickViewMasterListVendorMgmt() {
        click(waitForElement(elmntViewMasterListVendorMgmt));
    }

    public boolean verifyViewMasterListVendorMgmt() {
        waitForElement(tblValueViewMasterListVendorMgmt);
        return verifyElement(tblValueViewMasterListVendorMgmt);
    }

    public void clickAddVendorVendorMgmt() {
        click(waitForElement(elmntAddVendor));
    }

    public boolean verifyAddVendorVendorMgmt() {
        waitForElement(txtVendorNameAddVendor);
        return verifyElement(txtVendorNameAddVendor);
    }

    public void clickDocVendorMgmt() {
        click(waitForElement(elmntDocAddVendor));
    }

    public boolean verifyDocVendorMgmt() {
        waitForElement(txtVendorNameDocAddVendor);
        return verifyElement(txtVendorNameDocAddVendor);
    }

    public void clickAddVendorCategoryVendorMgmt() {
        click(waitForElement(elmntAddVendorCategory));
    }

    public boolean verifyAddVendorCategoryVendorMgmt() {
        waitForElement(txtEnterVendorCategoryNameAddVendor);
        return verifyElement(txtEnterVendorCategoryNameAddVendor);
    }

}
