import java.util.*;
public class BruteForceSolution{
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,2,2,2};
        BruteForceSolution obj = new BruteForceSolution();
        List<Integer> res = obj.majorityElement(nums);
        System.out.println(res);
    }
    public static List<Integer> majorityElement(int arr[]){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        
        for(int i = 0 ; i < n ; i++){
            if(!ans.contains(arr[i])){
                int count = 0;
                for(int j = 0 ; j < n ; j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                if(count > n / 3){
                    ans.add(arr[i]);
                }
            }
            if(ans.size() == 2){
            break;
            }
        }
        
        return ans;
    }
}