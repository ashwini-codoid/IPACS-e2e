package ipacs.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

public class ICMVendorMgmtSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMVendorMgmtSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Then("^I should see the sub-modules under vendor management$")
    public void iShouldSeeTheSubModulesUnderVendorManagement() {
        Assert.assertTrue(ipacsPageContainer.icmVendorMgmtPage.verifyVendorMgmtSubModule());
    }

    @When("^I click View master list under Vendor management$")
    public void iClickViewMasterListUnderVendorManagement() {
        ipacsPageContainer.icmVendorMgmtPage.clickViewMasterListVendorMgmt();
    }

    @Then("^I should see Master List- Vendor page$")
    public void iShouldSeeMasterListVendorPage() {
        Assert.assertTrue(ipacsPageContainer.icmVendorMgmtPage.verifyViewMasterListVendorMgmt());
    }

    @Given("^I am on the Master List- Vendor page$")
    public void iAmOnTheMasterListVendorPage() {
        Assert.assertTrue(ipacsPageContainer.icmVendorMgmtPage.verifyViewMasterListVendorMgmt());
    }

    @When("^I click Add vendor under Vendor management$")
    public void iClickAddVendorUnderVendorManagement() {
        ipacsPageContainer.icmVendorMgmtPage.clickAddVendorVendorMgmt();
    }

    @Then("^I should see Add vendor page$")
    public void iShouldSeeAddVendorPage() {
        Assert.assertTrue(ipacsPageContainer.icmVendorMgmtPage.verifyAddVendorVendorMgmt());
    }

    @Given("^I am on Add vendor page$")
    public void iAmOnAddVendorPage() {
        Assert.assertTrue(ipacsPageContainer.icmVendorMgmtPage.verifyAddVendorVendorMgmt());
    }

    @When("^I click Documentation under Vendor management$")
    public void iClickDocumentationUnderVendorManagement() {
        ipacsPageContainer.icmVendorMgmtPage.clickDocVendorMgmt();
    }

    @Then("^I should see the Documentation page$")
    public void iShouldSeeTheDocumentationPage() {
        Assert.assertTrue(ipacsPageContainer.icmVendorMgmtPage.verifyDocVendorMgmt());
    }

    @Given("^I am on the Documentation page$")
    public void iAmOnTheDocumentationPage() {
        Assert.assertTrue(ipacsPageContainer.icmVendorMgmtPage.verifyDocVendorMgmt());
    }

    @When("^I click Add vendor category under Vendor management$")
    public void iClickAddVendorCategoryUnderVendorManagement() {
        ipacsPageContainer.icmVendorMgmtPage.clickAddVendorCategoryVendorMgmt();
    }

    @Then("^I should see Add vendor category page$")
    public void iShouldSeeAddVendorCategoryPage() {
        Assert.assertTrue(ipacsPageContainer.icmVendorMgmtPage.verifyAddVendorCategoryVendorMgmt());
    }



}
