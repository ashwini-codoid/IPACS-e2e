package ipacs.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;


/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMAssignSopPoliciesSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMAssignSopPoliciesSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Then("^I should see sub-modules under Assign SOPs and Policies$")
    public void iShouldSeeSubModulesUnderAssignSOPsAndPolicies() {
        Assert.assertTrue(ipacsPageContainer.icmAssignSopPoliciesPage.verifyAssignSOPPoliciesSubModule());
    }

    @When("^I click Assign SOPs and Policies module under Assign SOPs and Policies link$")
    public void iClickAssignSOPsAndPoliciesModuleUnderAssignSOPsAndPoliciesLink() {
        ipacsPageContainer.icmAssignSopPoliciesPage.clickAssignSOP();

    }

    @Then("^I should see the Assign SOP page$")
    public void iShouldSeeTheAssignSOPPage() {
        Assert.assertTrue(ipacsPageContainer.icmAssignSopPoliciesPage.verifyAssignSOPPage());
    }

    @Given("^I am on SOP section under Assign User to SOP/Policies page$")
    public void iAmOnSOPSectionUnderAssignUserToSOPPoliciesPage() {
        Assert.assertTrue(ipacsPageContainer.icmAssignSopPoliciesPage.verifyAssignSOPPage());
    }
    @When("^I click Policies section$")
    public void iClickPoliciesSection() {
        ipacsPageContainer.icmAssignSopPoliciesPage.clickAssignPolicies();
    }

    @Then("^I should see the Assign Policies page$")
    public void iShouldSeeTheAssignPoliciesPage() {
        Assert.assertTrue(ipacsPageContainer.icmAssignSopPoliciesPage.verifyAssignPoliciesPage());
    }


}
