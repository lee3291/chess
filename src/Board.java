import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Board { // may implement runnable later.
    Piece[][] board;

    public static void main(String[] args) {

    }

    void gameInitializer() {
        // White pawns
        Piece A2Pawn = new Piece("A2Pawn", "Pawn", "White", "A2");
        Piece B2Pawn = new Piece("B2Pawn", "Pawn", "White", "B2");
        Piece C2Pawn = new Piece("C2Pawn", "Pawn", "White", "C2");
        Piece D2Pawn = new Piece("D2Pawn", "Pawn", "White", "D2");
        Piece E2Pawn = new Piece("E2Pawn", "Pawn", "White", "E2");
        Piece F2Pawn = new Piece("F2Pawn", "Pawn", "White", "F2");
        Piece G2Pawn = new Piece("G2Pawn", "Pawn", "White", "G2");
        Piece H2Pawn = new Piece("H2Pawn", "Pawn", "White", "H2");

        // Black pawns
        Piece A7Pawn = new Piece("A7Pawn", "Pawn", "Black", "A7");
        Piece B7Pawn = new Piece("B7Pawn", "Pawn", "Black", "B7");
        Piece C7Pawn = new Piece("C7Pawn", "Pawn", "Black", "C7");
        Piece D7Pawn = new Piece("D7Pawn", "Pawn", "Black", "D7");
        Piece E7Pawn = new Piece("E7Pawn", "Pawn", "Black", "E7");
        Piece F7Pawn = new Piece("F7Pawn", "Pawn", "Black", "F7");
        Piece G7Pawn = new Piece("G7Pawn", "Pawn", "Black", "G7");
        Piece H7Pawn = new Piece("H7Pawn", "Pawn", "Black", "H7");

        board = new Piece[8][8];
        // board[0][a], numbers are vertical, letters are horizontal.
        // board[0][0] = A1
        // board[7][0] = A8

        board[2][0] = A2Pawn;
    }
}
