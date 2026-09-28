public class OptimalSolution {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,3};
        int ans = maximumSubArraySum(arr);
        System.out.println(ans);
    }
    public static int maximumSubArraySum(int arr[]){
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > max){
                max = sum;
            }
            if(max < 0){
                max = 0;
            }
        }
        return(int) max;
    }

}
