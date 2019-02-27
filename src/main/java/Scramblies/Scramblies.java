package Scramblies;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {

        int trueCondition = 0;
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == str2.charAt(i)) {
                    str1 = removeCharFromString(str1, j);
                    trueCondition++;
                    break;
                }
            }
        }
        if (trueCondition == str2.length()) {
            return true;
        }
        return false;
    }

    private static String removeCharFromString(String str1, int index) {

        if (str1 == null) {
            return str1;
        }

        if (index < 0 || index > str1.length()) {
            return str1;
        }

        char[] chars = str1.toCharArray();
        chars[index] = ' ';

        return String.valueOf(chars);
    }
}
