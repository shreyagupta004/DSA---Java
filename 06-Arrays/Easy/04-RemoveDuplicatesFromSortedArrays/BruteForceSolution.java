import java.util.*;
public class BruteForceSolution {
    public static void main(String arg[]){
        int arr[] = {1,1,2,2,2,3,3};
        removeDuplicates(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static int removeDuplicates(int arr[]){

        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
       int  index = 0 ;
            for(Integer it : set){
            arr[index] = it;
            index++;
        }
        return index + 1;
    }
}
