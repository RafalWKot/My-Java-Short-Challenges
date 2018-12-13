//Write Number in Expanded Form
//You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//        Kata.expandedForm(12); # Should return "10 + 2"
//        Kata.expandedForm(42); # Should return "40 + 2"
//        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//        NOTE: All numbers will be whole numbers greater than 0.


package WriteNumberInExpandedForm;

import java.util.ArrayList;
import java.util.List;

public class ExpandForm {
    public static String expandedForm(int num) {
        String [] numbers = String.valueOf(num).split("");
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].equals("0")) {
                int number = Integer.valueOf(numbers[i]) * (int) Math.pow(10, numbers.length - 1 - i);
                strings.add(String.valueOf(number));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            stringBuilder.append(strings.get(i));
            if (i < strings.size() - 1) {
                stringBuilder.append(" + ");
            }
        }
        return stringBuilder.toString();
    }
}
