public class BruteForceSolution {
    public static void main(String[] args) {
        int num[] = {6,3,2,1,5,7,8};
        int res = missingNumber(num);
        System.out.println(res);
    }
    public static int missingNumber(int num[]){
       
        for(int i = 1 ; i < num.length + 1 ; i++){
            int flag = 0;
            for(int j = 0 ; j < num.length ; j++){
                if(num[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        } 
    
        
        return -1;
    }
}
