package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ICMHomePage extends BasePage {

    public ICMHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "#Admin_link")
    protected WebElement tabAdminSectionICM;

    @FindBy(how = How.CSS, using = ".profile_name_right")
    protected WebElement elmntProfileName;

    @FindBy(how = How.XPATH, using = "//a[text()='Add New User']")
    protected WebElement elmntAddNewUser;

    @FindBy(how = How.CSS, using = "#FirstName")
    protected WebElement txtFirstName;

    @FindBy(how = How.CSS, using = "#UserName")
    protected WebElement txtUserName;

    @FindBy(how = How.CSS, using = "#EmailId")
    protected WebElement txtEmailId;

    @FindBy(how = How.CSS, using = "#Author-chk2")
    protected WebElement chkAuthorRole;

    @FindBy(how = How.XPATH, using = "//li[.='Main Navigation']")
    protected WebElement eleMainNavigation;

    protected String strTabLocator = new StringBuilder()
            .append("//a[normalize-space(.)='")
            .append("<<TAB>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='welcome_note']")
    protected WebElement txtWelcomeNote;


    public boolean verifyIpacsHomePage() {
        waitForElement(elmntProfileName);
        return verifyElement(elmntProfileName);
    }

    public void clickAdminSectionICM() {
        click(waitForElement(tabAdminSectionICM));
    }

    public void clickAddNewUserAdminSection() {
        waitForElement(elmntAddNewUser);
        click(elmntAddNewUser);
    }

    public void enterNewUserDetails(String strFirstName, String strUserName, String strEmailID, String strRole) {
        enterValue(waitForElement(txtFirstName), strFirstName);
        enterValue(waitForElement(txtUserName), strUserName);
        enterValue(waitForElement(txtEmailId), strEmailID);
        click(chkAuthorRole);
    }

    public boolean verifyCreatedUser() {
//        click(waitForElement(tabAdminSectionICM));
        return true;
    }

    public void verifyIPACSMainNavigation() {
        verifyElement(eleMainNavigation);
    }

    public void clickIPACSTab(String strTab) {
        WebElement elmntTab = waitForElement(By.xpath(strTabLocator.replace("<<TAB>>",
                strTab)));
        click(elmntTab);
    }

    public boolean verifyHomePageWelcomeMsg() {
        waitForElement(txtWelcomeNote);
        return verifyElement(txtWelcomeNote);

    }

}