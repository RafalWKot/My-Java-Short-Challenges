package FoldAnArray;

public class FoldAnArray {
    public static int[] foldArray(int[] array, int runs) {

        int[] arrayToFold = array;
        int[] arrayAfterFold;

        for (int i = 0; i < runs; i++) {
            int indexsToFold = arrayToFold.length / 2;
            if (arrayToFold.length % 2 == 1) {
                arrayAfterFold = new int[indexsToFold + 1];
                indexsToFold++;
            } else {
                arrayAfterFold = new int[indexsToFold];
            }
            for (int j = 0; j < indexsToFold; j++) {
                if (j == arrayToFold.length - 1 - j) {
                    arrayAfterFold[j] = arrayToFold[j];
                } else {
                    arrayAfterFold[j] = arrayToFold[j] + arrayToFold[arrayToFold.length - 1 - j];
                }
            }
            arrayToFold = arrayAfterFold;
        }
        return arrayToFold;
    }
}
