import java.util.*;

public class BasicHashing{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number Hashing----
        
        System.out.print("enter array size:");
        int n = sc.nextInt();
        System.out.print("enter array elements:");
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        //precompute----

        int hash[] = new int[13];
        for(int i = 0 ; i < n ; i++){
            hash[arr[i]] += 1;
        }

        int q = sc.nextInt();
        while(q-- > 0){
            int num = sc.nextInt();

            //fetch----

            System.out.println(hash[num]);
        }


            //Character Hashing-----

            System.out.print("enter the String:");
            String s = sc.nextLine();

            //precompute----
            int hash2[] = new int[26];
            for(int i = 0 ; i < s.length() - 1; i++){
                hash2[s.charAt(i) - 'a'] += 1;
            } 

            int queries = sc.nextInt();
            while(queries > 0){
                char ch = sc.next().charAt(0);
                queries--;
                //fetch----
                System.out.println(hash2[ch - 'a']);
            }
        
    }
    
}