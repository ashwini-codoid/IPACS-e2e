package ipacs.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMMasterListClientSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMMasterListClientSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }

    @Given("^I am on IPACS Home Page$")
    public void iAmOnIPACSHomePage() {
        ipacsPageContainer.icmMasterListClientPage.clickHomeSectionICM();
        Assert.assertTrue(ipacsPageContainer.icmHomePage.verifyIpacsHomePage());
    }


    @Then("^I should see four sub-modules under Master List - Clients$")
    public void iShouldSeeFourSubModulesUnderMasterListClients() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListClientPage.verifyMasterListClientSubModule());
    }

    @When("^I click View Master List module under Master List - Clients$")
    public void iClickViewMasterListModuleUnderMasterListClients() {
        ipacsPageContainer.icmMasterListClientPage.clickViewMasterList();
    }

    @Then("^I should see the Master List - Clients details page$")
    public void iShouldSeeTheMasterListClientsDetailsPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListClientPage.verifyViewMasterList());
    }

    @Given("^I am on Master List - Clients details Page$")
    public void iAmOnMasterListClientsDetailsPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListClientPage.verifyViewMasterList());
    }

    @When("^I click Add Network Client module under Master List - Clients$")
    public void iClickAddNetworkClientModuleUnderMasterListClients() {
        ipacsPageContainer.icmMasterListClientPage.clickAddNetworkClient();
    }

    @Then("^I should see the Add Network Client page$")
    public void iShouldSeeTheAddNetworkClientPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListClientPage.verifyAddNetworkClient());
    }

    @Given("^I am on the Add Network Client Page$")
    public void iAmOnTheAddNetworkClientPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListClientPage.verifyAddNetworkClient());
    }

    @When("^I click Add Client/Direct Placer module under Master List - Clients$")
    public void iClickAddClientDirectPlacerModuleUnderMasterListClients() {
        ipacsPageContainer.icmMasterListClientPage.clickAddClientDirectPlacer();
    }

    @Then("^I should see the Add Client/Direct Placer page$")
    public void iShouldSeeTheAddClientDirectPlacerPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListClientPage.verifyAddClientDirectPlacer());
    }


    @Given("^I am on the Add Client/Direct Placer Page$")
    public void iAmOnTheAddClientDirectPlacerPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListClientPage.verifyAddClientDirectPlacer());
    }

    @When("^I click Add Risk Factor module under Master List - Clients$")
    public void iClickAddRiskFactorModuleUnderMasterListClients() {
        ipacsPageContainer.icmMasterListClientPage.clickAddRiskFactor();

    }

    @Then("^I should see the Add Risk Factor page$")
    public void iShouldSeeTheAddRiskFactorPage() {
        Assert.assertTrue(ipacsPageContainer.icmMasterListClientPage.verifyAddRiskFactor());
    }



}
