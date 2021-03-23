package ipacs.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ipacs.IpacsPageContainer;
import org.testng.Assert;


/**
 * Created by codoid-pc on 11/2/2021.
 */

public class ICMEmployeeTrainingSteps {

    private IpacsPageContainer ipacsPageContainer;

    public ICMEmployeeTrainingSteps(IpacsPageContainer ipacsPageContainer) {
        this.ipacsPageContainer = ipacsPageContainer;
    }


    @Then("^I should see sub-modules under Employee and Training Section$")
    public void iShouldSeeSubModulesUnderEmployeeAndTrainingSection() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyEmployeeAndTrainingSubModule());
    }

    @When("^I click Employee module$")
    public void iClickEmployeeModule() {
        ipacsPageContainer.icmEmployeeTrainingPage.clickEmployee();
    }

    @Then("^I should verify User Profile page$")
    public void iShouldVerifyUserProfilePage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyEmployee());
    }

    @Given("^I am on user profile page$")
    public void iAmOnUserProfilePage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyEmployee());
    }

    @When("^I click Tests and Assignments$")
    public void iClickTestsAndAssignments() {
        ipacsPageContainer.icmEmployeeTrainingPage.clickTestsAndAssignments();
    }

    @Then("^I should verify the Tests and Assignments under User page$")
    public void iShouldVerifyTheTestsAndAssignmentsUnderUserPage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyTestsAndAssignments());
    }

    @Given("^I am on the Tests and Assignments under User page$")
    public void iAmOnTheTestsAndAssignmentsUnderUserPage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyTestsAndAssignments());
    }

    @When("^I click Test course profile$")
    public void iClickTestCourseProfile() {
        ipacsPageContainer.icmEmployeeTrainingPage.clickTestCourseProfile();
    }

    @Then("^I should verify Test profile page$")
    public void iShouldVerifyTestProfilePage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyTestCourseProfile());
    }

    @Given("^I am on Test profile page$")
    public void iAmOnTestProfilePage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyTestCourseProfile());
    }

    @When("^I click Training Material$")
    public void iClickTrainingMaterial() {
        ipacsPageContainer.icmEmployeeTrainingPage.clickTrainingMaterial();
    }

    @Then("^I should verify the Training Material page$")
    public void iShouldVerifyTheTrainingMaterialPage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyTrainingMaterial());
    }

    @Given("^I am on Training Material page$")
    public void iAmOnTrainingMaterialPage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyTrainingMaterial());
    }

    @When("^I click Edit Test Profile$")
    public void iClickEditTestProfile() {
        ipacsPageContainer.icmEmployeeTrainingPage.clickEditTestProfile();
    }

    @Then("^I should verify the Edit Test Profile page$")
    public void iShouldVerifyTheEditTestProfilePage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyEditTestProfile());
    }

    @Given("^I am on Edit Test Profile page$")
    public void iAmOnEditTestProfilePage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyEditTestProfile());
    }

    @When("^I click Create Edit Questions$")
    public void iClickCreateEditQuestions() {
        ipacsPageContainer.icmEmployeeTrainingPage.clickCreateEditQuestions();
    }

    @Then("^I should verify the Create Edit Questions page$")
    public void iShouldVerifyTheCreateEditQuestionsPage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyCreateEditQuestions());
    }

    @Given("^I am on the Create Edit Questions page$")
    public void iAmOnTheCreateEditQuestionsPage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyCreateEditQuestions());
    }

    @When("^I click Add Test course$")
    public void iClickAddTestCourse() {
        ipacsPageContainer.icmEmployeeTrainingPage.clickAddTestCourse();
    }

    @Then("^I should verify Add Test course  page$")
    public void iShouldVerifyAddTestCoursePage() {
        Assert.assertTrue(ipacsPageContainer.icmEmployeeTrainingPage.verifyAddTestCourse());
    }



}
