package StreetFighter2_CharacterSelection;

public enum Move {
    UP("up"),
    DOWN("down"),
    LEFT("left"),
    RIGHT("right");

    String move;

    Move(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }
}
