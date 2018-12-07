package MostsDigits;

import java.util.Arrays;

public class MostDigits {
    public static int findLongest(int[] numbers) {

        String[] numbersStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersStr[i] = String.valueOf(numbers[i]);
        }

        int length = Arrays.stream(numbersStr)
                .mapToInt(i -> i.length())
                .max().orElse(0);

        for (int i = 0; i < numbers.length; i++) {
            if (numbersStr[i].length() == length) {
                return numbers[i];
            }
        }
        return 0;
    }
}
