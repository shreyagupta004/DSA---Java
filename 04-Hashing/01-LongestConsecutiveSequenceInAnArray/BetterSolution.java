import java.util.*;
public class BetterSolution{
    public static void main(String[] args) {
        int arr[] = {101,100,102,1,2,3,4,1};
        int ans = longestConsecutiveSequence(arr);
        System.out.println(ans);
    }
    public static int longestConsecutiveSequence(int arr[]){
         if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int lastsmall = Integer.MIN_VALUE;
        int count = 0 , longest = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] - 1 == lastsmall){
                count += 1;
                lastsmall = arr[i];
            }
            else if(arr[i] != lastsmall){
                count = 1;
                lastsmall = arr[i];
            }
            longest = Math.max(longest , count);
        }
        return longest;
    }
}