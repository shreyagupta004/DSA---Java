import java.util.*;
public class m_02_CombinationSumTwo {
    public static void main(String[] args) {
        //brute---
        // int nums[] = {10,1,2,7,6,1,5};
        // Set<List<Integer>> ans = new HashSet<>();
        // Arrays.sort(nums);
        // comSum(0,8, nums, new ArrayList<>(), ans);
        // System.out.println(new ArrayList<>(ans));

        //optimal---
        int nums[] = {10,1,2,7,1,6,5};
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        combSum2(0, 8, nums, new ArrayList<>(), ans);
        System.out.println(ans);

    }

    //brute force---
    public static void comSum(int idx, int target, int nums[], List<Integer> current, Set<List<Integer>> ans){

        if(idx == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        if(nums[idx] <= target){
            current.add(nums[idx]);
            comSum(idx+1, target - nums[idx], nums, current, ans);
            current.remove(current.size()-1);
        }
        comSum(idx+1, target, nums, current, ans);
    }

    //optimal--
    public static void combSum2(int idx, int target, int nums[], List<Integer> current, List<List<Integer>> ans){

        if(target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i = idx; i < nums.length; i++){

            if(i > idx && nums[i] == nums[i - 1]) continue;
            if(nums[i] > target) break;

            current.add(nums[i]);
            combSum2(i + 1, target - nums[i], nums, current, ans);
            current.remove(current.size() - 1);
        }
    }
}
