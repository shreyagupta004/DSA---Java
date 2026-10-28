import java.util.*;
public class h_05_MColoringProblem {
    public static void main(String[] args) {
         int n = 3;
         int m = 3;

        List<Integer>[] G = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            G[i] = new ArrayList<>();
        }

        G[0].add(1);
        G[1].add(0);
        G[1].add(2);
        G[2].add(1);
        G[0].add(2);
        G[2].add(0);

        int[] color = new int[n];
        System.out.println(mColor(n, m, color, G));
    }
    public static boolean mColor(int node, int m, int[] color, List<Integer>[] G){
        if(node == color.length) return true;

        for(int col = 1; col <= m; col++){
            if(possible(node,m,color,G)){
                color[node] = col;
                if(mColor(node+1, m,color,G) == true) return true;
                color[node] = 0;
            }
        }
        return false;
    }
    public static boolean possible(int node, int col, int[] color, List<Integer>[] G){
        for (int neighbor : G[node]) {
        if (color[neighbor] == col) return false;
    }
        return true;
    } 
}
