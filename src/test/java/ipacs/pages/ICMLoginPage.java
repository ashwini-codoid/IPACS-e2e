package ipacs.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ICMLoginPage extends BasePage {

    public ICMLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "#partnerCode")
    protected WebElement txtPartnerCode;

    @FindBy(how = How.CSS, using = "#username")
    protected WebElement txtUserName;

    @FindBy(how = How.CSS, using = "#Password")
    protected WebElement txtPassword;

    @FindBy(how = How.CSS, using = "#Login")
    protected WebElement btnLogin;

    @FindBy(how = How.CSS, using = ".profile_name_right")
    protected WebElement elmntProfileName;




    public void launchIpacsURL() {
        try {
            visit(TestDataUtil.getValue("&URL&"));
            System.out.println("This is the data from the Util file"+TestDataUtil.getValue("&URL&"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean verifyIpacsLoginPage() {
        waitForElement(btnLogin);
        return verifyElement(btnLogin);
    }

    public void enterUserDetails(String strPartnerCode, String strUser, String strPwd) {
        waitForElement(txtPartnerCode);
        enterValue(txtPartnerCode, strPartnerCode);

        waitForElement(txtUserName);
        enterValue(txtUserName, strUser);

        waitForElement(txtPassword);
        enterValue(txtPassword, strPwd);

        takeScreenshot("EnterUserDetails2");
    }

    public void clickLoginButton() {
        click(btnLogin);
    }

    public boolean verifyIpacsHomePage() {
        waitForElement(elmntProfileName);
        return verifyElement(elmntProfileName);
    }


}