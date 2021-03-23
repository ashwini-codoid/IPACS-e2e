package ipacs.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class ICMDocumentsSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMDocumentsSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Then("^I should see Nine sub-modules under Documents$")
    public void iShouldSeeNineSubModulesUnderDocuments() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyDocSubModule());
    }

    @When("^I click Add Document - SOP module under Documents$")
    public void iClickAddDocumentSOPModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickAddDocSOP();

    }

    @Then("^I should see the Add Document - SOP page$")
    public void iShouldSeeTheAddDocumentSOPPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddDocumentSOPPage());
    }

    @Given("^I am on Add Document - SOP Page$")
    public void iAmOnAddDocumentSOPPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddDocumentSOPPage());
    }

    @When("^I click Add Document - Attachment module under Documents$")
    public void iClickAddDocumentAttachmentModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickAddDocAttachment();
    }

    @Then("^I should see the Attachment at SOP page$")
    public void iShouldSeeTheAttachmentAtSOPPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAttachmentAtSOP());
    }

    @Given("^I am on Add Document - Attachment page$")
    public void iAmOnAddDocumentAttachmentPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAttachmentAtSOP());
    }

    @When("^I click Attachment At Policy Section$")
    public void iClickAttachmentAtPolicySection() {
        ipacsPageContainer.icmDocumentsPage.clickAttachmentAtPolicy();

    }

    @Then("^I should see the Attachment At Policy page$")
    public void iShouldSeeTheAttachmentAtPolicyPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAttachmentAtPolicy());
    }

    @Given("^I am on the Attachment At Policy page$")
    public void iAmOnTheAttachmentAtPolicyPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAttachmentAtPolicy());
    }

    @When("^I click Add Document - Policy module under Documents$")
    public void iClickAddDocumentPolicyModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickAddDocPolicy();
    }

    @Then("^I should see the Add Document - Policy page$")
    public void iShouldSeeTheAddDocumentPolicyPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddDocPolicyPage());
    }
    @Given("^I am on the Add Document - Policy page$")
    public void iAmOnTheAddDocumentPolicyPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddDocPolicyPage());
    }

    @When("^I click Add Document - Client Manual module under Documents$")
    public void iClickAddDocumentClientManualModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickAddDocClientManual();

    }

    @Then("^I should see the Add Document - Client Manual page$")
    public void iShouldSeeTheAddDocumentClientManualPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddDocClientManualPage());
    }
    @Given("^I am on Add Document - Client Manual page$")
    public void iAmOnAddDocumentClientManualPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddDocClientManualPage());
    }

    @When("^I click Add Cover Page, Header & Footer module under Documents$")
    public void iClickAddCoverPageHeaderFooterModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickAddCoverPage();
    }

    @Then("^I should see the Add Cover page$")
    public void iShouldSeeTheAddCoverPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddCoverPage());

    }

    @Given("^I am on the Add Cover Page$")
    public void iAmOnTheAddCoverPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddCoverPage());
    }

    @When("^I click Header & Footer section module under Documents$")
    public void iClickHeaderFooterSectionModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickAddHeaderFooter();
    }

    @Then("^I should see the Header & Footer page$")
    public void iShouldSeeTheHeaderFooterPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddHeaderFooterPage());
    }

    @Given("^I am on the Header & Footer page$")
    public void iAmOnTheHeaderFooterPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyAddHeaderFooterPage());
    }

    @When("^I click View Approval List module under Documents$")
    public void iClickViewApprovalListModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickApprovalList();

    }

    @Then("^I should see the View Approval List page$")
    public void iShouldSeeTheViewApprovalListPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyApprovalListPage());
    }

    @Given("^I am on the View Approval List page$")
    public void iAmOnTheViewApprovalListPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyApprovalListPage());
    }

    @When("^I click View Document Dashboard module under Documents$")
    public void iClickViewDocumentDashboardModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickDocDashboard();

    }

    @Then("^I should see the Add Document - Document Dashboard page$")
    public void iShouldSeeTheAddDocumentDocumentDashboardPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyDocDashboardPage());
    }

    @Given("^I am on the Add Document - Document Dashboard page$")
    public void iAmOnTheAddDocumentDocumentDashboardPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyDocDashboardPage());
    }

    @When("^I click Document Repository module under Documents$")
    public void iClickDocumentRepositoryModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickDocRepository();
    }

    @Then("^I should see the Document Repository page$")
    public void iShouldSeeTheDocumentRepositoryPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyDocRepositoryPage());
    }

    @Given("^I am on the Document Repository page$")
    public void iAmOnTheDocumentRepositoryPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyDocRepositoryPage());
    }

    @When("^I click Mass Download module under Documents$")
    public void iClickMassDownloadModuleUnderDocuments() {
        ipacsPageContainer.icmDocumentsPage.clickMassDownload();
    }

    @Then("^I should see the SOP Mass Download page$")
    public void iShouldSeeTheSOPMassDownloadPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyMassDownloadSOPPage());

    }

    @Given("^I am on SOP section in Mass Download page$")
    public void iAmOnSOPSectionInMassDownloadPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyMassDownloadSOPPage());
    }

    @When("^I click Policy section$")
    public void iClickPolicySection() {
        ipacsPageContainer.icmDocumentsPage.clickMassDownloadPolicy();
    }

    @Then("^I should see the Policy section in Mass Download page$")
    public void iShouldSeeThePolicySectionInMassDownloadPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyMassDownloadPolicyPage());
    }

    @Given("^I am on Policy section in Mass Download page$")
    public void iAmOnPolicySectionInMassDownloadPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyMassDownloadPolicyPage());
    }

    @When("^I click Vendor Documents section$")
    public void iClickVendorDocumentsSection() {
        ipacsPageContainer.icmDocumentsPage.clickMassDownloadVendorDocument();
    }

    @Then("^I should see the Vendor Documents section in Mass Download page$")
    public void iShouldSeeTheVendorDocumentsSectionInMassDownloadPage() {
        Assert.assertTrue(ipacsPageContainer.icmDocumentsPage.verifyMassDownloadVendorDocPage());
    }



}
