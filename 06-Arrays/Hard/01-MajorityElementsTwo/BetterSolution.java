import java.util.*;
public class BetterSolution{
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,2,2,2};
        BetterSolution obj = new BetterSolution();
        List<Integer> res = obj.majorityElement(nums);
        System.out.println(res);
    }
    public static List<Integer> majorityElement(int arr[]){

        List<Integer> ans = new ArrayList<>();

        HashMap<Integer , Integer> map = new HashMap<>();

        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if(map.get(arr[i]) > n / 3 && !ans.contains(arr[i])){
                ans.add(arr[i]);
            }  
            
        }
        return ans;
    }
}