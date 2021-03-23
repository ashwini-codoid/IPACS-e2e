package ipacs.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMBCPMgmtSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMBCPMgmtSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Then("^I should see sub-modules under BCP Management$")
    public void iShouldSeeSubModulesUnderBCPManagement() {
        Assert.assertTrue(ipacsPageContainer.icmBCPMgmtPage.verifyBCPManagementSectionICM());
    }

    @When("^I click View Master List under BCP Management$")
    public void iClickViewMasterListUnderBCPManagement() {
        ipacsPageContainer.icmBCPMgmtPage.clickViewMasterList();
    }

    @Then("^I should see Master List - Business Continuity Plan page$")
    public void iShouldSeeMasterListBusinessContinuityPlanPage() {
        Assert.assertTrue(ipacsPageContainer.icmBCPMgmtPage.verifyViewMasterList());
    }

}
