package StreetFighter2_CharacterSelection;

public class CharacterSelection {

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
        if (moves.length == 0) {
            return new String[]{};
        }

        String [] selectedFigters = new String[moves.length];
        int [] actaulPosition = position;
        for (int i = 0; i < moves.length; i++) {
            if (moves[i] == Move.LEFT.getMove() || moves[i] == Move.RIGHT.getMove()) {
                actaulPosition[1] = getIndexHorizontal(fighters[0].length, actaulPosition[1], Move.fromString(moves[i]));
                selectedFigters[i] = fighters[actaulPosition[0]][actaulPosition[1]];
            } else if (moves[i] == Move.UP.getMove() || moves[i] == Move.DOWN.getMove()) {
                actaulPosition[0] = getIndexVertical(fighters.length, actaulPosition[0], Move.fromString(moves[i]));
                selectedFigters[i] = fighters[actaulPosition[0]][actaulPosition[1]];
            } else {
                return null;
            }
        }
        return selectedFigters;
    }

    private static int getIndexHorizontal(int horizontalLength, int horizontalPosition, Move move) {

        if (move == Move.LEFT && horizontalPosition == 0) {
            return horizontalLength -1;
        } else if (move == Move.LEFT){
            return horizontalPosition - 1;
        }
        if (move == Move.RIGHT && horizontalPosition == (horizontalLength - 1)) {
            return 0;
        } else if (move == Move.RIGHT) {
            return horizontalPosition + 1;
        }
        return -1;
    }

    private static int getIndexVertical(int verticalLength, int verticalPosition, Move move) {

        if (move == Move.UP && verticalPosition == 0) {
            return 0;
        } else if (move == Move.UP){
            return verticalPosition - 1;
        }
        if (move == Move.DOWN && verticalPosition == (verticalLength - 1)) {
            return verticalLength - 1;
        } else if (move == Move.DOWN) {
            return verticalPosition + 1;
        }
        return -1;
    }
}
