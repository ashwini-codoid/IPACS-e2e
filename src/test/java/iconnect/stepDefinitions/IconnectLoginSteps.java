package iconnect.stepDefinitions;

import cap.utilities.TestDataUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import iconnect.IconnectPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class IconnectLoginSteps {

    private IconnectPageContainer iconnectPageContainer;

    public IconnectLoginSteps(IconnectPageContainer iconnectPageContainer) {
        this.iconnectPageContainer = iconnectPageContainer;
    }

    //TODO
    @Given("^I am on IConnect application$")
    public void iAmOnIConnectApplication() {
        System.out.println("\n >>> iAmOnIConnectApplication Steps");
        iconnectPageContainer.iconnectLoginPage.launchIConnectURL();
    }

    //TODO
    @When("^I enter (.*) and (.*)$")
    public void iEnterUserNameAndPassword(String strUserName, String strPass) {
        iconnectPageContainer.iconnectLoginPage.enterUserDetails(TestDataUtil.getValue(strUserName),TestDataUtil.getValue(strPass));
        iconnectPageContainer.iconnectLoginPage.clickLoginButton();
    }

    //TODO
    @Then("^I see the IConnect Home Page$")
    public void iSeeTheIConnectHomePage() {
        Assert.assertTrue(iconnectPageContainer.iconnectLoginPage.verifyIconnectHomePage());

    }

}
