//You are given an array of numbers. Find out the array index or position
//where sum of numbers preceeding the index is equals to sum of numbers
//succeeding the index.

package EqualSum;

public class FinderEqualSum {

    private final int[] arrayOfNumbers;

    public FinderEqualSum(int[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    public int findIndexEqualSum() {
        if (arrayOfNumbers.length % 2 != 0) {
            return -1;
        }
        int i = 0;
        int j = arrayOfNumbers.length - 1;
        int sumA = arrayOfNumbers[i];
        int sumB = arrayOfNumbers[j];
        while (i + 1 != j) {
            if (sumA < sumB) {
                i++;
                sumA += arrayOfNumbers[i];
            } else {
                j--;
                sumB += arrayOfNumbers[j];
            }
        }
        if (sumA == sumB) {
            return i;
        } else {
            return -1;
        }
    }
}
