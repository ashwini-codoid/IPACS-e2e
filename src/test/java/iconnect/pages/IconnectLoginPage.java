package iconnect.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class IconnectLoginPage extends BasePage {

    public IconnectLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "UserName")
    protected WebElement txtUserName;

    @FindBy(how = How.ID, using = "Password")
    protected WebElement txtPass;

    @FindBy(how = How.XPATH, using = "//input[@value='Log in']")
    protected WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//div[@id='dv_DashboardPartial']")
    protected WebElement elmntDashboard;

    public void launchIConnectURL() {
        try {
            visit(TestDataUtil.getValue("&URL&"));
            System.out.println("This is the data from the Util file"+TestDataUtil.getValue("&URL&"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void enterUserDetails(String strUserName, String strPass) {
        waitForElement(txtUserName);
        enterValue(txtUserName, strUserName);

        waitForElement(txtPass);
        enterValue(txtPass, strPass);

        takeScreenshot("EnterUserDetails2");
    }

    public void clickLoginButton() {
        click(btnLogin);
    }

    public boolean verifyIconnectHomePage() {
        waitForElement(elmntDashboard);
        return verifyElement(elmntDashboard);
    }


}