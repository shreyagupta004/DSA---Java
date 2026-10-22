import java.util.*;
public class m_03_SubsetsOne {
    public static void main(String[] args) {
        int nums[] = {3,1,2};
        List<Integer> ans = new ArrayList<>();
        subsetSum(0, 0, nums, ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
    public static void subsetSum(int idx, int sum, int nums[], List<Integer> ans){
        if(idx == nums.length){
            ans.add(sum);
            return;
        }
        subsetSum(idx+1, sum + nums[idx], nums,  ans);
        
        subsetSum(idx+1, sum , nums,  ans);
    }
}
