import java.util.*;
public class BruteForceSolution{
    public static void main(String[] args) {
        int arr[] = {1,0,-1,-2,2,0};
        int target = 0;
        BruteForceSolution obj = new BruteForceSolution();
        List<List<Integer>> res = obj.fourSum(arr, target);
        System.out.println(res);
    }
    public static List<List<Integer>> fourSum(int arr[] , int target){
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                for(int k = j + 1 ; k < n ; k++){
                    for(int l = k + 1 ; l < n ; l++){
                        long sum = arr[i];
                        sum += arr[j];
                        sum += arr[k];
                        sum += arr[l];
                        if(sum == target){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            temp.add(arr[l]);

                            Collections.sort(temp);

                            set.add(temp);

                        }
                    }
                }
            }
        }
        ans.addAll(set);
        return ans;

    }
}