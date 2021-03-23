package ipacs.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ICMEmployeeTrainingPage extends BasePage {

    public ICMEmployeeTrainingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "emptesting_link")
    protected WebElement tabEmployeeAndTrainingSectionICM;

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Employee and Training']]")
    protected WebElement elmntEmployeeAndTrainingSubModule;

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Employee']]")
    protected WebElement elmntEmployee;

    @FindBy(how = How.ID, using = "btnedit")
    protected WebElement btnEmployee;

    @FindBy(how = How.ID, using = "ui-id-2")
    protected WebElement elmntTestsAndAssignments;

    @FindBy(how = How.XPATH, using = "//div[text()[normalize-space()='Test']]")
    protected WebElement txtTestsAndAssignments;

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Test/Course Profile']]")
    protected WebElement elmntTestCourseProfile;

    @FindBy(how = How.XPATH, using = "//dt[text()[normalize-space()='name :']]")
    protected WebElement txtTestCourseProfile;

    @FindBy(how = How.ID, using = "ui-id-2")
    protected WebElement elmntTrainingMaterial;

    @FindBy(how = How.ID, using = "uploadTrainingMaterial")
    protected WebElement btnTrainingMaterial;

    @FindBy(how = How.ID, using = "ui-id-3")
    protected WebElement elmntEditTestProfile;

    @FindBy(how = How.XPATH, using = "//label[text()[normalize-space()='Select an Option :']]")
    protected WebElement txtEditTestProfile;

    @FindBy(how = How.ID, using = "ui-id-4")
    protected WebElement elmntCreateEditQuestions;

    @FindBy(how = How.ID, using = "addedittest")
    protected WebElement btnCreateEditQuestions;

    @FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Add Test/Course']]")
    protected WebElement elmntAddTestCourse;

    @FindBy(how = How.ID, using = "saveTest")
    protected WebElement btnAddTestCourse;


    public void clickEmployeeAndTrainingSectionICM() {
        jsScrollDown();
        click(waitForElement(tabEmployeeAndTrainingSectionICM));
    }

    public boolean verifyEmployeeAndTrainingSubModule() {
        waitForElement(elmntEmployeeAndTrainingSubModule);
        return verifyElement(elmntEmployeeAndTrainingSubModule);
    }
    public void clickEmployee() {
        click(waitForElement(elmntEmployee));
    }

    public boolean verifyEmployee() {
        waitForElement(btnEmployee);
        return verifyElement(btnEmployee);
    }
    public void clickTestsAndAssignments() {
        click(waitForElement(elmntTestsAndAssignments));
    }

    public boolean verifyTestsAndAssignments() {
        waitForElement(txtTestsAndAssignments);
        return verifyElement(txtTestsAndAssignments);
    }
    public void clickTestCourseProfile() {
        click(waitForElement(elmntTestCourseProfile));
    }

    public boolean verifyTestCourseProfile() {
        waitForElement(txtTestCourseProfile);
        return verifyElement(txtTestCourseProfile);
    }
    public void clickTrainingMaterial() {
        click(waitForElement(elmntTrainingMaterial));
    }

    public boolean verifyTrainingMaterial() {
        waitForElement(btnTrainingMaterial);
        return verifyElement(btnTrainingMaterial);
    }
    public void clickEditTestProfile() {
        click(waitForElement(elmntEditTestProfile));
    }

    public boolean verifyEditTestProfile() {
        waitForElement(txtEditTestProfile);
        return verifyElement(txtEditTestProfile);
    }
    public void clickCreateEditQuestions() {
        click(waitForElement(elmntCreateEditQuestions));
    }

    public boolean verifyCreateEditQuestions() {
        waitForElement(btnCreateEditQuestions);
        return verifyElement(btnCreateEditQuestions);
    }
    public void clickAddTestCourse() {
        click(waitForElement(elmntAddTestCourse));
    }

    public boolean verifyAddTestCourse() {
        waitForElement(btnAddTestCourse);
        return verifyElement(btnAddTestCourse);
    }
}