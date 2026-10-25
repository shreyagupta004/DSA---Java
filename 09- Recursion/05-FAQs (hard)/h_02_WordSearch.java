public class h_02_WordSearch {
    public static void main(String[] args) {
        String word = "SEE";
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        boolean res = wordSearch(word, board);
        System.out.println(res);
    }
    public static boolean wordSearch(String word,char[][] board){

        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(search(0,i,j,word, board)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(int idx, int row, int col, String word, char[][] board){
       
        if(idx == word.length()) return true;

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(idx)){
            return false;
        }
        char temp = board[row][col];
         board[row][col] = '#';

         boolean found = (search(idx+1, row-1, col, word, board) || search(idx+1, row+1, col, word, board)||
                          search(idx+1, row, col-1, word, board)  || search(idx+1, row, col+1, word, board));
         
        board[row][col] = temp;
        return found;
    }
}
