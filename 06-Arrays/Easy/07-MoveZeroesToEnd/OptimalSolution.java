

public class OptimalSolution {
    public static void main(String[] args) {
        int nums [] = {1,64,0,2,0};
        moveZeroesToEnd(nums);
        for(int i = 0; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }

    }
    public static void moveZeroesToEnd(int arr[]){
            int j = -1;
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] == 0){
                    j = i;
                    break;
                }
            }   
            if(j == -1){
                return;
            }
            for(int i = j + 1 ; i < arr.length ; i++){
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }

        }
}
