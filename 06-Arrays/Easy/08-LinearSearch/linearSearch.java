public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,3,65,7,2,6,3,7};
        int num = 7;
        int res = linearsearch(arr, num);
        System.out.println(res);
    }
    public static int  linearsearch(int arr[] , int num){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
