public class D_03_searchIn2DMatrixII {
    public static void main(String[] args) {
        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean ans = searchIn2DMatrix(arr, 99);
        System.out.println(ans);
    }
    public static boolean searchIn2DMatrix(int arr[][], int target){
        int n = arr.length, m = arr[0].length;
        int row = 0, col = m - 1;
        while(row < n && col >= 0){
            if(arr[row][col] == target) return true;
            else if(arr[row][col] > target) col--;
            else row++;
        }
        return false;
    }
}
