import java.util.*;
public class BetterSolution{
    public static void main(String args[]){
        
    }
    public static int[] twoSum(int arr[] , int target){
        
        HashMap<Integer , Integer> map = new  HashMap<>();
        
        for(int i  = 0 ; i < arr.length ; i++){
            
            int a = arr[i];
            int b = target - a;

            if(map.containsKey(b)){
                return new int []{map.get(b) , i};
            }
        }
        return new int []{};
    }
}
