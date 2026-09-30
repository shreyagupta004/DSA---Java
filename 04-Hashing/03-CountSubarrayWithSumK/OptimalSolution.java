import java.util.HashMap;

public class OptimalSolution{
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
        int ans = countSubarray(arr, 3);
        System.out.println(ans);
    }
    public static int countSubarray(int arr[], int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int preSum = 0;
        map.put(0, 1);
        for(int i = 0; i < arr.length; i++){
            preSum += arr[i];
            int remove = preSum - target;
            if (map.containsKey(remove)) {
                count += map.get(remove);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);   
            
        }
        return count;
    }
}