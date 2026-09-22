import java.util.*;
public class intersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {1,2, 2,3,3,4,5,6};
        int b[] = {2,3,3,5,6,6,6,7};
        intersectionOfTwoSortedArrays obj = new intersectionOfTwoSortedArrays();
        List<Integer>  res = intersection(a, b);
        for(int val : res){
            System.out.print(val + " ");
        }
    }
    public static List<Integer> intersection(int a[] , int b[]){

        int i =0 ;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        
        while(i < a.length && j < b.length){
                if(a[i] < b[j]){
                    i++;
                }
                else if(b[j] < a[i]){
                    j++;
                } 
                else{
                    ans.add(a[i]);
                    i++;
                    j++;
                }
        } 
        return ans;
    }
}
