package ipacs.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMReportsSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMReportsSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }




    @Then("^I should see the sub-modules under Reports$")
    public void iShouldSeeTheSubModulesUnderReports() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyReportsSubModule());
    }

    @When("^I click Certification module under Reports$")
    public void iClickCertificationModuleUnderReports() {
        ipacsPageContainer.icmReportsPage.clickCertification();
    }

    @Then("^I should see the View Certification -Reports page$")
    public void iShouldSeeTheViewCertificationReportsPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCertificationPage());
    }

    @Given("^I am on View Certification -Reports page$")
    public void iAmOnViewCertificationReportsPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCertificationPage());
    }

    @When("^I click SOP tab under Current Certification$")
    public void iClickSOPTabUnderCurrentCertification() {
        ipacsPageContainer.icmReportsPage.clickSOPCertification();
    }

    @Then("^I should see the Current Certification page under SOP$")
    public void iShouldSeeTheCurrentCertificationPageUnderSOP() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCurrentCertificationSOPPage());
    }

    @And("^I click SOP tab under Expired Certification$")
    public void iClickSOPTabUnderExpiredCertification() {
        ipacsPageContainer.icmReportsPage.clickSOPCertification();
    }

    @When("^I click Expired Certification Section$")
    public void iClickExpiredCertificationSection() {
        ipacsPageContainer.icmReportsPage.clickExpiredCertificationSOP();
    }

    @Then("^I should see the Expired Certification page under SOP$")
    public void iShouldSeeTheExpiredCertificationPageUnderSOP() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyExpiredCertificationSOPPage());
    }

    @And("^I click SOP tab under Certification History$")
    public void iClickSOPTabUnderCertificationHistory() {
        ipacsPageContainer.icmReportsPage.clickSOPCertification();
    }

    @When("^I click Certification History Section$")
    public void iClickCertificationHistorySection() {
        ipacsPageContainer.icmReportsPage.clickCertificationHistorySOP();
    }

    @Then("^I should see the Certification History Section page under SOP$")
    public void iShouldSeeTheCertificationHistorySectionPageUnderSOP() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCertificationHistorySOPPage());
    }

    @And("^I click Policy tab under Current Certification$")
    public void iClickPolicyTabUnderCurrentCertification() {
        ipacsPageContainer.icmReportsPage.clickPolicyCertification();
    }

    @When("^I click Current Certification Section under Policy$")
    public void iClickCurrentCertificationSectionUnderPolicy() {
        ipacsPageContainer.icmReportsPage.clickCurrentCertificationPolicy();
    }

    @Then("^I should see the Current Certification page under Policy$")
    public void iShouldSeeTheCurrentCertificationPageUnderPolicy() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCurrentCertificationPolicyPage());
    }


    @And("^I click Policy tab under Expired Certification$")
    public void iClickPolicyTabUnderExpiredCertification() {
        ipacsPageContainer.icmReportsPage.clickPolicyCertification();
    }

    @When("^I click Expired Certification Section under Policy$")
    public void iClickExpiredCertificationSectionUnderPolicy() {
        ipacsPageContainer.icmReportsPage.clickExpiredCertificationPolicy();
    }

    @Then("^I should see the Expired Certification page under Policy$")
    public void iShouldSeeTheExpiredCertificationPageUnderPolicy() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyExpiredCertificationPolicyPage());
    }

    @And("^I click Policy tab under Certification History$")
    public void iClickPolicyTabUnderCertificationHistory() {
        ipacsPageContainer.icmReportsPage.clickPolicyCertification();
    }

    @When("^I click Certification History Section under Policy$")
    public void iClickCertificationHistorySectionUnderPolicy() {
        ipacsPageContainer.icmReportsPage.clickCertificationHistoryPolicy();
    }

    @Then("^I should see the Certification History page under Policy$")
    public void iShouldSeeTheCertificationHistoryPageUnderPolicy() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCertificationHistoryPolicyPage());
    }

    @Given("^I am on the Certification History page under Policy$")
    public void iAmOnTheCertificationHistoryPageUnderPolicy() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCertificationHistoryPolicyPage());
    }

    @When("^I click Approval List module under Reports$")
    public void iClickApprovalListModuleUnderReports() {
        ipacsPageContainer.icmReportsPage.clickApprovalList();
    }

    @Then("^I should see the View Approval List-Reports page$")
    public void iShouldSeeTheViewApprovalListReportsPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyApprovalListPage());
    }

    @Given("^I am on View Approval List-Reports page$")
    public void iAmOnViewApprovalListReportsPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyApprovalListPage());
    }

    @When("^I click SOP under Approval List Reports$")
    public void iClickSOPUnderApprovalListReports() {
        ipacsPageContainer.icmReportsPage.clickSOPApprovalList();
    }

    @Then("^I should see the Current Approval list Section page under SOP$")
    public void iShouldSeeTheCurrentApprovalListSectionPageUnderSOP() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCurrentApprovalListSOPPage());
    }

    @When("^I click Approval list History Section$")
    public void iClickApprovalListHistorySection() {
        ipacsPageContainer.icmReportsPage.clickApprovalListHistorySOP();
    }

    @Then("^I should see the Approval list History Section page under SOP$")
    public void iShouldSeeTheApprovalListHistorySectionPageUnderSOP() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyApprovalListHistorySOPPage());
    }

    @When("^I click Policy under Approval List Reports$")
    public void iClickPolicyUnderApprovalListReports() {
        ipacsPageContainer.icmReportsPage.clickPolicyApprovalList();
    }

    @Then("^I should see the Current Approval list Section page under Policy$")
    public void iShouldSeeTheCurrentApprovalListSectionPageUnderPolicy() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCurrentApprovalListPolicyPage());
    }

    @When("^I click Approval list History Section under policy$")
    public void iClickApprovalListHistorySectionUnderPolicy() {
        ipacsPageContainer.icmReportsPage.clickApprovalListHistoryPolicy();
    }

    @Then("^I should see the Approval list History Section page under Policy$")
    public void iShouldSeeTheApprovalListHistorySectionPageUnderPolicy() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyApprovalListHistoryPolicyPage());
    }

    @When("^I click Test under Approval List Reports$")
    public void iClickTestUnderApprovalListReports() {
        ipacsPageContainer.icmReportsPage.clickTestApprovalList();
    }

    @Then("^I should see the Current Approval list Section page Under Test$")
    public void iShouldSeeTheCurrentApprovalListSectionPageUnderTest() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCurrentApprovalListTestPage());
    }

    @When("^I click Approval list History Section under test$")
    public void iClickApprovalListHistorySectionUnderTest() {
        ipacsPageContainer.icmReportsPage.clickApprovalListHistoryTest();
    }

    @Then("^I should see the Approval list History Section page under Test$")
    public void iShouldSeeTheApprovalListHistorySectionPageUnderTest() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyApprovalListHistoryTestPage());
    }

    @Given("^I am on the Approval list History Section page under Test Page$")
    public void iAmOnTheApprovalListHistorySectionPageUnderTestPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyApprovalListHistoryTestPage());
    }

    @When("^I click Audit Summary-Reports$")
    public void iClickAuditSummaryReports() {
        ipacsPageContainer.icmReportsPage.clickAuditSummaryReports();
    }

    @Then("^I should see Internal Audit page under Audit Summary-Reports$")
    public void iShouldSeeInternalAuditPageUnderAuditSummaryReports() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyInternalAuditSummaryReportsPage());
    }

    @Given("^I am on  Audit Summary-Reports$")
    public void iAmOnAuditSummaryReports() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyInternalAuditSummaryReportsPage());
    }

    @When("^I click External Audit tab under Audit Summary-Reports$")
    public void iClickExternalAuditTabUnderAuditSummaryReports() {
        ipacsPageContainer.icmReportsPage.clickExternalAuditAuditReport();
    }

    @Then("^I should see External Audit page under Audit Summary-Reports$")
    public void iShouldSeeExternalAuditPageUnderAuditSummaryReports() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyExternalAuditSummaryReportsPage());
    }

    @Given("^I am on the External Audit page under Audit Summary-Reports$")
    public void iAmOnTheExternalAuditPageUnderAuditSummaryReports() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyExternalAuditSummaryReportsPage());
    }

    @When("^I click Employee Report$")
    public void iClickEmployeeReport() {
        ipacsPageContainer.icmReportsPage.clickEmployeeReport();
    }

    @Then("^I should see Employee Report page$")
    public void iShouldSeeEmployeeReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyEmployeeReportPage());
    }

    @Given("^I am on the see Employee Report page$")
    public void iAmOnTheSeeEmployeeReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyEmployeeReportPage());
    }

    @When("^I click Employee Test History Report$")
    public void iClickEmployeeTestHistoryReport() {
        ipacsPageContainer.icmReportsPage.clickEmployeeTestHistoryReport();
    }

    @Then("^I should see Employee Test History Report page$")
    public void iShouldSeeEmployeeTestHistoryReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyEmployeeTestHistoryReportPage());
    }

    @Given("^I am on the Employee Test History Report page$")
    public void iAmOnTheEmployeeTestHistoryReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyEmployeeTestHistoryReportPage());
    }

    @When("^I click Company Test History Report$")
    public void iClickCompanyTestHistoryReport() {
        ipacsPageContainer.icmReportsPage.clickCompanyTestHistoryReport();
    }

    @Then("^I should see Company Test History Report page$")
    public void iShouldSeeCompanyTestHistoryReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCompanyTestHistoryReportPage());
    }

    @Given("^I am on the see Company Test History Report page$")
    public void iAmOnTheSeeCompanyTestHistoryReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyCompanyTestHistoryReportPage());
    }

    @When("^I click Passing Score Test Report$")
    public void iClickPassingScoreTestReport() {
        ipacsPageContainer.icmReportsPage.clickPassingScoreTestReport();
    }

    @Then("^I should see Passing Score Test Report page$")
    public void iShouldSeePassingScoreTestReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyPassingScoreTestReportPage());
    }

    @Given("^I am on the Passing Score Test Report page$")
    public void iAmOnThePassingScoreTestReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyPassingScoreTestReportPage());
    }

    @When("^I click Test Questions & Responses Report$")
    public void iClickTestQuestionsResponsesReport() {
        ipacsPageContainer.icmReportsPage.clickTestQuestionsResponsesReport();
    }

    @Then("^I should see Test Questions & Responses Report page$")
    public void iShouldSeeTestQuestionsResponsesReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyTestQuestionsResponsesReportPage());
    }

    @Given("^I am on the Test Questions & Responses Report page$")
    public void iAmOnTheTestQuestionsResponsesReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyTestQuestionsResponsesReportPage());
    }

    @When("^I click Vendor Document Status Report$")
    public void iClickVendorDocumentStatusReport() {
        ipacsPageContainer.icmReportsPage.clickVendorDocStatusReport();
    }

    @Then("^I should see Vendor Document Status Report page$")
    public void iShouldSeeVendorDocumentStatusReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyVendorDocStatusReportPage());
    }

    @Given("^I am on the Vendor Document Status Report page$")
    public void iAmOnTheVendorDocumentStatusReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyVendorDocStatusReportPage());
    }

    @When("^I click Vendor Details Report$")
    public void iClickVendorDetailsReport() {
        ipacsPageContainer.icmReportsPage.clickVendorDetailsReport();
    }

    @Then("^I should see Vendor Details Report page$")
    public void iShouldSeeVendorDetailsReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyVendorDetailsReportPage());
    }

    @Given("^I am on the Vendor Details Report page$")
    public void iAmOnTheVendorDetailsReportPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyVendorDetailsReportPage());
    }

    @When("^I click Trend Analysis of Non-Conformities$")
    public void iClickTrendAnalysisOfNonConformities() {
        ipacsPageContainer.icmReportsPage.clickTrendAnalysisOfNonConformities();
    }

    @Then("^I should see Trend Analysis of Non-Conformities page$")
    public void iShouldSeeTrendAnalysisOfNonConformitiesPage() {
        Assert.assertTrue(ipacsPageContainer.icmReportsPage.verifyTrendAnalysisOfNonConformitiesPage());
    }



}
