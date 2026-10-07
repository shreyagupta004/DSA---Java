public class a_02_FindNthRootOfANumber {
    public static void main(String[] args) {
        int m = 27;
        int n = 3;
        int ans = nthRoot(n, m);
        System.out.println(ans);
    }
    public static int nthRoot(int n,int m){
        int low = 1, high = m;
        while(low <= high){
            int mid = (low + high) / 2;
            int val = root(mid, n, m);
            if(val == 1) return mid;
            else if(val == 2) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        return -1;
    }
    public static int root(int mid, int n,int m ){
        long ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans * mid;
            if(ans > m) return 2;
            
        }
        if(ans == m) return 1;
        return 0;
    }
}
