package ipacs.stepDefinitions;

import cucumber.api.java.en.Then;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMCompanyProfileSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMCompanyProfileSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Then("^I see the Company Profile fields$")
    public void  iSeeTheFollowingFields(){
        Assert.assertTrue(ipacsPageContainer.icmCompanyProfilePage.verifyCompanyProfilePage());
        Assert.assertTrue(ipacsPageContainer.icmCompanyProfilePage.verifyDocumentationPage());
        Assert.assertTrue(ipacsPageContainer.icmCompanyProfilePage.verifyLicensesPage());
        Assert.assertTrue(ipacsPageContainer.icmCompanyProfilePage.verifyLicensesInfoPage());
    }


}
