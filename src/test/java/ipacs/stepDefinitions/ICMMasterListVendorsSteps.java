package ipacs.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMMasterListVendorsSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMMasterListVendorsSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Then("^I should see sub-modules under Master List-Vendors$")
    public void iShouldSeeSubModulesUnderMasterListVendors() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListVendorsPage.verifyMasterListVendorsSubModule());
    }

    @When("^I click View Master List under Master List-Vendors$")
    public void iClickViewMasterListUnderMasterListVendors() {
        ipacsPageContainer.icmMasterListVendorsPage.clickViewMasterList();
    }

    @Then("^I should see Master List-Vendor page$")
    public void iShouldSeeMasterListVendorPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListVendorsPage.verifyViewMasterList());
    }

    @Given("^I am on the Master List-Vendor page$")
    public void iAmOnTheMasterListVendorPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListVendorsPage.verifyViewMasterList());
    }

    @When("^I click Add Vendor$")
    public void iClickAddVendor() {
        ipacsPageContainer.icmMasterListVendorsPage.clickAddVendor();
    }

    @Then("^I should see Add Vendor page$")
    public void iShouldSeeAddVendorPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListVendorsPage.verifyAddVendor());
    }

    @Given("^I am on the Add Vendor page$")
    public void iAmOnTheAddVendorPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListVendorsPage.verifyAddVendor());
    }

    @When("^I click Add Vendor Category$")
    public void iClickAddVendorCategory() {
        ipacsPageContainer.icmMasterListVendorsPage.clickAddVendorCategory();
    }

    @Then("^I should see Add Vendor Category page$")
    public void iShouldSeeAddVendorCategoryPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListVendorsPage.verifyAddVendorCategory());
    }



}
