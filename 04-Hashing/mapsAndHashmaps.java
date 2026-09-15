import java.util.*;
public class mapsAndHashmaps{
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);

    System.out.println("enter array size");
    int n = sc.nextInt();
    System.out.println("enter array elements");
    
    //Integer hashing---

    int arr[] = new int[n];
    for(int i = 0 ; i < n ; i++){
        arr[i] = sc.nextInt();
    }

    //precompute----
    HashMap<Integer , Integer> map = new HashMap<>();
    for(int i = 0 ; i < n ; i++){
        map.put(arr[i] , map.getOrDefault(arr[i],0) + 1);
    }
    int q = sc.nextInt();
    while(q > 0){
        int num = sc.nextInt();
        q--;

        //fetch----
        System.out.println(map.getOrDefault(num , 0));
    }



    //Character Hashing---
    System.out.print("enter your String :");
    String s = sc.nextLine();
    
    HashMap<Character , Integer> mapp = new HashMap<>();

    for(int i = 0 ; i < s.length() - 1 ; i++){
        mapp.put(s.charAt(i) , mapp.getOrDefault(s.charAt(i), 0) + 1);
    }
    System.out.print("enter no. of queries: ");
    int queries = sc.nextInt();
    while(queries > 0){
        
        char ch = sc.next().charAt(0);
        queries--;

        System.out.println(mapp.getOrDefault(ch , 0));
    }

    }
}

    