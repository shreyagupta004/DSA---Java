public class a_04_KokoEatingBanana {
    public static void main(String[] args) {
        int arr[] = {1,2,5,9};
        int ans = kokoEatingBanana(arr, 8);
        System.out.println(ans);
        
    }
    public static int kokoEatingBanana(int piles[], int h) {
        int low = 1, high = 0;
        for(int num : piles){
            high = Math.max(high, num);
        }
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(totalHours(piles, mid) <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        } 
        return ans;
    }
    public static long totalHours(int arr[], int speed){
        long hours = 0;
        for(int i = 0; i <arr.length; i++){
            hours += (arr[i] + speed - 1) / speed;
        }
        return hours;
    }
    
}
