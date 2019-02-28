package MergedString;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {

        int indexFromPart1 = -1;
        int indexFromPart2 = -1;
        int indexActualFromPart1;
        int indexActualFromPart2;

        for (int i = 0; i < s.length(); i++) {

            indexActualFromPart1 = findIndexOfChar(s.charAt(i), part1);
            indexActualFromPart2 = findIndexOfChar(s.charAt(i), part2);

            if (indexActualFromPart1 == -1 & indexActualFromPart2 == -1) {
                return false;
            }

            if (indexActualFromPart1 > indexFromPart1) {
                indexFromPart1 = indexActualFromPart1;
            } else if (indexActualFromPart2 > indexFromPart2) {
                indexFromPart2 = indexActualFromPart2;
            } else {
                return false;
            }
        }

        return true;
    }

    private static int findIndexOfChar(char ch, String part) {
        for (int i = 0; i < part.length(); i++) {
            if (ch == part.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}