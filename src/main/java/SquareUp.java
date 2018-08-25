//Given n>=0, create an array length n*n with the following pattern,
// shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
//
//        squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
//        squareUp(2) → [0, 1, 2, 1]
//        squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

public class SquareUp {
    public int [] getSquareUp(int squareSide) {
        int [] square = new int[squareSide * squareSide];

        int numberLoop = squareSide;
        for (int i = squareSide * squareSide - 1 ; i >= 0; i = i - squareSide) {
                for (int j = 0; j < numberLoop; j++) {
                    square[i - j] = j + 1;
                }
                numberLoop--;
        }

        return square;
    }
}
