package cap.utilities;

import java.util.Random;

public class RandomGeneratorUtil {

    /*@Description: Generate a new random String */
    public static String getRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (new Random().nextFloat() * (rightLimit - leftLimit));
            buffer.append((char) randomLimitedInt);
        }
        String strRandomID = new StringBuilder("-A").append(buffer).toString();
        return strRandomID.toUpperCase();
    }

    public static String getExecutionID() {
        return SharedDriver.strExecutionID;
    }

}
