import java.util.*;
public class highestOccuringElementInAnArray{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:");

        int n= sc.nextInt();
        System.out.print("enter array elements:");

        int a[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(a[i] , map.getOrDefault(a[i] , 0) + 1);
        }

        int maxfrequency = 0;
        int highestElement = 0;

        for(Map.Entry<Integer , Integer> e : map.entrySet()){

            if(e.getValue() > maxfrequency){

                maxfrequency = e.getValue();
                highestElement = e.getKey();
            }
        }
        
         System.out.println("Highest occurring element: " + highestElement);
        System.out.println("Frequency: " + maxfrequency);

     }
}