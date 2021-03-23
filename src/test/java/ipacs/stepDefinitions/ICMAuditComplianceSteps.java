package ipacs.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;

import static org.testng.Assert.assertTrue;


/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMAuditComplianceSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMAuditComplianceSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Then("^I should see four options inside Audit and Compliance$")
    public void iShouldSeeFourOptionsInsideAuditAndCompliance() {
        ipacsPageContainer.icmAuditCompliancePage.verifyOptionsInAuditandCompliance();

    }


    @When("^I click (.*) option from Audit and Compliance$")
    public void iClickInternalAuditOptionFromAuditAndCompliance(String strOption) {
        System.out.println(">>>" + strOption);
        ipacsPageContainer.icmAuditCompliancePage.ClickOptnInAuditAndCompliance(strOption);

    }

    @Then("^I should verify the Internal Audit Page$")
    public void iShouldVerifyTheInternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyInternalAuditPage());
    }

    @Given("^I am on Internal Audit page$")
    public void iAmOnInternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyInternalAuditPage());
    }

    @When("^I click on Audit profile Tab$")
    public void iClickOnAuditProfileTab() {
        ipacsPageContainer.icmAuditCompliancePage.clickAuditProfileTab();

    }

    @Then("^I should verify the Audit Profile Tab under Internal Audit page$")
    public void iShouldVerifyTheAuditProfileTabUnderInternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyAuditProfileUnderInternalAudit());
    }

    @When("^I click on Audit Management Tab$")
    public void iClickOnAuditManagementTab() {
        ipacsPageContainer.icmAuditCompliancePage.clickAuditManagementTab();

    }

    @Then("^I should verify the Audit Management Tab under Internal Audit page$")
    public void iShouldVerifyTheAuditManagementTabUnderInternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyAuditManagementUnderInternalAudit());
    }

    @When("^I click on Audit Documents Tab$")
    public void iClickOnAuditDocumentsTab() {
        ipacsPageContainer.icmAuditCompliancePage.clickAuditDocumentsTab();
    }

    @Then("^I should verify the Audit Documents Tab under Internal Audit page$")
    public void iShouldVerifyTheAuditDocumentsTabUnderInternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyAuditDocumentsUnderInternalAudit());
    }

    @When("^I click on Scorecard Template Tab$")
    public void iClickOnScorecardTemplateTab() {
        ipacsPageContainer.icmAuditCompliancePage.clickScorecardTemplateTab();
    }

    @Then("^I should verify the Scorecard Template Tab under Internal Audit page$")
    public void iShouldVerifyTheScorecardTemplateTabUnderInternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyScorecardTemplateUnderInternalAudit());
    }

    @When("^I click on Scorecard Analysis Tab$")
    public void iClickOnScorecardAnalysisTab() {
        ipacsPageContainer.icmAuditCompliancePage.clickScorecardAnalysisTab();
    }

    @Then("^I should verify the Scorecard Analysis Tab under Internal audit page$")
    public void iShouldVerifyTheScorecardAnalysisTabUnderInternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyScorecardAnalysisUnderInternalAudit());
    }

    @Given("^I am the Scorecard Analysis Tab under Internal audit page$")
    public void iAmTheScorecardAnalysisTabUnderInternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyScorecardAnalysisUnderInternalAudit());
    }

    @Then("^I should verify the External Audit page$")
    public void iShouldVerifyTheExternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyExternalAuditPage());


    }

    @Given("^I am on External Audit page$")
    public void iAmOnExternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyExternalAuditPage());

    }

    @When("^I click on Company data for Audit Tab$")
    public void iClickOnCompanyDataForAuditTab() {
        ipacsPageContainer.icmAuditCompliancePage.clickCompanyDataForAuditTab();
    }

    @Then("^I should verify the Company Data for Audit Tab under External Audit page$")
    public void iShouldVerifyTheCompanyDataForAuditTabUnderExternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyCompanyDataForAuditUnderExternalAudit());

    }

    @When("^I click on Client Audits Tab$")
    public void iClickOnClientAuditsTab() {
        ipacsPageContainer.icmAuditCompliancePage.clickClientAuditTab();
    }

    @Then("^I should verify the Client Audits under External Audit page$")
    public void iShouldVerifyTheClientAuditsUnderExternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyClientAuditUnderExternalAudit());
    }

    @When("^I click Questionnaire$")
    public void iClickQuestionnaire() {
        ipacsPageContainer.icmAuditCompliancePage.clickQuestionnaireTab();

    }


    @Then("^I should verify the Questionnaire under External audit$")
    public void iShouldVerifyTheQuestionnaireUnderExternalAudit() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyQuestionnaireUnderExternalAudit());
    }

    @When("^I click Add New Audit Type$")
    public void iClickAddNewAuditType() {
        ipacsPageContainer.icmAuditCompliancePage.clickAddNewAuditType();
    }

    @Then("^I should verify the Add New Audit Type under External audit$")
    public void iShouldVerifyTheAddNewAuditTypeUnderExternalAudit() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyAddNewAuditTypeUnderExternalAudit());
    }

    @When("^I click Audit Management$")
    public void iClickAuditManagement() {
        ipacsPageContainer.icmAuditCompliancePage.clickAuditManagementTab();
    }

    @Then("^I should verify the Audit Management under External audit$")
    public void iShouldVerifyTheAuditManagementUnderExternalAudit() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyAuditManagementUnderInternalAudit());
    }


    @When("^I click Audit Documents$")
    public void iClickAuditDocuments() {

        ipacsPageContainer.icmAuditCompliancePage.clickAuditDocumentsTab();
    }

    @Then("^I should verify the Audit Documents under External audit$")
    public void iShouldVerifyTheAuditDocumentsUnderExternalAudit() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyAuditDocumentsUnderInternalAudit());
    }

    @Given("^I am on the Audit Documents under External audit page$")
    public void iAmOnTheAuditDocumentsUnderExternalAuditPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyAuditDocumentsUnderInternalAudit());
    }

    @Then("^I should verify the Non-Conformity And Corrective Action page$")
    public void iShouldVerifyTheNonConformityAndCorrectiveActionPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyNonConformityAndCorrectiveActionPage());
    }

    @Given("^I am on Non-Conformity and Corrective Action page$")
    public void iAmOnNonConformityAndCorrectiveActionPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyNonConformityAndCorrectiveActionPage());
    }

    @When("^I click Add Non-Conformity$")
    public void iClickAddNonConformity() {
        ipacsPageContainer.icmAuditCompliancePage.clickAddNonConformity();
    }

    @When("^I click Non-Conformity log$")
    public void iClickNonConformityLog() {
        ipacsPageContainer.icmAuditCompliancePage.clickNonConformityLog();
    }


    @Then("^I should verify the Non-Conformity log under Non-Conformity and Corrective Action page$")
    public void iShouldVerifyTheNonConformityLogUnderNonConformityAndCorrectiveActionPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyNonConformityLogUnderNonConformityPage());
    }

    @Then("^I should verify the Add Non-Conformity under Non-Conformity and Corrective Action page$")
    public void iShouldVerifyTheAddNonConformityUnderNonConformityAndCorrectiveActionPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyNonConformityLogUnderNonConformityPage());
    }



    @When("^I click Corrective Action$")
    public void iClickCorrectiveAction() {
        ipacsPageContainer.icmAuditCompliancePage.clickCorrectiveAction();
    }

    @Then("^I should verify the Corrective Action under Non-Conformity and corrective Action page$")
    public void iShouldVerifyTheCorrectiveActionUnderNonConformityAndCorrectiveActionPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyCorrectiveActionUnderNonConformityPage());
    }

    @Given("^I am on the Corrective Action under Non-Conformity and corrective Action page$")
    public void iAmOnTheCorrectiveActionUnderNonConformityAndCorrectiveActionPage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyCorrectiveActionUnderNonConformityPage());
    }

    @Then("^I should verify the Client Issue page$")
    public void iShouldVerifyTheClientIssuePage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyClientIssuePage());
    }

    @Given("^I am on Client Issue page$")
    public void iAmOnClientIssuePage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyClientIssuePage());
    }


    @When("^I click Client Issue log$")
    public void iClickClientIssueLog() {
        ipacsPageContainer.icmAuditCompliancePage.clickClientIssueLog();

    }

    @Then("^I should verify the Client Issue log under Client Issue page$")
    public void iShouldVerifyTheClientIssueLogUnderClientIssuePage() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyClientIssueLogUnderClientIssuePage());

    }

    @When("^I click Add Client Issue$")
    public void iClickAddClientIssue() {
        ipacsPageContainer.icmAuditCompliancePage.clickAddClientIssue();
    }

    @Then("^I should verify the Add Client Issue under Client Issue$")
    public void iShouldVerifyTheAddClientIssueUnderClientIssue() {
        assertTrue(ipacsPageContainer.icmAuditCompliancePage.verifyAddClientIssueUnderClientIssuePage());
    }



}
