package f_06_MinimizeMamimumDistanceToGasStation;

public class optimal {
    public static void main(String[] args) {
        int arr[] = {1,13,17,23};
        double res = minimizeGasStation(arr, 5);
        System.out.println(res);
    }
    public static double minimizeGasStation(int arr[], int k){
        double low = 0, high = 0;
        for(int i = 0; i < arr.length-1; i++){
            high = Math.max(high, (double) (arr[i+1] - arr[i]));
        }
        while(high - low > 1e-6){
            double mid = (low + high) / 2.0;
            int cnt =(int) noOfGasStation(arr, mid);
            if(cnt > k) low = mid;
            else high = mid;   
        } 
        return high;
    }
    public static int noOfGasStation(int arr[], double dist){
        int count = 0;
        for(int i = 0; i < arr.length-1; i++){
            int gap = (arr[i+1]- arr[i]);
            int numInBet = (int) (gap / dist);
            if(gap == numInBet * dist){
                numInBet--;
            }
            count += numInBet;
        }
        return count;
    }
}
