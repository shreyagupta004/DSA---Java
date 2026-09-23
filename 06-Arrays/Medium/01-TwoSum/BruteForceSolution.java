public class BruteForceSolution {
    public static void main(String args[]){
        int arr[] = {2,6,5,8,11};
        int target = 14;
         int[] answer = twoSum(arr, target);

        for (int index : answer) {
            System.out.print(index + " ");
        }
    }
    public static int[] twoSum(int arr[] , int target){
        
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i , j};
                }
            }
        } 
        return new int [0];
    }
}
