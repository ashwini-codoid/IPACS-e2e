package iconnect.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import iconnect.IconnectPageContainer;
import org.testng.Assert;

public class IconnectHomeSteps {

    private IconnectPageContainer iconnectPageContainer;

    public IconnectHomeSteps(IconnectPageContainer iconnectPageContainer) {
        this.iconnectPageContainer = iconnectPageContainer;
    }

    @Given("^I am on IConnect home page$")
    public void iAmOnIConnectHomePage() {
        Assert.assertTrue(iconnectPageContainer.iconnectHomePage.verifyIconnectHomePage());
    }

    @And("^I click campaign button via Workspace$")
    public void iClickCampaignButtonViaWorkspace() {
        iconnectPageContainer.iconnectHomePage.clickCampaignSection();
    }

    @When("^I add data tag and save template$")
    public void iAddDataTagAndSaveTemplate() {
        iconnectPageContainer.iconnectHomePage.addCampaignDataTag();
    }

    @And("^I select SMS and click continue$")
    public void iSelectSMSAndClickContinue() {
        iconnectPageContainer.iconnectHomePage.clickSMSRadioBtn();
    }

    @Then("^I should see the Please enter campaign name error message$")
    public void iShouldSeeThePleaseEnterCampaignNameErrorMessage() {
       Assert.assertTrue(iconnectPageContainer.iconnectHomePage.verifyCampaignNameErrorMsg());
    }
}
