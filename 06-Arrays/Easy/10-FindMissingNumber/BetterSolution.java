

public class BetterSolution {
    public static void main(String[] args) {
        int num[] = {6,3,2,1,5,7,8};
        int res = missingNumber(num);
        System.out.println(res);
    }
    public static int missingNumber(int arr[]){
        int hash[] = new int [arr.length + 1];
        for(int i = 0 ; i < arr.length - 1 ;i++){
            hash[arr[i]] += 1;
        }
        for(int i = 1 ; i < hash.length ; i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
