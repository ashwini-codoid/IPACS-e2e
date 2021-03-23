package cap.utilities;

import cap.helpers.Constants;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class ImageUtil {

    public static void waitAndClickImage(String strExpectedImagePath) {

        Screen screen = new Screen(0);

        try {
            screen.wait(strExpectedImagePath, 15).click();
        } catch (FindFailed e) {
            e.printStackTrace();
        }

    }

    public static void waitForImage(String strExpectedImagePath) {
        Screen screen = new Screen(0);
        try {
          //  screen.wait(strExpectedImagePath, 20);
            screen.wait(strExpectedImagePath);
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    public static void clickImage(String strExpectedImagePath) {
        Screen screen = new Screen(0);
        try {
            screen.click(strExpectedImagePath);
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    public static boolean compareImage(String strExpectedImagePath, String strImageName) {
        boolean blImageCompareResult = false;
        strExpectedImagePath = new StringBuilder(strExpectedImagePath).append(strImageName).toString();
        Screen s = new Screen();
        try {
            s.wait(strExpectedImagePath);
            Match compare = s.compare(strExpectedImagePath);
            if (!(compare == null)) {
                blImageCompareResult = true;
            }
        } catch (FindFailed e) {

        }

        return blImageCompareResult;
    }

}