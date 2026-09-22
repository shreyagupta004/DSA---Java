

public class maximumConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,1,1,1,1,0,1};
        int ans = maxConsecutiveOne(arr);
        System.out.println(ans);
    }
    public static int maxConsecutiveOne(int arr[]){
        
        int max = 0;
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++){
             if(arr[i] == 1){
                count++;
                max = Math.max(max , count);
             }
             else{
                count = 0;
             }
        }
        return max;
    }
}
