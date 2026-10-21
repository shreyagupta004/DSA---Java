import java.util.*;
public class m_01_CombinationSum {
    public static void main(String[] args) {
        int nums[] = {2,3,6,7};
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(0, 7, nums, new ArrayList<>(), ans);
        System.out.println(ans);
    }
    public static void combinationSum(int idx, int target, int nums[], List<Integer> current, List<List<Integer>> ans){

        if(idx == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(current));
            }
            return ;
        }
        
        if(nums[idx] <= target){
            current.add(nums[idx]);
            combinationSum(idx, target - nums[idx], nums, current, ans);
            current.remove(current.size()-1);
        }
        
        combinationSum(idx + 1, target, nums, current, ans);
        
    }
}
