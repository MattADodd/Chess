package Components;

import java.util.Hashtable;

public class Board {
    Piece[][] state; // 2D array to represent the chess board
    
    Hashtable<String, Integer> columns = new Hashtable<>(); // Hashtable to map column letters to their corresponding indices
    
    // Constructor initializes the chess board and places pieces in their initial positions
    public Board() {
        state = new Piece[8][8];
        setPawns();
        setRooks();
        setKnights();
        setBishops();
        setKings();
        setQueens();
        setHashTable();
    }

    // Method to perform a chess piece movement (not implemented in this code)
    public void movePiece(String columnLetter, int row, int[] location) {
        int[] newPosition = new int[2];
        newPosition[0] = row;
        newPosition[1] = columns.get(columnLetter);
        Piece piece = state[location[0]][location[1]];
        piece.move(location, newPosition, state);
        if (piece.getCanMove()) {
            state[location[0]][location[1]] = null;
            state[row][columns.get(columnLetter)] = piece;
        }
        //else System.out.printerrormsg
    }

    // Method to convert column letter and row number to array indices
    public int[] selectPiece(String columnLetter, int row) {
        int[] location = new int[2];
        row = row - 1; // Convert 1-based indexing to 0-based indexing
        int columnNumber = columns.get(columnLetter);
        location[0] = row;
        location[1] = columnNumber;
        return location;
    }

    // Method to visualize the chess board
    public void visualizeBoard() {
        System.out.println("  _______________");
        for (int i = 0; i < 8; i++) {
            if (i != 0) {
                System.out.println(" |-|-|-|-|-|-|-|-|");
            }
            for (int j = 0; j < 8; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + "|");
                }
                if (state[i][j] == null) {
                    System.out.print(" ");
                } else {
                    state[i][j].printName();
                }
                System.out.print("|");
                if (j == 7) {
                    System.out.print("\n");
                }
            }
        }
        System.out.println("  ----------------\n  A B C D E F G H");
    }

    // Helper method to set initial positions of pawns on the chess board
    private void setPawns() {
        for (int i = 0; i < state[1].length; i++) {
            Pawn pawn = new Pawn();
            state[1][i] = pawn;
            Pawn pawnB = new Pawn();
            pawnB.makeBlack();
            state[6][i] = pawnB;
        }
    }

    // Helper method to set initial positions of rooks on the chess board
    private void setRooks() {
        for (int i = 0; i <= 7; i += 7) {
            Rook rook = new Rook();
            state[0][i] = rook;
            Rook rookB = new Rook();
            rookB.makeBlack();
            state[7][i] = rookB;
        }
    }

    // Helper method to set initial positions of knights on the chess board
    private void setKnights() {
        for (int i = 1; i <= 6; i += 5) {
            Knight knight = new Knight();
            state[0][i] = knight;
            Knight knightB = new Knight();
            knightB.makeBlack();
            state[7][i] = knightB;
        }
    }

    // Helper method to set initial positions of bishops on the chess board
    private void setBishops() {
        for (int i = 2; i <= 5; i += 3) {
            Bishop bishop = new Bishop();
            state[0][i] = bishop;
            Bishop bishopB = new Bishop();
            bishopB.makeBlack();
            state[7][i] = bishopB;
        }
    }

    // Helper method to set initial positions of kings on the chess board
    private void setKings() {
        King king = new King();
        state[0][4] = king;
        King kingB = new King();
        kingB.makeBlack();
        state[7][4] = kingB;
    }

    // Helper method to set initial positions of queens on the chess board
    private void setQueens() {
        Queen queen = new Queen();
        state[0][3] = queen;
        Queen queenB = new Queen();
        queenB.makeBlack();
        state[7][3] = queenB;
    }

    // Helper method to populate the Hashtable for column letters and their corresponding indices
    private void setHashTable() {
        columns.put("A", 0);
        columns.put("B", 1);
        columns.put("C", 2);
        columns.put("D", 3);
        columns.put("E", 4);
        columns.put("F", 5);
        columns.put("G", 6);
        columns.put("H", 7);
    }
    
    
}
