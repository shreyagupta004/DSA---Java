import java.util.*;
public class BetterSolution{
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,3,3};
        int ans = longestsubarray(arr, 3);
        System.out.println(ans);
    }
    public static int longestsubarray(int arr[] , int k){

        HashMap<Long , Integer> preSumMap = new HashMap<>();
        long sum  = 0;
        int maxLen = 0;

        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen , i + 1);
            }
            Long rem = sum - k;

            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen , len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum , i);
            }

        }
        return maxLen;
    }
}