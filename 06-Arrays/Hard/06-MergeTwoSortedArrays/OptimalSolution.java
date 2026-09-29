import java.util.Arrays;

public class OptimalSolution{
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};
        int n = arr1.length;
        int m = arr2.length;

        merge(arr1, n, arr2, m);
        
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i < arr2.length ; i++){
            System.out.println(arr2[i] + " ");
        }
        
       
    }
    public static void merge(int nums1[] , int n , int nums2[] , int m){
        int left = n - 1;
        int right = 0;
        while(left >= 0 && right < m){
            if(nums1[left] > nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
            }
            else{
                break;
            }
            left--;
            right++;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        
    }
}