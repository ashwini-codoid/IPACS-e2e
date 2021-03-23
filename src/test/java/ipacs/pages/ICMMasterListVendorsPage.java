package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ICMMasterListVendorsPage extends BasePage {

    public ICMMasterListVendorsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//li[text()='Master List - Vendors']")
    protected WebElement elmntMasterListVendorsSubModule;

    @FindBy(how = How.XPATH, using = "//li[text()='Master List - Vendors']//following::a[text()='View Master List']")
    protected WebElement elmntViewMasterList;

    @FindBy(how = How.XPATH, using = "//h1[text()[normalize-space()='Master List-Vendor']]")
    protected WebElement btnViewMasterList;


    @FindBy(how = How.XPATH, using = "//li[text()='Master List - Vendors']//following::a[text()='Add Vendor']")
    protected WebElement elmntAddVendor;

    @FindBy(how = How.ID, using = "btn1")
    protected WebElement btnAddVendor;

    @FindBy(how = How.XPATH, using = "//li[text()='Master List - Vendors']//following::a[text()='Add Vendor Category']")
    protected WebElement elmntAddVendorCategory;

    @FindBy(how = How.ID, using = "btn2")
    protected WebElement btnAddVendorCategory;


    public boolean verifyMasterListVendorsSubModule() {
        waitForElement(elmntMasterListVendorsSubModule);
        return verifyElement(elmntMasterListVendorsSubModule);
    }

    public void clickViewMasterList() {

        click(waitForElement(elmntViewMasterList));
    }

    public boolean verifyViewMasterList() {
        waitForElement(btnViewMasterList);
        return verifyElement(btnViewMasterList);
    }
    public void clickAddVendor() {

        click(waitForElement(elmntAddVendor));
    }

    public boolean verifyAddVendor() {
        waitForElement(btnAddVendor);
        return verifyElement(btnAddVendor);
    }
    public void clickAddVendorCategory() {

        click(waitForElement(elmntAddVendorCategory));
    }

    public boolean verifyAddVendorCategory() {
        waitForElement(btnAddVendorCategory);
        return verifyElement(btnAddVendorCategory);
    }
}