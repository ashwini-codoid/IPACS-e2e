package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ICMMasterListSOPPage extends BasePage {

    public ICMMasterListSOPPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "(//a[text()='View Master List'])[1]")
    protected WebElement btnViewMasterListSOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Master List - SOPs']")
    protected WebElement btnwMasterListSOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Add Department']")
    protected WebElement btnAddDeptMasterListSOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Add Function']")
    protected WebElement btnAddFuncMasterListSOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Add Process']")
    protected WebElement btnAddProcessMasterListSOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Add SOP']")
    protected WebElement btnAddSOPMasterListSOP;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Automated Shell Creation']")
    protected WebElement btnAutoShellMasterListSOP;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Master List - SOPs']")
    protected WebElement txaMasterListSOPInSOP;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Add Department']")
    protected WebElement txaAddDeptInMasterSOP;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Add Function']")
    protected WebElement txaAddFuncInMasterSOP;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Add Process']")
    protected WebElement txaAddProcessInMasterSOP;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Add SOP']")
    protected WebElement txaAddSOPInMasterSOP;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Automated Shell Creation']")
    protected WebElement txaAutoShellSOPInMasterSOP;

    public void clickMasterListSOP() {
        click(btnwMasterListSOP);
    }

    public boolean verifyViewMasterListSOPs() {
        click(btnViewMasterListSOP);
        return verifyElement(txaMasterListSOPInSOP);

    }

    public boolean verifyAddDepartmentInMasterListSOP() {
        click(btnAddDeptMasterListSOP);
        waitForElement(txaAddDeptInMasterSOP);
        return verifyElement(txaAddDeptInMasterSOP);

    }

    public boolean verifyAddFunctionInMasterListSOP() {
        click(btnAddFuncMasterListSOP);
        waitForElement(txaAddFuncInMasterSOP);
        return verifyElement(txaAddFuncInMasterSOP);
    }

    public boolean verifyAddProcessInMasterListSOP() {
        click(btnAddProcessMasterListSOP);
        waitForElement(txaAddProcessInMasterSOP);
        return verifyElement(txaAddProcessInMasterSOP);
    }

    public boolean verifyAddSOPInMasterListSOP() {
        click(btnAddSOPMasterListSOP);
        waitForElement(txaAddSOPInMasterSOP);
        return verifyElement(txaAddSOPInMasterSOP);
    }

    public boolean verifyAutomatedShellCreationInMasterListSOP() {
        click(btnAutoShellMasterListSOP);
        waitForElement(txaAutoShellSOPInMasterSOP);
        return verifyElement(txaAutoShellSOPInMasterSOP);
    }
}