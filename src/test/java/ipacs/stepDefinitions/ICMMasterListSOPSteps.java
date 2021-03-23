package ipacs.stepDefinitions;

import cucumber.api.java.en.Then;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMMasterListSOPSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMMasterListSOPSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }

    @Then("^I should see the Master List SOP sub menu items$")
    public void IShouldSeeTheFollowingSubMenuItems(){
        Assert.assertTrue(ipacsPageContainer.icmMasterListSOPPage.verifyViewMasterListSOPs());
        ipacsPageContainer.icmMasterListSOPPage.clickMasterListSOP();
        Assert.assertTrue(ipacsPageContainer.icmMasterListSOPPage.verifyAddDepartmentInMasterListSOP());
        ipacsPageContainer.icmMasterListSOPPage.clickMasterListSOP();
        Assert.assertTrue(ipacsPageContainer.icmMasterListSOPPage.verifyAddFunctionInMasterListSOP());
        ipacsPageContainer.icmMasterListSOPPage.clickMasterListSOP();
        Assert.assertTrue(ipacsPageContainer.icmMasterListSOPPage.verifyAddProcessInMasterListSOP());
        ipacsPageContainer.icmMasterListSOPPage.clickMasterListSOP();
        Assert.assertTrue(ipacsPageContainer.icmMasterListSOPPage.verifyAddSOPInMasterListSOP());
        ipacsPageContainer.icmMasterListSOPPage.clickMasterListSOP();
        Assert.assertTrue(ipacsPageContainer.icmMasterListSOPPage.verifyAutomatedShellCreationInMasterListSOP());

    }

}
