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
