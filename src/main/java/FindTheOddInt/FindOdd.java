//Given an array, find the int that appears an odd number of times.
//There will always be only one integer that appears an odd number of times.

package FindTheOddInt;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {
        a = Arrays.stream(a)
                .sorted()
                .toArray();

        int count = 0;
        for(int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]){
                count++;
            }
            else {
                if (count % 2 == 0) {
                    return a[i];
                }
                else {
                    count = 0;
                }
            }
        }
        if (a.length < 2) {
            return a[0];
        }
        return a[a.length - 1];
    }
}
