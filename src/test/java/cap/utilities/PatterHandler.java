package cap.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by codoid-pc on 11/2/2021.
 */
public class PatterHandler {


    public static String getFirstMatch(String strPattern, String strValue) {
        String strFirstMatch = strValue;
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(strValue);
        if (matcher.find()) {
            strFirstMatch = matcher.group();
        }
        return strFirstMatch;
    }
}


