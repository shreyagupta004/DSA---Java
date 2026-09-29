public class BruteForceSolution{
    public static void main(String[] args) {
        int arr[] = {40,25,19,12,9,6,2};
        int ans = reversePairs(arr);
        System.out.println(ans);
    }
    public static int reversePairs(int arr[]){
        int count = 0;
        int n  = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(arr[i] > 2 * arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}