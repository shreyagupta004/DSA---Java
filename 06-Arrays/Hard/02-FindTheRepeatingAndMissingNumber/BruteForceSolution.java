import java.util.*;

public class BruteForceSolution{
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,1};
        BruteForceSolution obj = new BruteForceSolution();
        List<Integer> res = obj.repeatingAndMIssingNum(arr);
        System.out.println(res);
    }
    public static List<Integer> repeatingAndMIssingNum(int arr[]){
        int repeating = -1 , missing = -1;
        int n = arr.length;
        for(int i = 1 ; i <= n ; i++){
            int count = 0;
            for(int j  = 0 ; j < n  ; j ++){
                if(arr[j] == i){
                    count++;
                }
            }
            if(count == 2){
                repeating = i;
            }
            else if(count == 0){
                missing = i;
            }
            if(repeating != -1 && missing != -1){
                break;
            }
        }
        return Arrays.asList(repeating , missing);
    }
}