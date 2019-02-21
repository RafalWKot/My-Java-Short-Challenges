package StreetFighter2_CharacterSelection;

public enum Move {
    UP("up"),
    DOWN("down"),
    LEFT("left"),
    RIGHT("right");

    private String move;

    Move(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }

    public static Move fromString(String move) {
        for (Move m : Move.values()) {
            if (m.move.equalsIgnoreCase(move)) {
                return m;
            }
        }
        return null;
    }
}
