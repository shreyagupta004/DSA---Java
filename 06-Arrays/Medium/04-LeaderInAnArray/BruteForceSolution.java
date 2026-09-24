import java.util.*;
public class BruteForceSolution {
    public static void main(String[] args) {
        
    }
    public static int leader(int arr[]){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            boolean leader = true;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                } 
            }
            if(leader == true){
                ans.add(arr[i]);
            }
        }
        return -1;
    }
}
