package ipacs.stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMAdminSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMAdminSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }



    @Then("^I should see sub-modules under Admin Section$")
    public void iShouldSeeSubModulesUnderAdminSection() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAdminSectionSubModule());
    }

    @When("^I click Add New User$")
    public void iClickAddNewUser() {
        ipacsPageContainer.icmAdminPage.clickAddNewUser();
    }

    @Then("^I should verify the Add New User page$")
    public void iShouldVerifyTheAddNewUserPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAddNewUser());
    }

    @Given("^I am on the Add New User page$")
    public void iAmOnTheAddNewUserPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAddNewUser());
    }

    @When("^I click Edit User$")
    public void iClickEditUser() {
        ipacsPageContainer.icmAdminPage.clickEditUser();
    }

    @Then("^I should verify the Edit User page$")
    public void iShouldVerifyTheEditUserPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyEditUser());
    }

    @Given("^I am on the Edit User page$")
    public void iAmOnTheEditUserPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyEditUser());
    }

    @When("^I click Add Title$")
    public void iClickAddTitle() {
        ipacsPageContainer.icmAdminPage.clickAddTitle();
    }


    @Then("^I should verify the Add Title page$")
    public void iShouldVerifyTheAddTitlePage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAddTitle());
    }

    @Given("^I am on the Add Title page$")
    public void iAmOnTheAddTitlePage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAddTitle());
    }

    @When("^I click Edit Title$")
    public void iClickEditTitle() {
        ipacsPageContainer.icmAdminPage.clickEditTitle();
    }


    @Then("^I should verify the Edit Title page$")
    public void iShouldVerifyTheEditTitlePage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyEditTitle());
    }

    @Given("^I am on the Edit Title page$")
    public void iAmOnTheEditTitlePage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyEditTitle());
    }

    @When("^I click IPACS Administration$")
    public void iClickIPACSAdministration() {
        ipacsPageContainer.icmAdminPage.clickIpacsAdministration();
    }

    @Then("^I should verify the IPACS Administration page$")
    public void iShouldVerifyTheIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyIpacsAdministration());
    }


    @Given("^I am on IPACS Administration page$")
    public void iAmOnIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyIpacsAdministration());
    }

    @When("^I click User logs$")
    public void iClickUserLogs() {
        ipacsPageContainer.icmAdminPage.clickUserLogs();
    }

    @Then("^I should verify the User logs under IPACS Administration page$")
    public void iShouldVerifyTheUserLogsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyUserLogs());
    }

    @When("^I click User login History$")
    public void iClickUserLoginHistory() {
        ipacsPageContainer.icmAdminPage.clickUserLoginHistory();
    }

    @Then("^I should verify the User login History under IPACS Administration page$")
    public void iShouldVerifyTheUserLoginHistoryUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyUserLoginHistory());
    }

    @When("^I click Locked tests$")
    public void iClickLockedTests() {
        ipacsPageContainer.icmAdminPage.clickLockedTests();
    }

    @Then("^I should verify the Locked tests under IPACS Administration page$")
    public void iShouldVerifyTheLockedTestsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyLockedTests());
    }


    @When("^I click Manage objects$")
    public void iClickManageObjects() {
        ipacsPageContainer.icmAdminPage.clickManageObjects();
    }

    @Then("^I should verify the Manage objects under IPACS Administration page$")
    public void iShouldVerifyTheManageObjectsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyManageOgjects());
    }


    @Given("^I am on Manage objects Sub-module under IPACS Administration page$")
    public void iAmOnManageObjectsSubModuleUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyManageOgjects());
    }

    @When("^I click Delete SOP section$")
    public void iClickDeleteSOPSection() {
        ipacsPageContainer.icmAdminPage.clickDeleteSop();
    }

    @Then("^I should verify the Delete SOP Manage objects under IPACS Administration page$")
    public void iShouldVerifyTheDeleteSOPManageObjectsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDeleteSop());
    }

    @Given("^I am on Delete SOP Manage objects under IPACS Administration page$")
    public void iAmOnDeleteSOPManageObjectsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDeleteSop());
    }

    @When("^I click Delete Policy section$")
    public void iClickDeletePolicySection() {
        ipacsPageContainer.icmAdminPage.clickDeletePolicy();
    }

    @Then("^I should verify the Delete Policy Manage object under IPACS Administration page$")
    public void iShouldVerifyTheDeletePolicyManageObjectUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDeletePolicy());
    }

    @Given("^I am on Delete Policy Manage object under IPACS Administration page$")
    public void iAmOnDeletePolicyManageObjectUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDeletePolicy());
    }

    @When("^I click Delete Client section$")
    public void iClickDeleteClientSection() {
        ipacsPageContainer.icmAdminPage.clickDeleteClient();
    }

    @Then("^I should verify the Delete Client Manage objects under IPACS Administration page$")
    public void iShouldVerifyTheDeleteClientManageObjectsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDeleteClient());
    }

    @Given("^I am on Delete Client Manage objects under IPACS Administration page$")
    public void iAmOnDeleteClientManageObjectsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDeleteClient());
    }

    @When("^I click Delete Employee Test Course section$")
    public void iClickDeleteEmployeeTestCourseSection() {
        ipacsPageContainer.icmAdminPage.clickDeleteEmployeeTestCourse();
    }
    @Then("^I should verify the Delete Employee Test Course Manage objects under IPACS Administration page$")
    public void iShouldVerifyTheDeleteEmployeeTestCourseManageObjectsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDeleteEmployeeTestCourse());
    }

    @Given("^I am on Delete Employee Test Course Manage objects under IPACS Administration page$")
    public void iAmOnDeleteEmployeeTestCourseManageObjectsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDeleteEmployeeTestCourse());
    }

    @When("^I click Delete Vendor section$")
    public void iClickDeleteVendorSection() {
        ipacsPageContainer.icmAdminPage.clickDeleteVendor();
    }

    @Then("^I should verify the Delete Vendor Manage objects under IPACS Administration page$")
    public void iShouldVerifyTheDeleteVendorManageObjectsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDeleteVendor());
    }

    @When("^I click Access Control$")
    public void iClickAccessControl() {
        ipacsPageContainer.icmAdminPage.clickAccessControl();
    }

    @Then("^I should verify the Access Control under IPACS Administration page$")
    public void iShouldVerifyTheAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAccessContorl());
    }

    @Given("^I am on Access Control Sub-module under IPACS Administration page$")
    public void iAmOnAccessControlSubModuleUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAccessContorl());
    }

    @When("^I click Printing section$")
    public void iClickPrintingSection() {
        ipacsPageContainer.icmAdminPage.clickPrinting();
    }

    @Then("^I should verify the Printing Access Control under IPACS Administration page$")
    public void iShouldVerifyThePrintingAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyPrinting());
    }

    @Given("^I am on Printing Access Control under IPACS Administration page$")
    public void iAmOnPrintingAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyPrinting());
    }

    @When("^I click IP Restriction section$")
    public void iClickIPRestrictionSection() {
        ipacsPageContainer.icmAdminPage.clickIpRestriction();
    }

    @Then("^I should verify the IP Restriction Access Control under IPACS Administration page$")
    public void iShouldVerifyTheIPRestrictionAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyIpRestriction());
    }

    @Given("^I am on IP Restriction Access Control under IPACS Administration page$")
    public void iAmOnIPRestrictionAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyIpRestriction());
    }

    @When("^I click Logo section$")
    public void iClickLogoSection() {
        ipacsPageContainer.icmAdminPage.clickLogo();
    }

    @Then("^I should verify the Logo Access Control under IPACS Administration page$")
    public void iShouldVerifyTheLogoAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyLogo());
    }

    @Given("^I am on Logo Access Control under IPACS Administration page$")
    public void iAmOnLogoAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyLogo());
    }

    @When("^I click Training Materials section$")
    public void iClickTrainingMaterialsSection() {
        ipacsPageContainer.icmAdminPage.clickTrainingMaterial();
    }

    @Then("^I should verify the Training Materials Access Control under IPACS Administration page$")
    public void iShouldVerifyTheTrainingMaterialsAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyTrainingMaterial());
    }

    @Given("^I am on Training Materials Access Control under IPACS Administration page$")
    public void iAmOnTrainingMaterialsAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyTrainingMaterial());
    }

    @When("^I click Documents Certification section$")
    public void iClickDocumentsCertificationSection() {
        ipacsPageContainer.icmAdminPage.clickDocumentsCertification();
    }

    @Then("^I should verify the Documents Certification Access Control under IPACS Administration page$")
    public void iShouldVerifyTheDocumentsCertificationAccessControlUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyDocumentsCertification());
    }

    @When("^I click Notification Settings$")
    public void iClickNotificationSettings() {
        ipacsPageContainer.icmAdminPage.clickNotificationSettings();
    }

    @Then("^I should verify the Notification Settings under IPACS Administration page$")
    public void iShouldVerifyTheNotificationSettingsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyNotificationSettings());
    }

    @When("^I click Send User Passwords$")
    public void iClickSendUserPasswords() {
        ipacsPageContainer.icmAdminPage.clickSendUserPasswords();
    }

    @Then("^I should verify the Send User Passwords under IPACS Administration page$")
    public void iShouldVerifyTheSendUserPasswordsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifySendUserPasswords());
    }

    @When("^I click IPACS Usage Report$")
    public void iClickIPACSUsageReport() {
        ipacsPageContainer.icmAdminPage.clickIpacsUsageReport();
    }

    @Then("^I should verify the IPACS Usage Report under IPACS Administration page$")
    public void iShouldVerifyTheIPACSUsageReportUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyIpacsUsageReport());
    }

    @When("^I click IPACS Alert Settings$")
    public void iClickIPACSAlertSettings() {
        ipacsPageContainer.icmAdminPage.clickAlertSettings();
    }

    @Then("^I should verify the Alert Settings under IPACS Administration page$")
    public void iShouldVerifyTheAlertSettingsUnderIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAlertSettings());
    }

    @Given("^I am on the IPACS Administration page$")
    public void iAmOnTheIPACSAdministrationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAlertSettings());
    }

    @When("^I click Automated User Creation$")
    public void iClickAutomatedUserCreation() {
        ipacsPageContainer.icmAdminPage.clickAutomatedUserCreation();
    }

    @Then("^I should verify the Automated User Creation page$")
    public void iShouldVerifyTheAutomatedUserCreationPage() {
        Assert.assertTrue(ipacsPageContainer.icmAdminPage.verifyAutomatedUserCreation());
    }



}
