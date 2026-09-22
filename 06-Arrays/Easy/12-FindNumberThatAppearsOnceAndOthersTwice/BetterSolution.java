public class BetterSolution{
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,8,8};
        int ans = findNumberAppearOnce(arr);
        System.out.println(ans);
    }
    public static int findNumberAppearOnce(int arr[]){

        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int hash[] = new int[max + 1];

        for(int i = 0 ; i < arr.length ; i++){
            hash[arr[i]]++;
        }

        for(int i = 0 ; i < hash.length ; i++){
            if(hash[i] == 1){
                return arr[i];
            }
        }
        return -1;
    }
}