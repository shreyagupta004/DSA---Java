public class BruteForceolution {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4} , {5,6,7,8},{9,10,11,12} , {13,14,15,16}};
        int ans[][] = rotateMatrix(arr);
        for(int i = 0 ; i < ans.length ; i++){
            for(int j = 0 ; j < ans[i].length ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static int[][] rotateMatrix(int arr[][]){
        int n = arr.length;
        int ans[][] = new int[n][n]; 
        for(int i = 0 ; i <= n ; i++ ){
            for(int j = 0 ; j <= n ; j++){
                ans[j][n - i - 1] = arr[i][j];
            }
        }
        return ans;
    }
 }
