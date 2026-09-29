public class BruteForceSolution{
    public static void main(String[] args) {
        int arr[] = {2,3,-4,5};
        int ans = maximumProductsubarray(arr);
        System.out.println(ans);
    }
    public static int maximumProductsubarray(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n; i++){
            int prod = 1;
            for(int j = i ; j < n ; j++){
                prod = prod * arr[j];
                max = Math.max(prod , max);
            }
        }
        return max;
    }
}