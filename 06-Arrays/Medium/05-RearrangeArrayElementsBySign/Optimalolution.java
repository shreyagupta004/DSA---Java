

public class Optimalolution {
    public static void main(String[] args) {
        int arr[] = {1,2,-2,1,-4,-8};
        rearrangeElements(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        } 
    }
    public static int[] rearrangeElements(int arr[]){
            int ans[] = new int[arr.length];
            int posIdx = 0;
            int negIdx = 1;
        
         for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                arr[posIdx] = arr[i];
                posIdx += 2;
            }
            else{
                arr[negIdx] = arr[i];
                negIdx += 2;
            }
         }
         return ans;
    }
}
