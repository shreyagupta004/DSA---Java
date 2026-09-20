

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,6,4,5};
        boolean res = checkSorted(arr);
        System.out.println(res);
    }
    public static boolean checkSorted(int arr[]){
       
        for(int i = 1 ; i < arr.length ; i++){

            if(arr[i] >= arr[i - 1]){

            }
            else{
                return false;
            }
        }
        return  true;
    }
}
