public class BruteForecSolution {
    public static void main(String[] args) {
        int arr[] = {2,1,1,1,1,1,1,8};
        int ans = majorityElement(arr);
        System.out.println(ans);

    }
    public static int majorityElement(int arr[]){

        for(int i = 0 ; i < arr.length ; i++){
            int count = 0;
            for(int j = i + 1 ; j < arr.length ; j++){
                
                if(arr[j] == arr[i]){
                    count++;
                }
                
            }
            if(count > arr.length / 2){
                return arr[i];
            }
        }
        return -1;
    }
}
