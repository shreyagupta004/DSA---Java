public class BruteForceSolution{
    public static void main(String args[]){
        int arr[][] = {{1,1,1,1} , {1,0,0,1} , {1,1,0,1} , {1,1,1,1}};
        setMatrixZeroes(arr);
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] setMatrixZeroes(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ;j++){
                if(arr[i][j] == 0){
                    markRows(arr , i);
                    markCols(arr , j);
                }
            }
        }
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ;j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }    
        
        return arr;
    }
    public static void markRows(int arr[][] ,int i){
        
        for(int j = 0 ; j < arr[0].length; j++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }
     public static void markCols(int arr[][] ,int j){
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }
    
}