//A digital root is the recursive sum of all the digits in a number.
//Given n, take the sum of the digits of n. If that value has two digits,
//continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
//
//Here's how it works:
//digital_root(16)
//=> 1 + 6
//=> 7
//digital_root(942)
//=> 9 + 4 + 2
//=> 15 ...
//=> 1 + 5
//=> 6


package SumOfDigits;

import java.util.Arrays;

public class SumOfDigits {

    public int getSumOfDigits(int n) {
        String[] digits = String.valueOf(n).split("");
        if (digits.length == 1) {
            return Integer.valueOf(digits[0]);
        }
        Integer newDigit = Arrays.stream(digits)
                .map(Integer::new)
                .reduce(0, Integer::sum);
        return  getSumOfDigits(newDigit);
    }
}
