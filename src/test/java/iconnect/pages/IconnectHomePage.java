package iconnect.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IconnectHomePage extends BasePage {

    public IconnectHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[@id='dv_DashboardPartial']")
    protected WebElement elmntDashboard;

    @FindBy(how = How.XPATH, using = "//span[text()='Workspace']")
    protected WebElement btnWorkspace;

    @FindBy(how = How.XPATH, using = "//a[text()='Campaign']")
    protected WebElement btnCampaign;

    @FindBy(how = How.XPATH, using = "//input[@value='6']")
    protected WebElement btnSMS;

    @FindBy(how = How.ID, using = "btncontinue")
    protected WebElement btnContinue;

    @FindBy(how = How.XPATH, using = "//a[text()='@ConsumerFirstName']")
    protected WebElement labelCampaignDataTag;

    @FindBy(how = How.ID, using = "btnsaveTemplate")
    protected WebElement btnSaveCampaignTemplate;

    @FindBy(how = How.CSS, using = ".toast-message")
    protected WebElement alertCampaignErrorMsg;



    public boolean verifyIconnectHomePage() {
        waitForElement(elmntDashboard);
        return verifyElement(elmntDashboard);
    }

    public void clickCampaignSection() {
        click(waitForElement(btnWorkspace));
        click(waitForElement(btnCampaign));
    }

    public void clickSMSRadioBtn() {
        click(waitForElement(btnSMS));
        click(waitForElement(btnContinue));
    }

    public void addCampaignDataTag() {
        click(waitForElement(labelCampaignDataTag));
        click(waitForElement(btnSaveCampaignTemplate));
    }

    public boolean verifyCampaignNameErrorMsg() {
        waitForElement(alertCampaignErrorMsg);
        return verifyElement(alertCampaignErrorMsg);
    }
}