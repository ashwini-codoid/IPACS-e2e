package cap.utilities;

import cap.helpers.Constants;
import com.cucumber.listener.Reporter;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class SharedDriver {

    protected static WebDriver driver;
    protected static WebDriver mobileDriver;
    protected static WebDriver windowsDriver;
    protected static String strExecutionID;
    public static long randomID;

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver getWindowDriver() { return windowsDriver; }

    public static WebDriver getMobileDriver() {
        return mobileDriver;
    }

    static {
        TestDataUtil.loadData(Constants.TESTDATA_PATH, System.getProperty(Constants.ENV_VARIABLE_APPLICATION));
        String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
        strExecutionID = RandomGeneratorUtil.getRandomString();
        System.out.println("\n strExecutionID: " + strExecutionID);

        if (strExecutionType.equalsIgnoreCase("BROWSER")) {
            //Launch WebDriver
            driver = DriverUtil.getDriver();
            System.out.println("<----------------------WebDriver is launched---------------------->");
        } else if(strExecutionType.equalsIgnoreCase("REMOTE")) {
            System.out.println("<-------------- Remote WebDriver is Launched 1 --------->>> ");
            driver = DriverUtil.getRemoteDriver();
            System.out.println("<-------------- Remote WebDriver is Launched 2 --------->>> ");
        }else if (strExecutionType.equalsIgnoreCase("MOBILE")) {
            // Mobile Driver
            mobileDriver = DriverUtil.getMobileDriver();
            System.out.println("<----------------------Mobile Driver is launched---------------------->");
        } else if (strExecutionType.equalsIgnoreCase("WINDOWS")) {
            // Windows Driver
            windowsDriver = DriverUtil.getWindowDriver();
            System.out.println("<----------------------Window Driver is launched---------------------->");
        } else if (strExecutionType.equalsIgnoreCase("BOTH")) {
            //Launch WebDriver
            driver = DriverUtil.getDriver();
            System.out.println("<----------------------WebDriver is launched---------------------->");
            // Windows Driver
            windowsDriver = DriverUtil.getWindowDriver();
            System.out.println("<----------------------Window Driver is launched---------------------->");
        }else if (strExecutionType.equalsIgnoreCase("WEBMOBILE")) {
            //Launch WebDriver
            driver = DriverUtil.getDriver();
            System.out.println("<----------------------WebDriver is launched---------------------->");
            // Mobile Driver
            mobileDriver = DriverUtil.getMobileDriver();
            System.out.println("<----------------------Mobile Driver is launched---------------------->");
        }
    }

    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
            if (strExecutionType.equalsIgnoreCase("BROWSER"))
                driver.quit();
            else if (strExecutionType.equalsIgnoreCase("MOBILE"))
                mobileDriver.quit();
            else if (strExecutionType.equalsIgnoreCase("WINDOWS"))
                windowsDriver.quit();
            else if (strExecutionType.equalsIgnoreCase("BOTH")){
                driver.quit();
                windowsDriver.quit();}
            else if (strExecutionType.equalsIgnoreCase("WEBMOBILE")) {
                driver.quit();
                mobileDriver.quit();
            }
        }
    };

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    /*public SharedDriver(){
        super(driver);
        //driver = getDriver();

    }*/

}
