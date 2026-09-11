public class printSomethingNTimes{

    public static void main(String[] args) {
        
        printOne();

        printCount(0);

    }

    public static void printOne(){
        System.out.println("1");
        printOne();
    }
    
    public static void printCount(int count){
        
        if(count == 5){
            return;
        }
        System.out.println(count);
        count++;
        printCount(count);
        

    }
 }  