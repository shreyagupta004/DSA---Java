import java.util.*;

public class OptimalSolution {
    public static void main(String[] args) {
        
    }
    public static int leader(int arr[]){
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length ; i >= 0 ; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
            }
            max = Math.max(max,arr[i]);
        }
        return -1;
    }
}
