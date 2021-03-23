package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ICMCompanyProfilePage extends BasePage {

    public ICMCompanyProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "((//div[@id='firmProfile'])//following::dt[1])[1]")
    protected WebElement eleCompanyName;
    @FindBy(how = How.XPATH, using = "(//label[.='Search:'])[1]")
    protected WebElement btnSearchInDocumentation;

    protected String strSubTabLocator = new StringBuilder()
            .append("//a[text()='")
            .append("<<SUBTAB>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//div[.='Upload New Document']")
    protected WebElement btnUploadNewDocumentInLicenses;

    @FindBy(how = How.XPATH, using = "//div[.='Apply New License']")
    protected WebElement btnApplyNewLicenseInLicensesInfo;

    @FindBy(how = How.XPATH, using = "//a[text()='Documentation']")
    protected WebElement btnDocumentationInCompanyProfile;

    @FindBy(how = How.XPATH, using = "//a[text()='Licenses']")
    protected WebElement btnLicensesInCompanyProfile;

    @FindBy(how = How.XPATH, using = "//a[text()='Licenses Info']")
    protected WebElement btnLicensesInfoInCompanyProfile;

    @FindBy(how = How.XPATH, using = "//a[text()='Company Profile']")
    protected WebElement btnCompanyInCompanyProfile;


    public boolean verifyCompanyProfilePage() {
        waitForElement(btnCompanyInCompanyProfile);
        verifyElement(btnCompanyInCompanyProfile);
        return verifyElement(eleCompanyName);
    }

    public boolean verifyDocumentationPage(){
        click(btnDocumentationInCompanyProfile);
        waitForElement(btnSearchInDocumentation);
        return verifyElement(btnSearchInDocumentation);

    }

    public boolean verifyLicensesPage(){
        click(btnLicensesInCompanyProfile);
        waitForElement(btnUploadNewDocumentInLicenses);
        return verifyElement(btnUploadNewDocumentInLicenses);

    }

    public boolean verifyLicensesInfoPage(){
        click(btnLicensesInfoInCompanyProfile);
        waitForElement(btnApplyNewLicenseInLicensesInfo);
        return verifyElement(btnApplyNewLicenseInLicensesInfo);
    }
}