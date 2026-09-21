import java.util.*;
public class BruteForceSolution {
    public static void main(String[] args) {
        int nums [] = {1,64,0,2,0};
        moveZeroes(nums);
        for(int i = 0; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void moveZeroes(int arr[]){
        
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        for(int i = 0 ; i < temp.size() ; i++){
            arr[i] = temp.get(i);
        }
        for(int i = temp.size() ; i < arr.length ; i++){
            arr[i] = 0;
        } 
    }
}
