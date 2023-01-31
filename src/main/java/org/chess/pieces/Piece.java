package org.chess.pieces;

public abstract class Piece {
    private final String name;
    private final String color;
    private int[][] position;

    protected Piece(String name, String color, int[][] position) {
        this.name = name;
        this.color = color;
        this.position = position;
    }

    /**
     * Checks if the move is valid for the given piece
     * @return True if move is valid
     */
    public abstract boolean isValidMove(int[][] destination);

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }
}
