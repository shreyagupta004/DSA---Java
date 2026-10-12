package f_06_MinimizeMamimumDistanceToGasStation;

public class bruteForce {
    public static void main(String[] args) {
        int arr[] = {1,13,17,23};
        double res = gasStation(arr, 5);
        System.out.println(res);
    }
    public static double gasStation(int arr[], int k){
        int howMany[] = new int[arr.length- 1];

        for(int i = 1; i <= k; i++){
            double maxVal = -1;
            int maxIdx = -1;
            for(int j = 0; j < arr.length - 1; j++){
                int diff  = arr[j +1] - arr[j];
                double secLen = (double)diff / (howMany[j] + 1);
                if (maxVal < secLen) {
                    maxVal = secLen;
                    maxIdx = j;
                }
            }
            howMany[maxIdx]++;
        }
        double maxAns = -1;
        for(int i = 0; i < arr.length-1; i++){
            double secLen =(double) (arr[i+1] - arr[i]) / (howMany[i] + 1);
            maxAns = Math.max(maxAns, secLen);
        }
        return maxAns;
    }
}
