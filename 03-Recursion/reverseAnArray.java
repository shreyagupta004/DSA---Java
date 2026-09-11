import java.util.*;
public class reverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
           
           for(int i = 0 ; i < n ; i++) {
             a[i] = sc.nextInt();
            }

        reverseAnArray(0,n - 1 , a);

        for(int i = 0 ; i <n ; i++){
            System.out.print(a[i] + " ");
            
        } 
 
    }
    public static void reverseAnArray(int l , int r,int a[] ){

        if(l >= r){
            return ;
        }
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp ;
        reverseAnArray(l+1 , r-1,a);
         
    }
}
