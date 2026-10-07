public class a_03_FindSmallestDivisor {
    public static void main(String args[]){
        int arr[] = {1,2,5,9};
        int res = smallestDivisor(arr, 7);
        System.out.println(res);
    }
    public static int smallestDivisor(int arr[] , int threshold){
        int low = 1, high = 0;
        for(int num : arr){
            high =Math.max(high, num);
        }
        int ans = -1;
        while(low <= high){
            int mid = (low + high ) / 2;
            if(sumOfD(arr, mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int sumOfD(int arr[] , int d){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += (arr[i] + d - 1) / 2;
        }
        return sum;
    }
}
