package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ICMMasterListPoliciesPage extends BasePage {

    public ICMMasterListPoliciesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "(//a[text()='View Master List'])[2]")
    protected WebElement btnViewMasterListPolicies;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Policy']")
    protected WebElement btnAddPolicyInMasterListPolicies;

    @FindBy(how = How.XPATH, using = "//a[text()='Add Sub Policy']")
    protected WebElement btnAddSubPolicyInMasterListPolicies;

    @FindBy(how = How.XPATH, using = "(//a[text()='Automated Shell Creation'])[2]")
    protected WebElement btnAutoShellInMasterListPolicies;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Master List - Policies']")
    protected WebElement txaMasterListPolicy;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Add Policy']")
    protected WebElement txaAddPolicyInMasterListPolicy;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Add Sub Policy']")
    protected WebElement txaAddSubPolicyInMasterListPolicy;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space(.)='Automated Shell Creation']")
    protected WebElement txaAutoShellPolicyInMasterListPolicy;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Master List - Policies']")
    protected WebElement btnMasterListPolicies;

    public void clickMasterListPolicies(){
        click(btnMasterListPolicies);
    }

    public boolean verifyViewMasterListInPolicies(){
        click(btnViewMasterListPolicies);
        waitForElement(txaMasterListPolicy);
        return verifyElement(txaMasterListPolicy);
    }

    public boolean verifyAddPolicyInMasterListPolicies(){
        click(btnAddPolicyInMasterListPolicies);
        waitForElement(txaAddPolicyInMasterListPolicy);
        return verifyElement(txaAddPolicyInMasterListPolicy);

    }

    public boolean verifyAddSubPolicyInMasterListPolicies(){
        click(btnAddSubPolicyInMasterListPolicies);
        waitForElement(txaAddSubPolicyInMasterListPolicy);
        return verifyElement(txaAddSubPolicyInMasterListPolicy);

    }

    public boolean verifyAutomatedShellCreationInMasterListPolicies(){
        click(btnAutoShellInMasterListPolicies);
        waitForElement(txaAutoShellPolicyInMasterListPolicy);
        return verifyElement(txaAutoShellPolicyInMasterListPolicy);
    }

}