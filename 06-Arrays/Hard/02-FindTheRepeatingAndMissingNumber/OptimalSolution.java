import java.util.*;

public class OptimalSolution{
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,1};
        OptimalSolution obj = new OptimalSolution();
        List<Integer> res = obj.repeatingAndMIssingNum(arr);
        System.out.println(res);
    }
    public static List<Integer> repeatingAndMIssingNum(int arr[]){
        long n = arr.length;
        long sumN = (n * (n + 1)) / 2;
        long sqSumN = (n * (n + 1) * (2 * n + 1)) / 6;
        long sum = 0 , sqSum = 0;

        for(int i = 0 ; i < n ; i++){
            sum = sum + arr[i];
            sqSum = sqSum + (long)arr[i] * (long)arr[i];
        }
        long val1 = sum - sumN; //x - y
        long val2 = sqSum - sqSumN; //x^2 - y^2
        val2 = val2 / val1;  // x + y

        long x = (val1 + val2) / 2;
        long y = x - val1;
        return Arrays.asList((int)x ,(int) y);
    }
}