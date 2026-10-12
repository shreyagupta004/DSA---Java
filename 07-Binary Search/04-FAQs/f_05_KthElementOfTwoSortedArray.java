public class f_05_KthElementOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,3,4,7,10,12};
        int arr2[] = {2,3,6,15};
        int res = kthElement(arr1, arr2,4);
        System.out.println(res);
    }
    public static int kthElement(int arr1[], int arr2[], int k){
        int n1 = arr1.length, n2 = arr2.length;
        if(n1 > n2) return kthElement(arr2, arr1, k);
        int left = k;
        int low = Math.max(0, k - n2);
        int high = Math.min(n1, k);
        while(low <= high){
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if(mid1 < n1) r1 = arr1[mid1];
            if(mid2 < n2) r2 = arr2[mid2];
            if(mid1 - 1 >= 0) l1 = arr1[mid1 - 1];
            if(mid2 - 1 >= 0) l2 = arr2[mid2 - 1];

            if(l1 <= r2 && l2 <= r1){
                return  Math.max(l1, l2);
            }
            else if(l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
}
