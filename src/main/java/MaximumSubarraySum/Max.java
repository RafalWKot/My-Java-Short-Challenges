//The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
//
//Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
//// should be 6: {4, -1, 2, 1}
//Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
//If the list is made up of only negative numbers, return 0 instead.
//
//Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.

package MaximumSubarraySum;

import java.util.ArrayList;
import java.util.List;

public class Max {
    public static int sequence(int[] arr) {

        int sum = 0;
        List<Integer> subArray = new ArrayList<>();
        List<Integer> subArrayResult = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                subArray.add(arr[j]);
                int sumStep = subArray.stream().reduce(0, Integer::sum);
                if (sum < sumStep) {
                    subArrayResult = new ArrayList<>(subArray);
                    sum = sumStep;
                }
            }
            subArray.clear();
        }
        return subArrayResult.stream().reduce(0, Integer::sum);
    }
}
