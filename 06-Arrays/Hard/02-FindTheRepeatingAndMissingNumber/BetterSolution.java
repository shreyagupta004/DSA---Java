import java.util.*;
public class BetterSolution{
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,1};
        BetterSolution obj = new BetterSolution();
        List<Integer> res = obj.repeatingAndMIssingNum(arr);
        System.out.println(res);
    }
    public static List<Integer> repeatingAndMIssingNum(int arr[]){
        
        int n = arr.length;
        int hash[] = new int[n + 1];
        for(int i = 0 ; i < n ; i++){
            hash[arr[i]]++;
        }
        int repeating = -1 , missing = -1;
        for(int i = 1 ; i <= n ; i++){
            if(hash[i] == 0){
                missing = i;
            }
            if(hash[i] == 2){
                repeating = i;
            }
            if(repeating != -1 && missing != -1){
                break;
            }
        }
        return Arrays.asList(repeating , missing);
    }
}