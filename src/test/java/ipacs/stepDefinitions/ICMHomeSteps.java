package ipacs.stepDefinitions;

import cap.utilities.TestDataUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMHomeSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMHomeSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }




    @And("^I create New User via Admin Section$")
    public void iCreateNewUserViaAdminSection() {
        ipacsPageContainer.icmHomePage.clickAdminSectionICM();
        ipacsPageContainer.icmHomePage.clickAddNewUserAdminSection();
    }

    @When("^I fill the mandatory fields in Add New User Page:(.*) (.*) (.*) (.*)$")
    public void iFillTheMandatoryFieldsInAddNewUserPageFirstNameUserNameEmailIdRoles(String strFirstName, String strUserName, String strEmailID, String strRole) {
        ipacsPageContainer.icmHomePage.enterNewUserDetails(strFirstName, strUserName, strEmailID, strRole);
    }

    @Then("^I should see the created New user in User details page$")
    public void iShouldSeeTheCreatedNewUserInUserDetailsPage() {
        Assert.assertTrue(ipacsPageContainer.icmHomePage.verifyCreatedUser());
    }


    @Given("^I am on IPACS main navigation$")
    public void iAmOnIPACSMainNavigation() {
        ipacsPageContainer.icmHomePage.verifyIPACSMainNavigation();
    }

    @When("^I click (.*) tab$")
    public void iClickHomeTab(String strTab) {
        ipacsPageContainer.icmHomePage.clickIPACSTab(strTab);
    }

    @Then("^I see the IPACS Welcome Page$")
    public void iSeeTheIPACSWelcomePage() {
        Assert.assertTrue(ipacsPageContainer.icmHomePage.verifyHomePageWelcomeMsg());
    }
}
