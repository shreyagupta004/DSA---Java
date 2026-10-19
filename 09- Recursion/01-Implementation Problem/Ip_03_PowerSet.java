import java.util.*;
public class Ip_03_PowerSet {
    public static void main(String[] args) {
        int nums[] = {3,1,2};
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(0, nums, new ArrayList<>(), ans);
        System.out.println(ans);
    }
    public static void findSubset(int idx, int nums[], List<Integer> current, List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<Integer>(current));
            return;
        }
        //pick--
        current.add(nums[idx]);
        findSubset(idx + 1, nums, current, ans);
        current.remove(current.size() - 1);
        
        //not pick--
        findSubset(idx + 1, nums, current, ans);
    }
}
