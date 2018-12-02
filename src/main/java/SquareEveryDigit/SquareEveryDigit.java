package SquareEveryDigit;

import java.util.Arrays;

public class SquareEveryDigit {

    public int squareDigits(int n) {
        String[] digits = String.valueOf(n).split("");
        return Integer.valueOf(
                String.join("", Arrays.stream(digits)
                    .map(Integer::new)
                    .map(digitInt -> digitInt * digitInt)
                    .map(String::valueOf)
                    .toArray(String[]::new)
                )
        );
    }
}
