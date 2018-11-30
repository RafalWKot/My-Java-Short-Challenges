//Take 2 strings s1 and s2 including only letters from ato z.
//Return a new sorted string, the longest possible, containing distinct letters,
//each taken only once - coming from s1 or s2.
//#Examples:  a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"
//a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

package TwoToOne;

import java.util.*;

public class TwoToOne {

    public  String longest (String s1, String s2) {
        Set<Character> resultSet = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(s1.subSequence(i, i + 1))) {
                resultSet.add(s1.subSequence(i, i + 1).charAt(0));
            }
        }
        List<Character> resultList = new ArrayList<>(resultSet);
        resultList.sort(Comparator.naturalOrder());

        String longestStr = "";
        for (Character ch: resultList) {
            longestStr += ch;
        }
        return longestStr;
    }
}
