package SquaresInARectangle;

class SquaresInARectangle {

    static int findSquares(int x, int y){

        int totalNumberOfSquares;
        totalNumberOfSquares = x * y;
        for (int i = 2; i <= x; i++) {
            if (i <= y) {
                totalNumberOfSquares += (x + 1 - i) * (y + 1 - i);
            }
        }

        return totalNumberOfSquares;
    }
}
