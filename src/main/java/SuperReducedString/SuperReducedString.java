package SuperReducedString;

public class SuperReducedString {

    public static String superReducedString(String str) {

        StringBuilder newStrBuilder = new StringBuilder(str);
        int previousLengthOfString = 0;
        while (newStrBuilder.length() != previousLengthOfString) {
            previousLengthOfString = newStrBuilder.length();
            for (int i = 0; i < newStrBuilder.length() - 1; i++) {
                if (newStrBuilder.charAt(i) == newStrBuilder.charAt(i + 1)) {
                    newStrBuilder.replace(i, i + 2, "");
                    break;
                }
            }
        }
        if (newStrBuilder.length() == 0) {
            return "Empty String";
        }
        return newStrBuilder.toString();
    }
}
