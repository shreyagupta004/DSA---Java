

public class OptimalSolution01 {
    public static void main(String[] args) {
        int num[] = {6,3,2,1,5,7,8};
        int res = missingNumber(num);
        System.out.println(res);
    }
    public static int missingNumber(int arr[]){
        int n  = arr.length + 1;
        int expSum = (n * (n + 1)) / 2;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }

        int ans = expSum - sum;
        return ans;
    }
}
