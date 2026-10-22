import java.util.*;

public class m_04_SubsetsTwo {
    public static void main(String[] args) {
        //brute force
        // int nums[] = {1,2,2};
        // Set<List<Integer>> ans = new HashSet<>();
        // subset(0, nums, new ArrayList<>(), ans);
        // List<List<Integer>> res = new ArrayList<>(ans);
        // System.out.println(res);

        int nums[] = {1,2,2};
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subset(0, nums, new ArrayList<>(), ans);
        System.out.println(ans);
        
    }
    //brute force--
    public static void subset(int idx, int nums[], List<Integer> current, Set<List<Integer>> ans){

        if(idx == nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        subset(idx+1, nums, current, ans);
        current.remove(current.size()-1);
        
        subset(idx+1, nums, current, ans);
    }
    //optimal--
    public static void subset(int idx, int nums[], List<Integer> current, List<List<Integer>> ans){

        ans.add(new ArrayList<>(current));

        for(int i = idx; i < nums.length; i++){
            if(i != idx && nums[i] == nums[i-1]) continue;
            current.add(nums[i]);
            subset(idx+1, nums, current, ans);
            current.remove(current.size()-1);
        }
        
    }
}
