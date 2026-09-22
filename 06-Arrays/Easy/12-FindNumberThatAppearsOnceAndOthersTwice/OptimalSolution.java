public class OptimalSolution {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4};
        int ans = NumThatAppearsOnce(arr);
        System.out.println(ans);
    }
    public static int NumThatAppearsOnce(int arr[]){
        int xor = 0;
        for(int i = 0 ; i < arr.length ; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
