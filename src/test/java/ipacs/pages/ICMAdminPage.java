package ipacs.pages;

import cap.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ICMAdminPage extends BasePage {

    public ICMAdminPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "Admin_link")
    protected WebElement tabAdminSectionSectionICM;

    @FindBy(how = How.XPATH, using = "//li[text()='Admin Section']")
    protected WebElement elmntAdminSectionSubModule;

    @FindBy(how = How.XPATH, using = "//a[text()='Add New User']")
    protected WebElement elmntAddNewUser;

    @FindBy(how = How.ID, using = "submitBtn")
    protected WebElement btnAddNewUser;

    @FindBy(how = How.XPATH, using = "//a[text()='Edit User']")
    protected WebElement elmntEditUser;

    @FindBy(how = How.XPATH, using = "//td[text()[normalize-space()='clientuser']]")
    protected WebElement txtEditUser;

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Add Title']]")
    protected WebElement elmntAddTitle;

    @FindBy(how = How.ID, using = "AddTitlebtn")
    protected WebElement btnAddTitle;

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Edit Title']]")
    protected WebElement elmntEditTitle;

    @FindBy(how = How.ID, using = "EditTitleBtn")
    protected WebElement btnEditTitle;

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='IPACS Administration']]")
    protected WebElement elmntIpacsAdministration;

    @FindBy(how = How.XPATH, using = "//h1[text()[normalize-space()='IPACS Administration']]")
    protected WebElement txtIpacsAdministration;

    @FindBy(how = How.ID, using = "ui-id-1")
    protected WebElement elmntUserLogs;

    @FindBy(how = How.CLASS_NAME, using = "sorting_1")
    protected WebElement txtUserLogs;

    @FindBy(how = How.ID, using = "ui-id-2")
    protected WebElement elmntUserLoginHistory;

    @FindBy(how = How.ID, using = "newSearchBtnHistory")
    protected WebElement btnUserLoginHistory;

    @FindBy(how = How.ID, using = "ui-id-3")
    protected WebElement elmntLockedTests;

    @FindBy(how = How.CLASS_NAME, using = "dataTables_empty")
    protected WebElement txtLockedTests;

    @FindBy(how = How.ID, using = "ui-id-4")
    protected WebElement elmntManageObjects;

    @FindBy(how = How.ID, using = "ui-id-14")
    protected WebElement elmntDeleteSop;

    @FindBy(how = How.XPATH, using = "//input[@class='btn deleteTab']")
    protected WebElement btnDeleteSop;

    @FindBy(how = How.ID, using = "ui-id-15")
    protected WebElement elmntDeletePolicy;

    @FindBy(how = How.XPATH, using = "//input[@class='btn deletePolicyTab']")
    protected WebElement btnDeletePolicy;

    @FindBy(how = How.ID, using = "ui-id-16")
    protected WebElement elmntDeleteClient;

    @FindBy(how = How.XPATH, using = "//form[@id='DeleteClient']//input[@value='Delete']")
    protected WebElement btnDeleteClient;

    @FindBy(how = How.ID, using = "ui-id-17")
    protected WebElement elmntDeleteEmployeeTestCourse;

    @FindBy(how = How.XPATH, using = "//p[@id='hidebtnEmpTest']//input[@value='Delete']")
    protected WebElement btnDeleteEmployeeTestCourse;

    @FindBy(how = How.ID, using = "ui-id-18")
    protected WebElement elmntDeleteVendor;

    @FindBy(how = How.XPATH, using = "//input[@id='btnDelete']")
    protected WebElement btnDeleteVendor;

    @FindBy(how = How.ID, using = "ui-id-5")
    protected WebElement elmntAccessControl;

    @FindBy(how = How.ID, using = "ui-id-10")
    protected WebElement elmntPrinting;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-small saveprintbutton']")
    protected WebElement btnPrinting;

    @FindBy(how = How.ID, using = "ipRestrictionLink")
    protected WebElement elmntIpRestriction;

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Add IP']]")
    protected WebElement btnIpRestriction;

    @FindBy(how = How.ID, using = "ui-id-11")
    protected WebElement elmntLogo;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-small savelogobutton']")
    protected WebElement btnLogo;

    @FindBy(how = How.ID, using = "ui-id-12")
    protected WebElement elmntTrainingMaterial;

    @FindBy(how = How.XPATH, using = "//span[@id='saveTrainingMaterilaPermission']")
    protected WebElement btnTrainingMaterial;

    @FindBy(how = How.ID, using = "ui-id-13")
    protected WebElement elmntDocumentsCertification;

    @FindBy(how = How.ID, using = "savedcertificationPolicy")
    protected WebElement btnDocumentsCertification;

    @FindBy(how = How.ID, using = "ui-id-6")
    protected WebElement elmntNotificationSettings;

    @FindBy(how = How.ID, using = "notificationSettingBtn")
    protected WebElement btnNotificationSettings;

    @FindBy(how = How.ID, using = "ui-id-7")
    protected WebElement elmntSendUserPasswords;

    @FindBy(how = How.ID, using = "btnEmailSbmt")
    protected WebElement btnSendUserPasswords;

    @FindBy(how = How.ID, using = "ui-id-8")
    protected WebElement elmntIpacsUsageReport;

    @FindBy(how = How.XPATH, using = "//input[@value='Generate Report']")
    protected WebElement btnIpacsUsageReport;

    @FindBy(how = How.ID, using = "ui-id-9")
    protected WebElement elmntAlertSettings;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-small SaveUserReceiveAlerts']")
    protected WebElement btnAlertSettings;

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Automated User Creation']]")
    protected WebElement elmntAutomatedUserCreation;

    @FindBy(how = How.XPATH, using = "//input[@value='Submit']")
    protected WebElement btnAutomatedUserCreation;

    public void clickAdminSectionSectionICM() {
        //jsScrollDown();
        click(waitForElement(tabAdminSectionSectionICM));
    }

    public boolean verifyAdminSectionSubModule() {
        waitForElement(elmntAdminSectionSubModule);
        return verifyElement(elmntAdminSectionSubModule);
    }

    public void clickAddNewUser() {
        click(waitForElement(elmntAddNewUser));
    }

    public boolean verifyAddNewUser() {
        waitForElement(btnAddNewUser);
        return verifyElement(btnAddNewUser);
    }
    public void clickEditUser() {
        click(waitForElement(elmntEditUser));
    }

    public boolean verifyEditUser() {
        waitForElement(txtEditUser);
        return verifyElement(txtEditUser);
    }

    public void clickAddTitle() {
        click(waitForElement(elmntAddTitle));
    }

    public boolean verifyAddTitle() {
        jsScroll();
        waitForElement(btnAddTitle);
        return verifyElement(btnAddTitle);
    }

    public void clickEditTitle() {
        click(waitForElement(elmntEditTitle));
    }

    public boolean verifyEditTitle() {
        jsScroll();
        waitForElement(btnEditTitle);
        return verifyElement(btnEditTitle);
    }
    public void clickIpacsAdministration() {
        click(waitForElement(elmntIpacsAdministration));
    }

    public boolean verifyIpacsAdministration() {
        waitForElement(txtIpacsAdministration);
        return verifyElement(txtIpacsAdministration);
    }
    public void clickUserLogs() {
        doubleClick(driver,elmntUserLogs);
    }

    public boolean verifyUserLogs() {
        waitForElement(txtUserLogs);
        return verifyElement(txtUserLogs);
    }
    public void clickUserLoginHistory() {
        click(waitForElement(elmntUserLoginHistory));
    }

    public boolean verifyUserLoginHistory() {
        waitForElement(btnUserLoginHistory);
        return verifyElement(btnUserLoginHistory);
    }
    public void clickLockedTests() {
        click(waitForElement(elmntLockedTests));
    }

    public boolean verifyLockedTests() {
        waitForElement(txtLockedTests);
        return verifyElement(txtLockedTests);
    }
    public void clickManageObjects() {
        click(waitForElement(elmntManageObjects));
    }


    public boolean verifyManageOgjects() {
        waitForElement(elmntDeleteSop);
        return verifyElement(elmntDeleteSop);
    }
    public void clickDeleteSop() {
        doubleClick(driver,elmntDeleteSop);
    }

    public boolean verifyDeleteSop() {
        jsScrollDown();
        waitForElement(btnDeleteSop);
        return verifyElement(btnDeleteSop);
    }
    public void clickDeletePolicy() {
        click(waitForElement(elmntDeletePolicy));
    }

    public boolean verifyDeletePolicy() {
        waitForElement(btnDeletePolicy);
        return verifyElement(btnDeletePolicy);
    }
    public void clickDeleteClient() {
        click(waitForElement(elmntDeleteClient));
    }

    public boolean verifyDeleteClient() {
        waitForElement(btnDeleteClient);
        return verifyElement(btnDeleteClient);
    }
    public void clickDeleteEmployeeTestCourse() {
        click(waitForElement(elmntDeleteEmployeeTestCourse));
    }

    public boolean verifyDeleteEmployeeTestCourse() {
        waitForElement(btnDeleteEmployeeTestCourse);
        return verifyElement(btnDeleteEmployeeTestCourse);
    }
    public void clickDeleteVendor() {
        click(waitForElement(elmntDeleteVendor));
    }

    public boolean verifyDeleteVendor() {
        waitForElement(btnDeleteVendor);
        return verifyElement(btnDeleteVendor);
    }
    public void clickAccessControl() {
        click(waitForElement(elmntAccessControl));
    }

    public boolean verifyAccessContorl() {
        waitForElement(elmntPrinting);
        return verifyElement(elmntPrinting);
    }
    public void clickPrinting() {
        click(waitForElement(elmntPrinting));
    }

    public boolean verifyPrinting() {
        waitForElement(btnPrinting);
        return verifyElement(btnPrinting);
    }
    public void clickIpRestriction() {
        click(waitForElement(elmntIpRestriction));
    }

    public boolean verifyIpRestriction() {
        waitForElement(btnIpRestriction);
        return verifyElement(btnIpRestriction);
    }
    public void clickLogo() {
        click(waitForElement(elmntLogo));
    }

    public boolean verifyLogo() {
        waitForElement(btnLogo);
        return verifyElement(btnLogo);
    }
    public void clickTrainingMaterial() {
        click(waitForElement(elmntTrainingMaterial));
    }

    public boolean verifyTrainingMaterial() {
        waitForElement(btnTrainingMaterial);
        return verifyElement(btnTrainingMaterial);
    }
    public void clickDocumentsCertification() {
        click(waitForElement(elmntDocumentsCertification));
    }

    public boolean verifyDocumentsCertification() {
        waitForElement(btnDocumentsCertification);
        return verifyElement(btnDocumentsCertification);
    }
    public void clickNotificationSettings() {
        click(waitForElement(elmntNotificationSettings));
    }

    public boolean verifyNotificationSettings() {
        waitForElement(btnNotificationSettings);
        return verifyElement(btnNotificationSettings);
    }
    public void clickSendUserPasswords() {
        click(waitForElement(elmntSendUserPasswords));
    }

    public boolean verifySendUserPasswords() {
        waitForElement(btnSendUserPasswords);
        return verifyElement(btnSendUserPasswords);
    }
    public void clickIpacsUsageReport() {
        click(waitForElement(elmntIpacsUsageReport));
    }

    public boolean verifyIpacsUsageReport() {
        waitForElement(btnIpacsUsageReport);
        return verifyElement(btnIpacsUsageReport);
    }
    public void clickAlertSettings() {
        click(waitForElement(elmntAlertSettings));
    }

    public boolean verifyAlertSettings() {
        waitForElement(btnAlertSettings);
        return verifyElement(btnAlertSettings);
    }
    public void clickAutomatedUserCreation() {
        click(waitForElement(elmntAutomatedUserCreation));
    }

    public boolean verifyAutomatedUserCreation() {
        waitForElement(btnAutomatedUserCreation);
        return verifyElement(btnAutomatedUserCreation);
    }
}