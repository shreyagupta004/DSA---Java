import java.util.*;
public class BetterSolution{
    public static void main(String[] args) {
        int arr[] = {1,0,-1,-2,2,0};
        int target = 0;
        BetterSolution obj = new BetterSolution();
        List<List<Integer>> res = obj.fourSum(arr, target);
        System.out.println(res);
    }
    public static List<List<Integer>> fourSum(int arr[] , int target){
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            Set<Integer> st = new HashSet<>();
            for(int j = i + 1 ; j < n ; j++){
                for(int k = j + 1 ; k < n ; k++){
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    long fourth = (long)target - sum;
                    if(st.contains(fourth)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add((int)fourth);   

                        Collections.sort(temp);

                        set.add(temp);
                    }
                    st.add(arr[k]);

                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        return ans;
    }
}