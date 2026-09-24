public class OptimalSolution {
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
    public static int[][]  rotateMatrix(int mat[][]){
        int n = mat.length;
        for(int i = 0 ; i < n - 2 ; i++){
            for(int j = i + 1 ; j < n - 1 ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0 ; i < n ; i++){
            reverseRow(mat[i]);
        }
        return mat;
    }
    public static void reverseRow(int arr[]){
        int left = 0 ;
        int right = arr.length - 1;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
