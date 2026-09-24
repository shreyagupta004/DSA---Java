import java.util.*;
public class BruteForceolution {
    public static void main(String[] args) {
        int arr[] = {-1 , 2,3,6-4,1};
        rearrangeElements(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        } 
    }
    public static int[] rearrangeElements(int arr[]){
        
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            } 
            else{
                neg.add(arr[i]);
            }
        } 
        for(int i = 0 ; i < arr.length / 2; i++){
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i); 
        } 
        return arr;
    }
}
