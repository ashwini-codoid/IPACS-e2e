package ipacs.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMComplaintDisputeMgmtSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMComplaintDisputeMgmtSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Then("^I should see sub-modules under Complaints Disputes Mgmt$")
    public void iShouldSeeSubModulesUnderComplaintsDisputesMgmt() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyComplaintsDisputesMgmtSubModule());
    }

    @When("^I click Add Complaint$")
    public void iClickAddComplaint() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickAddComplaint();
    }

    @Then("^I should see Add Complaint page$")
    public void iShouldSeeAddComplaintPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyAddComplaint());
    }

    @Given("^I am on the Add Complaint page$")
    public void iAmOnTheAddComplaintPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyAddComplaint());
    }

    @When("^I click Complaints Disputes Log$")
    public void iClickComplaintsDisputesLog() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickComplaintsDisputesLog();
    }

    @Then("^I should see Complaints Disputes Log page$")
    public void iShouldSeeComplaintsDisputesLogPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyComplaintsDisputesLog());
    }

    @Given("^I am on Complaints Disputes Log page$")
    public void iAmOnComplaintsDisputesLogPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyComplaintsDisputesLog());
    }

    @When("^I click Imported Records$")
    public void iClickImportedRecords() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickImportedRecords();
    }

    @Then("^I should see Imported Records page$")
    public void iShouldSeeImportedRecordsPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyImportedRecords());
    }

    @Given("^I am on the Imported Records page$")
    public void iAmOnTheImportedRecordsPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyImportedRecords());
    }

    @When("^I click Client Specific Complaint Log$")
    public void iClickClientSpecificComplaintLog() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickClientSpecificLog();
    }

    @Then("^I should see View Client Specific Complaint Log page$")
    public void iShouldSeeViewClientSpecificComplaintLogPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyClientSpecificLog());
    }

    @Given("^I am on Complaint Log Setup page$")
    public void iAmOnComplaintLogSetupPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyClientSpecificLog());
    }
    @When("^I click Add Edit Template$")
    public void iClickAddEditTemplate() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickAddEditTemplate();
    }

    @Then("^I should see Add Edit Template page under Client Specific Log$")
    public void iShouldSeeAddEditTemplatePageUnderClientSpecificLog() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyAddEditTemplate());
    }

    @Given("^I am on Add Edit Template page under Client Specific Log$")
    public void iAmOnAddEditTemplatePageUnderClientSpecificLog() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyAddEditTemplate());
    }

    @When("^I click Manage Template$")
    public void iClickManageTemplate() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickManageTemplate();
    }

    @Then("^I should see Manage Template page$")
    public void iShouldSeeManageTemplatePage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyManageTemplate());
    }

    @Given("^I am on Manage Template page$")
    public void iAmOnManageTemplatePage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyManageTemplate());
    }

    @When("^I click Client Specific Complaint Instructions$")
    public void iClickClientSpecificComplaintInstructions() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickClientSpecificComplaintInstructions();
    }

    @Then("^I should see Client Specific Complaint Instructions page$")
    public void iShouldSeeClientSpecificComplaintInstructionsPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyClientSpecificComplaintInstructions());
    }

    @Given("^I am on the Client Specific Complaint Instructions page$")
    public void iAmOnTheClientSpecificComplaintInstructionsPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyClientSpecificComplaintInstructions());
    }

    @When("^I click Import Complaints Disputes$")
    public void iClickImportComplaintsDisputes() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickImportComplaintsDisputes();
    }

    @Then("^I should see Import Complaints Disputes page$")
    public void iShouldSeeImportComplaintsDisputesPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyImportComplaintsDisputes());
    }

    @Given("^I am the Import Complaints Disputes page$")
    public void iAmTheImportComplaintsDisputesPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyImportComplaintsDisputes());
    }

    @When("^I click Complaint Dispute Set Up$")
    public void iClickComplaintDisputeSetUp() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickComplaintDisputeLogSetUp();
    }

    @Then("^I should see Add Edit Template page under Complaint Dispute Set Up$")
    public void iShouldSeeAddEditTemplatePageUnderComplaintDisputeSetUp() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyComplaintDisputeLogSetUp());
    }

    @Given("^I am on Complaint Dispute Log Setup page$")
    public void iAmOnComplaintDisputeLogSetupPage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyComplaintDisputeLogSetUp());
    }

    @When("^I click Classify Step one Attribute$")
    public void iClickClassifyStepOneAttribute() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickClassifyStepOneAttribute();
    }

    @Then("^I should see Classify Step one Attribute page$")
    public void iShouldSeeClassifyStepOneAttributePage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyClassifyStepOneAttribute());
    }

    @Given("^I am on Classify Step one Attribute page$")
    public void iAmOnClassifyStepOneAttributePage() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyClassifyStepOneAttribute());
    }

    @When("^I click Ccp Attribute$")
    public void iClickCcpAttribute() {
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickCcpAttribute();
    }

    @Then("^I should see Access window$")
    public void iShouldSeeAccessWindow() {
        Assert.assertTrue(ipacsPageContainer.icmComplaintDisputeMgmtPage.verifyCcpAttribute());
        ipacsPageContainer.icmComplaintDisputeMgmtPage.clickCcpAttributeGoBack();
    }

}
