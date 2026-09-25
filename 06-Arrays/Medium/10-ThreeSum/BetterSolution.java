import java.util.*;
public class BetterSolution {
    public static void main(String[] args) {
         int arr[] = {-1 , 0,1,2,-1,4};
        BetterSolution obj = new BetterSolution();
       List<List<Integer>> ans = obj.threeSum(arr);

    System.out.println(ans);
    }
    
    public static List<List<Integer>> threeSum(int arr[]){
        Set<List<Integer>> ansSet = new HashSet<>();
        int n = arr.length;

        for(int i = 0 ; i < n ; i++){
            Set<Integer> st = new HashSet<>();
            for(int j = i + 1 ; j < n ; j++){
                int third = -(arr[i] + arr[j]);
                if(st.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(third);

                    Collections.sort(temp);

                    ansSet.add(temp);
                }
                st.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(ansSet);
        return ans;

    }
}
