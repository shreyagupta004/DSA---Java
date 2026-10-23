import java.util.*;
public class m_05_CombinationSumThree {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(0, 3, 7, new ArrayList<>(), ans);
        System.out.println(ans);
    }
    public static void combinationSum(int idx, int k, int sum, List<Integer> current, List<List<Integer>> ans){

        if(sum == 0 && current.size() == k){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(sum < 0 && current.size() >= k) return;

        for(int i = idx+1; i <= 9; i++){
            current.add(i);
            combinationSum(i, k, sum - i, current, ans);
            current.remove(current.size()-1);
        }
    }
}
