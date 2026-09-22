import java.util.*;
public class OptimalSolution {
    public static void main(String[] args) {
        int num1[] = {1,1,2,3,3,4,6,7};
        int num2[] = {2,1,3,4,4,2,6,9};
        OptimalSolution obj = new OptimalSolution();
        
        List<Integer> result = obj.unionOfArrays(num1 , num2);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) {
            System.out.print(val + " ");
        }    
    }
    public static List<Integer> unionOfArrays(int num1[] , int num2[]){
        
        int i = 0;
        int j = 0;

        List<Integer> union = new ArrayList<>();

        while(i < num1.length && j < num2.length){
            if(num1[i] < num2[j]){
                if(union.isEmpty() || union.get(union.size() - 1) != num1[i]){
                    union.add(num1[i]);
                    i++;
                }
            }
            else if(num2[j] < num1[i]){
                if(union.isEmpty() || union.get(union.size() - 1) != num2[j]){
                    union.add(num2[j]);
                    j++;
                }

            }
            else{
                if(union.isEmpty() || union.get(union.size() - 1) != num1[i]){
                    union.add(num1[i]);
                    i++;
                    j++;
                }
            }
        }
        while(i < num1.length){
             if(num1[i] < num2[j]){
                if(union.isEmpty() || union.get(union.size() - 1) != num1[i]){
                    union.add(num1[i]);
                    i++;
                }
            }
        }
        while(j < num2.length){
            if(num2[j] < num1[i]){
                if(union.isEmpty() || union.get(union.size() - 1) != num2[j]){
                    union.add(num2[j]);
                    j++;
                }
        }
            
    }
    return union;
}
}
