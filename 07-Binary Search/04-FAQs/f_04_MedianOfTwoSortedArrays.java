public class f_04_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,3,4,7,10,12};
        int arr2[] = {2,3,6,15};
        int res = medium(arr1, arr2);
        System.out.println(res);
    }
    public static int medium(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1 > n2) return medium(arr2, arr1);
        int left = (n1 + n2 + 1) / 2;
        int low = 0, high = n1;
        while(low <= high){
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if(mid1 < n1) r1 = arr1[mid1];
            if(mid2 < n1) r2 = arr2[mid2];
            if(mid1 - 1 >= 0) l1 = arr1[mid1 - 1];
            if(mid2 - 1 >= 0) l2 = arr2[mid2 - 1];
            if(l1 <= r2 && l2 <= r2){
                if((n1+n2) % 2 == 0){
                    return (Math.max(l1,l2) + Math.min(r1,r2)) / 2;
                }
                else{
                    Math.max(l1,l2);
                }
            } 
            if(l1 > r2)  high = mid1 - 1;
            if(l2 > r1)  low = mid1 + 1;
        }
        return 0;
    }
}
