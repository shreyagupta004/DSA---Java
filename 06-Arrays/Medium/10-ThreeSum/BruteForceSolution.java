import java.util.*;


public class BruteForceSolution {
    public static void main(String[] args) {
        int arr[] = {-1 , 0,1,2,-1,4};
        BruteForceSolution obj = new BruteForceSolution();
       List<List<Integer>> ans = obj.threeSum(arr);

    System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int arr[]){
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ;j < n ; j++){
                for(int k = j + 1 ; k < n ; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);

                        Collections.sort(triplet);

                        set.add(triplet);

                    }
                }
            }
        }
        ans.addAll(set);
        return ans;
    }
}
