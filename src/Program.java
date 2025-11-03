import java.util.Scanner;

public class Program {
    public static void main (String[]args) {


        Scanner sc = new Scanner(System.in);
        Character [][] mat = new Character[8][8];
        String position;
        String nextPosition;
        char col;
        int row;
        char column;
        int nextR;


        char king = 'K';
        char queen = 'Q';
        char rook = 'R';
        char knight = 'N';
        char bishop = 'B';
        char pawn = 'P';


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                mat[i][j] = '-';
            }
            System.out.println();
        }
        mat[6][0] = pawn;
        mat[6][1] = pawn;
        mat[6][2] = pawn;
        mat[6][3] = pawn;
        mat[6][4] = pawn;
        mat[6][5] = pawn;
        mat[6][6] = pawn;
        mat[6][7] = pawn;
        mat[1][0] = pawn;
        mat[1][1] = pawn;
        mat[1][2] = pawn;
        mat[1][3] = pawn;
        mat[1][4] = pawn;
        mat[1][5] = pawn;
        mat[1][6] = pawn;
        mat[1][7] = pawn;
        mat[7][0] = rook;
        mat[7][1] = knight;
        mat[7][2] = bishop;
        mat[7][3] = queen;
        mat[7][4] = king;
        mat[7][5] = bishop;
        mat[7][6] = knight;
        mat[7][7] = rook;
        mat[0][0] = rook;
        mat[0][1] = knight;
        mat[0][2] = bishop;
        mat[0][3] = queen;
        mat[0][4] = king;
        mat[0][5] = bishop;
        mat[0][6] = knight;
        mat[0][7] = rook;

        while (true) {
            resetScreen();
            for (int i = 0; i < 8; i++) {
                System.out.print(8 - i + " ");
                for (int j = 0; j < 8; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("  a b c d e f g h");
            System.out.println();
            System.out.print("Source: ");
            position = sc.nextLine();
            col = position.charAt(0);
            row = Integer.parseInt(position.substring(1));
            resetScreen();
            for (int i = 0; i < 8; i++) {
                System.out.print(8 - i + " ");
                for (int j = 0; j < 8; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("  a b c d e f g h");

            System.out.println();
            System.out.print("Target: ");
            nextPosition = sc.nextLine();
            column = nextPosition.charAt(0);
            nextR = Integer.parseInt(nextPosition.substring(1));
            resetScreen();
            int nr = convertRow(row);
            int nc = convertColumn(col);
            int nrr = convertRow(nextR);
            int ncc = convertColumn(column);
            Program.movePiece(nr, nc, nrr, ncc, mat);
        }
    }
    public static void resetScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void movePiece(int row, int column, int nextR, int nextC, Character[][] mat) {
        if(mat[row][column] == 'P') {
            mat[row][column] = '-';
            mat[nextR][nextC] = 'P';
        }
        if(mat[row][column] == 'R') {
            mat[row][column] = '-';
            mat[nextR][nextC] = 'R';
        }
        if(mat[row][column] == 'N') {
            mat[row][column] = '-';
            mat[nextR][nextC] = 'N';
        }
        if(mat[row][column] == 'K') {
            mat[row][column] = '-';
            mat[nextR][nextC] = 'K';
        }
        if(mat[row][column] == 'Q') {
            mat[row][column] = '-';
            mat[nextR][nextC] = 'Q';
        }
        if(mat[row][column] == 'B') {
            mat[row][column] = '-';
            mat[nextR][nextC] = 'B';
        }
    }
    public static int convertRow( int row) {
        int crow;

        crow = 8 - row;
        return crow;
    }
    public static int convertColumn(char column) {
        int ccolumn;
        if(column == 'a') {
            ccolumn = 0;
        }
        else if(column == 'b') {
            ccolumn =  1;
        }
        else if(column == 'c') {
            ccolumn =  2;

        }
        else if(column == 'd') {
            ccolumn =  3;

        }
        else if(column == 'e') {
            ccolumn =  4;

        }
        else if(column == 'f') {
            ccolumn =  5;

        }
        else if(column == 'g') {
            ccolumn = 6;

        }
        else {
            ccolumn = 7;
        }
        return ccolumn;
    }

}
