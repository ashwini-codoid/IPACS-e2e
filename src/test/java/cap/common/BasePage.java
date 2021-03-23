package cap.common;

import cap.helpers.Constants;
import cap.utilities.WaitTimeUtil;
import com.cucumber.listener.Reporter;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.windows.WindowsDriver;
import lombok.Getter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class BasePage {

    @Getter
    protected WebDriver driver;

    @Getter
    protected final WebDriverWait wait;
    protected final WebDriverWait invisibleWait;

    protected static Long executionID = null;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(this.driver, WaitTimeUtil.getWaitTime(Constants.OBJECT_WAIT_TIME));
        invisibleWait = new WebDriverWait(this.driver, WaitTimeUtil.getWaitForInvisibilityTime(Constants.OBJECT_WAIT_TIME));
        // this.driver.manage().timeouts().pageLoadTimeout(WaitTimeUtil.getWaitTime(Constants.PAGE_LOAD_WAIT_TIME),
        // TimeUnit.SECONDS);

    }

    StopWatch pageLoad = new StopWatch();

    protected void visit(String URL) {
        driver.manage().deleteAllCookies();

        driver.manage().window().maximize();
        System.out.println("=======================>URL:" + URL);
        driver.get(URL);
        System.out.println("=======================>Launched URL");
    }

    protected WebElement waitForElementClickable(By by, int secs) {
        return new WebDriverWait(driver, secs).until(ExpectedConditions.elementToBeClickable(by));
    }

    protected WebElement waitForElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected WebElement waitForElement(By by, int secs) {
        return new WebDriverWait(driver, secs).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected WebElement waitForElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement waitForElementClickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected boolean waitForWindows(int strNoOfWindows) {
        boolean isWindowAppeared = false;
        try {
            isWindowAppeared = new WebDriverWait(driver, 45).until(ExpectedConditions.numberOfWindowsToBe(strNoOfWindows));
        } catch (Exception ee) {
            System.out.println("\n >> WaitForWindows :: " + ee.getMessage());
        }
        return isWindowAppeared;
    }

    protected WebElement waitForElementClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected boolean verifyText(String strExpectedText) {
        return driver.getPageSource().contains(strExpectedText);
    }

    public void waitForSeconds(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (Exception e) {
        }
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public boolean focusFrame() {
        boolean isFrameFocused = false;
        waitForSeconds(1);
        driver.switchTo().frame(0);
        isFrameFocused = true;
        return isFrameFocused;
    }

    public boolean focusFrame(WebElement element) {
        boolean isFrameFocused;
        waitForSeconds(1);
        driver.switchTo().frame(element);
        isFrameFocused = true;
        return isFrameFocused;
    }

    public boolean focusBackToDefaultFrame() {
        boolean isFrameFocused = false;
        waitForSeconds(1);
        driver.switchTo().defaultContent();
        isFrameFocused = true;
        return isFrameFocused;

    }

    public static boolean compareList(List<WebElement> lstElements, List<String> lstDataValues) {
        List<String> lstActualValue = new ArrayList<String>();
        List<String> lstExpectedValues = new ArrayList<String>();
        lstElements.stream().forEach(eleItem -> lstActualValue.add(eleItem.getText().trim()));
        lstDataValues.stream().forEach(strData -> lstExpectedValues.add(strData));
        return (lstActualValue.equals(lstExpectedValues));
    }

    public static WebDriver waitForframeToBeAvailableAndSwitchToIt(WebDriver driver, WebElement element) {
        WebDriver frameDriver = null;
        frameDriver = new WebDriverWait(driver, 60).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
        return frameDriver;
    }

    public void mouseOver(WebElement element) {
        Actions actions = new Actions(driver);
        waitForElement(element);
        actions.moveToElement(element).build().perform();
    }

    public void mouseClick(WebElement element) {
        Actions actions = new Actions(driver);
        waitForElement(element);
        actions.moveToElement(element).click(element).build().perform();
    }

    public void waitAndMouseClick(By by) {
        WebElement elmnt = waitForElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(elmnt).click(elmnt).build().perform();
    }

    public String alertGetText() {
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();

    }

    public void refreshBrowser() {
        driver.navigate().refresh();
    }

    public void waitAndAcceptAlert() {
        waitForSeconds(2);
        wait.until(ExpectedConditions.alertIsPresent()).accept();

    }

    public void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", element);
        waitForSeconds(1);
    }

    public void jsClick(By by) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)",
                driver.findElement(by));
        waitForSeconds(1);
    }

    public void jsScroll() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,1000)");

        waitForSeconds(1);
    }

    public void jsMouseHover(WebElement element) {
        //String strJavaScript = "var element = arguments[0];"
        //+ "var mouseEventObj = document.createEvent('MouseEvents');"
        //+ "mouseEventObj.initEvent( 'mouseover', true, true );" + "element.dispatchEvent(mouseEventObj);";

        ((JavascriptExecutor) driver).executeScript("arguments[0].onmouseover()", element);
    }

    public void jsEnterValue(WebElement elmnt, String strValue) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='';", elmnt);
        elmnt.sendKeys(strValue);
    }

    public void ElementselectByVisibleString(WebElement element, String strValue) {
        Select select = new Select(element);
        select.selectByVisibleText(strValue);
    }

    public void enterValue(WebElement elmnt, String strValue) {
        elmnt.click();
        elmnt.clear();
        waitForSeconds(1);
        elmnt.sendKeys(strValue);
    }

    public void waitForWindow(int inWindowIndex) {
        wait.until(ExpectedConditions.numberOfWindowsToBe(inWindowIndex));
    }

    public void closeWindow(int inWindowIndex) {


        driver.close();

    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void focusWindow(int inWindowIndex) {
        Object[] handles = driver.getWindowHandles().toArray();

        driver.switchTo().window((String) handles[inWindowIndex - 1]);
    }

    public void waitForText(By by, String strExpectedText) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, strExpectedText));
    }

    public Boolean waitForInvisibilityOfElement(WebElement element) {
        return invisibleWait.until(ExpectedConditions.invisibilityOf(element));
    }


    public void waitForPresenceOfElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public boolean verifyElement(WebElement element) {
        boolean isVerify = false;
        try {
            isVerify = element.isDisplayed();
        } catch (NoSuchElementException error) {
            error.getMessage();
            isVerify = false;
        }
        return isVerify;
    }

    public List<WebElement> waitForElements(List<WebElement> element) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public boolean takeScreenshot(String strScreeshotName) {
        Boolean isTaken = false;
        try {
            File imgSource = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String strFilePath = Reporter.getExtentHtmlReport().config().getFilePath().replace("report.html", "");
            System.out.println(strFilePath);
            FileUtils.copyFile(imgSource, new File(strFilePath + "/images/" + strScreeshotName + cap.utilities.DateUtil.getCurrentDate("dd-MM-yyyy-HH-mm-ss-sss") + ".png"));
            isTaken = true;
            Reporter.addScreenCaptureFromPath("images/" + strScreeshotName + cap.utilities.DateUtil.getCurrentDate("dd-MM-yyyy-HH-mm-ss-sss") + ".png");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isTaken;

    }

    public List<WebElement> numberOfElementsToBeMoreThan(By by, int count) {
        List<WebElement> ele = wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, count));
        return ele;
    }

    public boolean waitAndSelectByVisibleText(WebElement element, String strValue, By by, int count) {
        Boolean isSelected = false;
        numberOfElementsToBeMoreThan(by, count);
        ElementselectByVisibleString(element, strValue);
        isSelected = true;

        return isSelected;
    }

    public List<String> getOptionsInDropdown(WebElement element) {
        List<String> optionText = new ArrayList<>();
        Select select = new Select(element);
        select.getOptions().forEach(e -> {
            optionText.add(e.getText());
        });
        return optionText;
    }

    public boolean verifyElement(By element) {
        boolean isVerify = false;
        try {
            isVerify = driver.findElement(element).isDisplayed();
        } catch (NoSuchElementException error) {
            error.getMessage();
            isVerify = false;
        }
        return isVerify;
    }

    public static boolean verifyStringMatchedWithListOfElement(List<WebElement> elements, String strValue) {
        boolean isVerified = false;
        try {
            isVerified = elements.stream().allMatch(element -> element.getText().trim().contains(strValue));
            System.out.println(isVerified);
        } catch (Exception e) {
            isVerified = false;
            e.printStackTrace();
        }
        return isVerified;
    }

    public static boolean click(WebElement element) {
        boolean blResult = false;
        try {
            element.click();
            blResult = true;
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return blResult;
    }

    public static boolean doubleClick(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            Actions actions = new Actions(driver);
            actions.doubleClick(element).perform();
            blResult = true;
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return blResult;
    }

    public void keysInput(WebElement element, Keys strKey) {
        element.click();
        element.clear();
        waitForSeconds(1);
        element.sendKeys(strKey);
    }

    public void robotKey(WebElement element, int Keycode) {
        Robot robot = null;
        try {
            robot = new Robot();
            verifyElement(element);
            click(element);
            robot.keyPress(Keycode);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void robotKey(int Keycode) {
        Robot robot = null;
        try {
            robot = new Robot();
            robot.keyPress(Keycode);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public boolean waitAndClick(WebElement element) {
        Boolean isVerified = false;
        try {
            waitForElement(element);
            isVerified = click(element);
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return isVerified;
    }

    public static boolean keys(WebElement element, String strKey) {
        boolean blResult = false;
        try {
            element.sendKeys(strKey);
            blResult = true;
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));
        }
        return blResult;
    }

    public void jsScrollDown() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,200)");
        waitForSeconds(1);
    }


    public String getBrowserName() {
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = cap.getBrowserName().toLowerCase();
        System.out.println(browserName);
        return browserName;
    }


}