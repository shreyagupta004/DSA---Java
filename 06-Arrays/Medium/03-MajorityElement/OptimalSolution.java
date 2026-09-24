public class OptimalSolution{
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,3,1,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    public static int majorityElement(int arr[]){
        int count = 0;
        int el = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(count == 0 ){
                el = arr[i];
                
            }
            else if(arr[i] == el){
                count++;
            }
            else{
                count--;
            }
        } 
        int count1 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == el){
                count1++;
            }
        } 
        if(count1 > arr.length / 2){
            return el;
        } 
        return -1;
    }
}