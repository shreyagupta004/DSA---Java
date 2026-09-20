public class checkIfArrayIsSortedAndRotated {
    public static void main(String[] args) {

        int arr[] = {3,4,5,1,2};
        boolean res = checkSortedAndRotated(arr);
        System.out.println(res);
        
    }
    public static boolean checkSortedAndRotated(int arr[]){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > arr[(i + 1) % arr.length]){
                count++;
            }
            if(count > 1){
              return false;
            }
        }
        return true;
       
    }
}

