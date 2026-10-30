import java.util.*;
public class BruteForceSolution{
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};

    }
    public static void merge(int nums1[] , int n , int nums2[] , int m){
        List<Integer> temp = new ArrayList<>();
        int left = 0 ;
        int right = 0;
        while(left <= n && right <= m){
            if(nums1[left] > nums2[right]){
                temp.add(nums1[left]);
                left++;
            }
            else{
                temp.add(nums2[right]);
                right++;
            }
            while(left <= n ){
                temp.add(nums1[left]);
                left++;
            }
            while(right <= m){
                temp.add(nums2[right]);
                right++;
            }
        }
        for(int i = 0 ; i < (n + m) ; i++){
            if(i < n){
                nums1[i] = temp.get(i);
            }
            else{
                nums2[i - n] = temp.get(i);
            }
        }
        
    }
}