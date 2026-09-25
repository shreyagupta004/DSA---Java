import java.util.*;
public class OptimalSolution {
    public static void main(String[] args) {
        int arr[] = {-1 , 0,1,2,-1,4};
        OptimalSolution obj = new OptimalSolution();
       List<List<Integer>> ans = obj.threeSum(arr);

    System.out.println(ans);
    }
    
    public static List<List<Integer>> threeSum(int arr[]){
       
        List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(arr);
         for(int i = 0 ; i < arr.length ; i++){
            if(i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = arr.length - 1;
            
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j - 1]){
                        j++;
                    }
                    while(j < k  && arr[k] == arr[k + 1]){
                        k--;
                    }

                }
            }
            
         }
         return ans;

    }
}
