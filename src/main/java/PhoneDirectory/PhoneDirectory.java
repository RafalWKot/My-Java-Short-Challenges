package PhoneDirectory;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneDirectory {
    public static  String phone(String string, String num) {

        String [] contacts = string.split("\\n");
        System.out.println(contacts[0]);

        Pattern patternNumber = Pattern.compile("\\d{1,2}-\\d{3}-\\d{3}-\\d{4}");
        Pattern patternName = Pattern.compile("(<.*>)");
        Matcher matcher = null;

        for(int i = 0; i < contacts.length; i++) {
            matcher = patternNumber.matcher(contacts[i]);
            matcher.find();
            System.out.println(matcher.group());
            matcher = patternName.matcher(contacts[i]);
            matcher.find();
            System.out.println(matcher.group());
        }

        return null;
    }
}
