public class sp_03_CheckIfThereExistASequenceWithSumK {
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        System.out.println(check(nums, 5));
    }
    public static boolean check(int nums[], int k){

        return anySubSequence(0, nums, 0, k);

    }
    public static boolean anySubSequence(int idx, int nums[], int sum, int k){
        if(idx == nums.length){
            if(sum == k) return true;
        else return false;
        }
        if(anySubSequence(idx+1, nums, sum + nums[idx], k) == true) return true;
        
        if(anySubSequence(idx+1, nums, sum, k) == true) return true;
        return false;

    }
}
