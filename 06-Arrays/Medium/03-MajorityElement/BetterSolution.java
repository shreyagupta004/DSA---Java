import java.util.*;

public class BetterSolution {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,1,1,1,1};
        BetterSolution obj = new BetterSolution();
        int ans = obj.majorityElement(arr);
        System.out.println(ans);
    }
    public static int majorityElement(int nums[]){

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
           map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        for(Map.Entry<Integer , Integer>entry : map.entrySet()){
            if(entry.getValue() > nums.length / 2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
