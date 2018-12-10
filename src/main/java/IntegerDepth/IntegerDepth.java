package IntegerDepth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntegerDepth {

    public int computeDepth(int n) {

        Set<Integer> numbers = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int step = 1;
        int value = 0;
        String [] digits;
        while (numbers.size() > 0) {
            value = n * step;
            digits = String.valueOf(value).split("");
            for(int i = 0; i < digits.length; i++) {
                numbers.remove(Integer.valueOf(digits[i]));
            }
            step++;
        }
        return step - 1;
    }
}
