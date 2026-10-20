import java.util.*;
public class sp_02_printAnySubsenquenceWithSumK {
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        List<List<Integer>> ans = new ArrayList<>();
        printAnySubsequence(0, nums, 0, 2, new ArrayList<>(), ans);
        System.out.println(ans);
    }
    public static boolean printAnySubsequence(int idx, int nums[], int sum, int k, List<Integer> current, List<List<Integer>> ans){

        if(idx == nums.length){
            //condition satisfied---
            if(sum == k){
                ans.add(new ArrayList<>(current));
                return true;
            }
            //condition not satisfied--
            else return false;
        }
        current.add(nums[idx]);
        sum += nums[idx];
        if(printAnySubsequence(idx+1, nums, sum, k, current, ans) == true){
            return true;
        }
        current.remove(current.size()-1);
        sum -= nums[idx];
        if(printAnySubsequence(idx+1, nums, sum, k, current, ans) == true) return true;
        return false;
        
    }
}
