public class D_04_PeakElement{
    public static void main(String[] args) {
        int arr[][] = {{10,20,15},{21,30,14},{7,16,32}};
        int res[] = peakElement(arr);
        System.out.println(res[0] + " " + res[1]);
    }
    public static int[] peakElement(int arr[][]){
        int n = arr.length, m = arr[0].length;
        int low = 0, high = m - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int row = maxElement(arr,mid);
            int left = -1, right = -1;
             
            if(mid - 1 >= 0) {
                 left = arr[row][mid - 1];
            }
            
            if(mid + 1 < m) {
                 right = arr[row][mid + 1];
            }
            if(arr[row][mid] > left && arr[row][mid] > right) {
                return new int []{row, mid};
            }
            else if(arr[row][mid] > left) low = mid + 1;
            else high = mid - 1;
        }
        return new int []{-1,-1};
    }
    public static int maxElement(int arr[][], int col){
        int maxEl = Integer.MIN_VALUE;
        int row = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i][col] > maxEl){
                maxEl = arr[i][col];
                row = i;
            }
        }
        return row;
    }
}