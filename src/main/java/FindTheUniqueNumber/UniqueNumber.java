//There is an array with some numbers. All numbers are equal except for one. Try to find it!

package FindTheUniqueNumber;

import java.util.Arrays;

public class UniqueNumber {
    public static double findUniq(double arr[]) {

        Arrays.sort(arr);
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        return arr[arr.length - 1];
    }
}
