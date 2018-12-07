//You have an array of numbers.
//Your task is to sort ascending odd numbers but even numbers must be on their places.
//Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
//Example
//sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]

package SortTheOdd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {

        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odds.add(array[i]);
            }
        }
        odds.sort(Comparator.naturalOrder());
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = odds.get(index);
                index++;
            }
        }
        return array;
    }
}
