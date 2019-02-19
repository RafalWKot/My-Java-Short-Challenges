package StreetFighter2_CharacterSelection;

public class CharacterSelection {

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){

        if (moves.length == 0) {
            return new String[]{};
        }


        return null;
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
            return verticalPosition -1;
        } else if (move == Move.UP){
            return verticalPosition - 1;
        }
        if (move == Move.DOWN && verticalPosition == (verticalLength - 1)) {
            return 0;
        } else if (move == Move.RIGHT) {
            return verticalPosition + 1;
        }
        return -1;
    }


}
