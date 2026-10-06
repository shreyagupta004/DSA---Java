public class a_01_FindSquareRootOfAnInteger {
    public static void main(String[] args) {
        int n = 25;
        int ans = sqRoot(n);
        System.out.println(ans);
    }
    public static int sqRoot(int n){
        int low = 0, high = n;
        int ans = 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if((long)mid*mid <= n){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return (int)ans;
    }
}
