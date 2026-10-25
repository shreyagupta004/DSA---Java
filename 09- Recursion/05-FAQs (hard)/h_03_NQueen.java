import java.util.*;
public class h_03_NQueen {
    public static void main(String args[]){
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                board[i][j] = '.';
            }
        }
        int leftRow[] = new int[4];
        int upperDiagonal[] = new int[2 * 4 - 1];
        int lowerDiagonal[] = new int[2 * 4 - 1];

        //nQueen(0, 4, board, ans);

        nQueens(0, 4, board, ans, leftRow, upperDiagonal, lowerDiagonal);
        System.out.println(ans);

    }
    public static void nQueen(int col, int n, char[][] board, List<List<String>> ans){

        if (col == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }
            ans.add(solution);
            return;
        }

        for(int row = 0; row < n; row++){
            if(isSafe(row, col, n, board)){
                board[row][col] = 'Q';
                nQueen(col+1, n, board, ans);
                board[row][col] = '.';
            }
        }
    }
    public static boolean isSafe(int row, int col, int n, char board[][]){
        int dupRow = row;
        int dupcol = col;

        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dupRow;
        col = dupcol;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        row = dupRow;
        col = dupcol;
        while(row < n && col >= 0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }

    //optimized way using hashing--
    public static void nQueens(int col, int n, char[][] board, List<List<String>> ans, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal){
        if (col == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }
            ans.add(solution);
            return;
        }
        for(int row = 0; row < n; row++){

            if(leftRow[row] == 0 && upperDiagonal[n-1 + col-row] == 0 && lowerDiagonal[row+col] == 0){

                board[row][col] = 'Q';

                leftRow[row] = 1;
                upperDiagonal[n-1+col-row] = 1;
                lowerDiagonal[row+col] = 1;

                nQueens(col+1, n, board, ans, leftRow, upperDiagonal, lowerDiagonal);

                board[row][col] = '.';

                leftRow[row] = 0;
                upperDiagonal[n-1+col-row] = 0;
                lowerDiagonal[row+col] = 0;
            }
           
        }

    }
}
