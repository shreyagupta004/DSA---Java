import java.util.HashMap;

public class OptimalSolution {
    public static void main(String[] args) {
        int arr[] = {4,2,2,6,4};
        int ans = countSubarrayXOR(arr, 6);
        System.out.println(ans);
    }
    public static int countSubarrayXOR(int arr[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int xr = 0;
        for(int i = 0; i < arr.length; i++){
            xr = xr ^ arr[i];
            int k = xr ^ target;
            if(map.containsKey(k)){
                count += map.get(k);
            }
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }
        return count;
    }
}
