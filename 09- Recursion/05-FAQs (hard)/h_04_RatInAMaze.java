import java.util.*;
public class h_04_RatInAMaze {
    public static void main(String[] args) {
        
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int n = maze.length;
        List<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];

        int[] di = {1, 0, 0, -1};
        int[] dj = {0, -1, 1, 0};
        if (maze[0][0] == 1) {
            rat(0, 0, n, maze, ans, "", visited, di, dj);
        }

        System.out.println(ans);
    }
    public static void rat(int i, int j, int n, int[][] maze, List<String> ans, String move, boolean[][] visisted, int[] di, int[] dj){
        
        if(i == n-1 && j == n-1){
            ans.add(new String(move));
        }
        String dir = "DLRU";
        for(int idx = 0; idx < 4; idx++){
            int nexti = i + di[idx];
            int nextj = j + dj[idx];
            if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && !visisted[nexti][nextj] && maze[nexti][nextj] == 1){
                visisted[i][j] = true;
                rat(nexti, nextj, n, maze, ans, move + dir.charAt(idx), visisted, di, dj);
                visisted[i][j] = false;
            }
        }
    }
}
