import java.util.*;

public class BruteForceSolution {

    
    public static void main(String[] args) {
        int arr1[] = {1,4,5,6,7,2};
        int arr2[] = {1,2,3,4,5,6,7,8};
        
        int result[] = unionOfTwoSortedArrays(arr1, arr2);
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i] + " ");
        } 
    }
    public static int[] unionOfTwoSortedArrays(int arr1[] , int arr2[]){

        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }
        for(int i = 0 ; i < arr2.length ; i++){
                    set.add(arr2[i]);
        } 

        int union[] = new int[set.size()];
        int i = 0;
        for(Integer it : set){
  
            union[i] = it;
            i++;
        }
        return union;
    }
}
