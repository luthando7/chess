package org.chess.pieces;

public class Pawn extends Piece {
    protected Pawn(String name, String color, int[][] position) {
        super(name, color, position);

    }

    @Override
    public boolean isValidMove(int[][] destination) {
        return false;
    }
}
