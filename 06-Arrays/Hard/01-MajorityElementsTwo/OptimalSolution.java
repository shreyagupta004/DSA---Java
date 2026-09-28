import java.util.*;
public class OptimalSolution{
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,2,2,2};
        OptimalSolution obj = new OptimalSolution();
        List<Integer> res = obj.majorityElement(nums);
        System.out.println(res);
    }
    public static List<Integer> majorityElement(int[] nums) {

        //moore's Voting Algorithm(Modified)--

        int count1 = 0 , count2 = 0;
        int el1 = Integer.MIN_VALUE , el2 = Integer.MIN_VALUE ;
        int n = nums.length ;

        for(int i = 0 ; i < n ; i++){
            if(count1 == 0 && nums[i] != el2){
                count1 = 1 ;
                el1 = nums[i];
            }
            else if (count2 == 0 && nums[i] != el1){
                count2 = 1 ;
                el2 = nums[i];
            }
            else if(el1 == nums[i]){
                count1++;
            }
            else if(el2 == nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        //manual checking--
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0 , cnt2 = 0;
        for(int  i = 0 ; i < n ; i++){
            if(el1 == nums[i]){
                count1++;
            }
            if(el2 == nums[i]){
                cnt2++;
            }
        }
        if(cnt1 > (int)(n / 3 + 1)){
            ans.add(el1);
        }
        if(cnt2 > (int)(n / 3 + 1)){
            ans.add(el2);
        }
        return ans;
    }
}