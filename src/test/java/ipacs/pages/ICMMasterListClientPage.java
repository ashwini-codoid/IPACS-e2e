package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ICMMasterListClientPage extends BasePage {

    public ICMMasterListClientPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Home']]")
    protected WebElement tabHomeSectionICM;

    @FindBy(how = How.XPATH, using = "//li[text()='Master List - Clients']")
    protected WebElement elmntMasterListClientSubModule;

    @FindBy(how = How.XPATH, using = "(//a[text()='View Master List'])[3]")
    protected WebElement elmntViewMasterList;

    @FindBy(how = How.XPATH, using = "//h1[text()[normalize-space()='Master List - Clients']]")
    protected WebElement txtMasterListClient;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Network Client']")
    protected WebElement elmntAddNetworkClient;

    @FindBy(how = How.XPATH, using = "//h1[text()='Add Network Client']")
    protected WebElement txtAddNetworkClient;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Client / Direct Placer']")
    protected WebElement elmntAddClientDirectPlacer;

    @FindBy(how = How.XPATH, using = "//h1[text()[normalize-space()='Add Client / Direct Placer']]")
    protected WebElement txtAddClientDirectPlacer;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Risk Factor']")
    protected WebElement elmntAddRiskFactor;

    @FindBy(how = How.XPATH, using = "//h1[text()[normalize-space()='Add Risk Factor']]")
    protected WebElement txtAddRiskFactor;

    public void clickHomeSectionICM() {
        click(waitForElement(tabHomeSectionICM));
    }

    public boolean verifyMasterListClientSubModule() {
        waitForElement(elmntMasterListClientSubModule);
        return verifyElement(elmntMasterListClientSubModule);
    }

    public void clickViewMasterList() {
        click(waitForElement(elmntViewMasterList));
    }

    public boolean verifyViewMasterList() {
        waitForElement(txtMasterListClient);
        return verifyElement(txtMasterListClient);
    }

    public void clickAddNetworkClient() {
        click(waitForElement(elmntAddNetworkClient));
    }

    public boolean verifyAddNetworkClient() {
        waitForElement(txtAddNetworkClient);
        return verifyElement(txtAddNetworkClient);
    }

    public void clickAddClientDirectPlacer() {
        click(waitForElement(elmntAddClientDirectPlacer));
    }

    public boolean verifyAddClientDirectPlacer() {
        waitForElement(txtAddClientDirectPlacer);
        return verifyElement(txtAddClientDirectPlacer);
    }


    public void clickAddRiskFactor() {
        click(waitForElement(elmntAddRiskFactor));
    }

    public boolean verifyAddRiskFactor() {
        waitForElement(txtAddRiskFactor);
        return verifyElement(txtAddRiskFactor);
    }


}