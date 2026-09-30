public class BruteForce{
    public static void main(String[] args) {
        int arr[] = {101,100,102,1,2,3,4,1};
        int ans = longestConsecutiveSequence(arr);
        System.out.println(ans);
        
    }
    public static int  longestConsecutiveSequence(int arr[]){
       if (arr.length == 0) {
            return 0;
        }
        
        int longest = 1;
        for(int i = 0 ; i < arr.length ; i++){
            int x = arr[i];
            int count =  1;
            while(linearSearch(arr , x + 1) == true){
                x = x + 1;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static boolean linearSearch(int arr[] , int x){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }
}