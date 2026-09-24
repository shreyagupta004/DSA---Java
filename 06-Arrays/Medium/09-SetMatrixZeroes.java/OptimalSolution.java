public class OptimalSolution{
    public static void main(String args[]){
        int arr[][] = {{1,1,1,1} , {1,0,0,1} , {1,1,0,1} , {1,1,1,1}};
        int ans[][] = setMatixZeroes(arr);
        for(int i = 0 ; i < ans.length ; i++){
            for(int j = 0 ; j < ans[0].length ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] setMatixZeroes(int arr[][]){
        //row -> arr[..][0]
        //col -> arr[0][..]
        int col0 = 1;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 1;
                    if(j != 0){
                         arr[0][j] = 1;
                    }
                    else{
                        col0 = 0;
                    }
                   
                }
            }
        }
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 1 ; j < arr[0].length ; j++){
                if(arr[i][j] != 0){
                    if(arr[i][0] == 0 || arr[0][j] == 0){
                        arr[i][j] = 0;
                    }
                }
            }
        }
        if(arr[0][0] == 0 ){
            for(int j = 0 ; j < arr[0].length ; j++){
                arr[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i = 0 ; i < arr.length ; i++){
                arr[i][0] = 0;
            }
        }
        return arr;
    }
}