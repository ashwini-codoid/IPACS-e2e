package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ICMBCPMgmtPage extends BasePage {

    public ICMBCPMgmtPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//li[text()='BCP Management ']")
    protected WebElement elmntBCPManagementSubModule;

    @FindBy(how = How.XPATH, using = "//li[text()='BCP Management ']//following::a[text()='View Master List']")
    protected WebElement elmntViewMasterList;

    @FindBy(how = How.XPATH, using = "//h1[text()=' Master List - Business Continuity Plan ']")
    protected WebElement btnViewMasterList;



    public boolean verifyBCPManagementSectionICM() {
        waitForElement(elmntBCPManagementSubModule);
        return verifyElement(elmntBCPManagementSubModule);
    }
    public void clickViewMasterList() {

        click(waitForElement(elmntViewMasterList));
    }

    public boolean verifyViewMasterList() {
        waitForElement(btnViewMasterList);
        return verifyElement(btnViewMasterList);
    }
}