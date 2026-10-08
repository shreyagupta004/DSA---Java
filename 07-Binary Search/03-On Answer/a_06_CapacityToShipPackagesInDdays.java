public class a_06_CapacityToShipPackagesInDdays {
    public static void main(String[] args) {
        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int res = leastCapacity(weights,5);
        System.out.println(res);
    }
    public static int leastCapacity(int weights[], int days){
        int low = 0, high = 0;
        for(int num : weights){
            low = Math.max(low, num);
            high += num;
        }
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(noOfDays(weights, mid) <= days){
                ans= mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int noOfDays(int weights[], int capacity){
        int day = 1, load = 0;
        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] > capacity){
                day = day + 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return day;
    }
}
