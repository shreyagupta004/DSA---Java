import java.util.*;
public class sp_04_CountAllSubsequenceWithSumK {
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        int res = countSubsequence(0, nums, 0, 4, new ArrayList<>());
        System.out.println(res);
    }
    public static int countSubsequence(int idx, int nums[],int sum, int k, List<Integer> current){
        if(idx == nums.length){
            if(sum == k) return 1;
            else return 0;
        }
        current.add(nums[idx]);
        sum += nums[idx];

        int l = countSubsequence(idx+1, nums, sum, k,current);

        current.remove(current.size() - 1);
        sum -= nums[idx];

        int r = countSubsequence(idx+1, nums, sum, k, current);
        
        return (l + r);

    }
}
