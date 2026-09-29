public class OptimalSolution{
    public static void main(String[] args) {
        int arr[] = {2,3,-4,5};
        int ans = maximumProductsubarray(arr);
        System.out.println(ans);
    }
    public static int maximumProductsubarray(int arr[]){
        int n = arr.length;
        int suffix = 1;
        int prefix = 1;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){

            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            suffix = suffix * arr[i];
            prefix = prefix * arr[n - i - 1];
            max = Math.max(max , Math.max(prefix , suffix));

        }
        return max;
    }
}