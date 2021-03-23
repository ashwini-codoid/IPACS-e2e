package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ICMAssignSopPoliciesPage extends BasePage {

    public ICMAssignSopPoliciesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//li[text()='Assign SOPs / Policies']")
    protected WebElement elmntAssignSOPPoliciesSubModule;

    @FindBy(how = How.XPATH, using = "//a[text()='Assign SOPs / Policies']")
    protected WebElement elmntAssignSOPPolicies;

    @FindBy(how = How.ID, using = "ui-id-1")
    protected WebElement txtAssignUserToSOP;

    @FindBy(how = How.ID, using = "ui-id-2")
    protected WebElement txtAssignUserToPolicy;


    public boolean verifyAssignSOPPoliciesSubModule() {
        waitForElement(elmntAssignSOPPoliciesSubModule);
        return verifyElement(elmntAssignSOPPoliciesSubModule);
    }

    public void clickAssignSOP() {
        click(waitForElement(elmntAssignSOPPolicies));
    }

    public boolean verifyAssignSOPPage() {
        waitForElement(txtAssignUserToSOP);
        return verifyElement(txtAssignUserToSOP);
    }


    public void clickAssignPolicies() {
        click(waitForElement(txtAssignUserToPolicy));
    }

    public boolean verifyAssignPoliciesPage() {
        waitForElement(txtAssignUserToPolicy);
        return verifyElement(txtAssignUserToPolicy);
    }
}