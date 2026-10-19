import java.util.*;
public class sp_01_printAllSubsequenceWithSumK{
    public static void main(String[] args){
        int nums [] = {1,2,1};
        List<List<Integer>> ans = new ArrayList<>();
        printSubsequence(0, nums, 0,2, new ArrayList<>(), ans);
        System.out.println(ans);
    }
    public static void printSubsequence(int idx, int nums[], int sum,int k, List<Integer> current, List<List<Integer>> ans){
        
        if(idx == nums.length){
            if(sum == k){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        //pick---
        current.add(nums[idx]);
        sum += nums[idx];
        printSubsequence(idx + 1, nums, sum,k, current, ans);
        current.remove(current.size() - 1);
        sum -= nums[idx];

        //not pick---
        printSubsequence(idx+ 1, nums, sum,k, current, ans);
    }
}
