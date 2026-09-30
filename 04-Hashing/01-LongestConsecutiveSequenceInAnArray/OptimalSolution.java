import java.util.HashSet;

public class OptimalSolution{
    public static void main(String[] args) {
        int arr[] = {101,100,102,1,2,3,4,1};
        int ans = longestConsecutiveSequence(arr);
        System.out.println(ans);
    }
    public static int longestConsecutiveSequence(int arr[]){
        if(arr.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
        for(int it : set){
            if(!set.contains(it - 1)){
                int count = 1;
                int x = it;
                while(set.contains(x + 1)){
                     x = x + 1;
                     count++;
                }
                longest = Math.max(longest , count);
            }
        }
        return longest;
    }
}