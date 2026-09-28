public class BetterSolution{
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,3};
        int ans = maximumSubArraySum(arr);
        System.out.println(ans);
    }
    public static int maximumSubArraySum(int arr[]){
        long max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            long sum = 0;
            for(int j = i ; j < arr.length ; j++){
                sum += arr[j];
                max = Math.max(max , sum);
            }
        }
        return (int) max;
    }
}