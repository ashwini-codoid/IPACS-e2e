package ipacs.stepDefinitions;

import cap.utilities.TestDataUtil;

import ipacs.IpacsPageContainer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMLoginSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMLoginSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Given("^I am on IPACS application$")
    public void iAmOnIPACSApplication() {
        System.out.println("\n >>> iAmOnIPACSApplication Steps");
        ipacsPageContainer.icmLoginPage.launchIpacsURL();
        Assert.assertTrue(ipacsPageContainer.icmLoginPage.verifyIpacsLoginPage());
    }

    @When("^I enter (.*) (.*) and (.*)$")
    public void iEnterPartnerCodeUsernameAndPassword(String strPartnerCode, String strUser, String strPwd) {
        ipacsPageContainer.icmLoginPage.enterUserDetails(TestDataUtil.getValue(strPartnerCode), TestDataUtil.getValue(strUser), TestDataUtil.getValue(strPwd));
        ipacsPageContainer.icmLoginPage.clickLoginButton();
    }

    @Then("^I see the IPACS Home Page$")
    public void iSeeTheIPACSHomePage() {
        Assert.assertTrue(ipacsPageContainer.icmLoginPage.verifyIpacsHomePage());
    }


}
