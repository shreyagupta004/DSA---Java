public class BetterSolution{
    public static void main(String args[]){
         int arr[][] = {{1,1,1,1} , {1,0,0,1} , {1,1,0,1} , {1,1,1,1}};
        int ans[][] = setMartixZeroes(arr);
        for(int i = 0 ; i < ans.length ; i++){
            for(int j = 0 ; j < ans[0].length ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] setMartixZeroes(int arr[][]){
        int row [] = new int[arr.length];
        int col[] = new int [arr[0].length];

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] == 0){
                   row[i] = 1;
                   col[j] = 1;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
        
    }
}