import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Board { // may implement runnable later.
    Piece[][] board;

    public static void main(String[] args) {
        // how to recognize possible moves? save them as array?
    }

    void initializeGame() {
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
        // board[0][0] = A1, [7][7] = H8
        // A7? == [6][0]


        board[2][0] = A2Pawn;
        board[2][1] = B2Pawn;
        board[2][2] = C2Pawn;
        board[2][3] = D2Pawn;
        board[2][4] = E2Pawn;
        board[2][5] = F2Pawn;
        board[2][6] = G2Pawn;
        board[2][7] = H2Pawn;

    }

    void legalMoveChecker(Piece piece) {// TODO: Display as dots on GUI

        int position = coordinateConverter(piece.getCurrentPosition());
        int i = position / 10; // i for first digit on array
        int j = position % 10; // j for second digit on array

        switch (piece.getType()) {
            case "Pawn" -> {
                // When pawns move for the first time, they can advance two tiles.

                if (piece.getColor() == "White" && (i == 2)) { // and is first time moving
                    // if pawn is white, advance towards greater row number.
                    // move: [i][j + 1] or [i][j + 2]
                    // attack: [i + 1][j + 1] or [i - 1][j + 1]
                } else {
                    // move: [i][j + 1]
                    // attack: [i + 1][j + 1] or [i - 1][j + 1]
                }

                if (piece.getColor() == "Black" && (i == 7)) {
                    // if pawn is black, advance towards lower row number.
                    // move: [i][j - 1] or [i][j - 2]
                    // attack: [i + 1][j - 1] or [i - 1][j - 1]
                } else {
                    // move: [i][j - 1]
                    // attack: [i + 1][j - 1] or [i - 1][j - 1]
                }
            }
            case "Rook" -> {
                /*
                Rooks can go anywhere as they want vertically and horizontally as long as there aren't any pieces in
                their way.
                */

                // Horizontal movement
                for (int k = 0; k < board[0].length; k++) {
                    if (k == j) {
                        continue;
                    }
                    // TODO: display dots on GUI
                    // if the tile is null, display. Else, consider attack
                }
                // Vertical movement
                for (int k = 0; k < board.length; k++) {
                    if (k == i) {
                        continue;
                    }
                    // TODO: display dots on GUI
                    // if the tile is null, display. Else, consider attack
                }
            }
        }
    }

    /**
     * coordinateConverter
     *
     * @param position is Chess algebraic notation. i.g: A7, E4
     * @return an integer representation of the corresponding array location [i][j],
     *  which its tens represent i, and ones represent j.
     *  int i = num / 10;
     *  int j = num % 10;
     */
    int coordinateConverter(String position) { // return integer, tens will be value for i and ones will be value for j.
        int num = 10 * (Character.getNumericValue(position.charAt(1)) - 1);
        // i.g: A7 is Row 7 column A. Array is [6][0] num is 60.

        switch (position.charAt(0)) {
            case 'A' -> num += 0;
            case 'B' -> num += 1;
            case 'C' -> num += 2;
            case 'D' -> num += 3;
            case 'E' -> num += 4;
            case 'F' -> num += 5;
            case 'G' -> num += 6;
            case 'H' -> num += 7;
        }
        return num;
    }
}
