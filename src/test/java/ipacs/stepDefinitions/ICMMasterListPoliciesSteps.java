package ipacs.stepDefinitions;

import cucumber.api.java.en.Then;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMMasterListPoliciesSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMMasterListPoliciesSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }

    @Then("^I should see the Master List Policies sub modules:$")
    public void iShouldSeeTheFollowingSubModules(){
        Assert.assertTrue(ipacsPageContainer.icmMasterListPoliciesPage.verifyViewMasterListInPolicies());
        ipacsPageContainer.icmMasterListPoliciesPage.clickMasterListPolicies();
        Assert.assertTrue(ipacsPageContainer.icmMasterListPoliciesPage.verifyAddPolicyInMasterListPolicies());
        ipacsPageContainer.icmMasterListPoliciesPage.clickMasterListPolicies();
        Assert.assertTrue(ipacsPageContainer.icmMasterListPoliciesPage.verifyAddSubPolicyInMasterListPolicies());
        ipacsPageContainer.icmMasterListPoliciesPage.clickMasterListPolicies();
        Assert.assertTrue(ipacsPageContainer.icmMasterListPoliciesPage.verifyAutomatedShellCreationInMasterListPolicies());

    }

}
