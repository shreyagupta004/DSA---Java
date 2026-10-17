public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XVMC";
        int ans = romanToInteger(s);
        System.out.println(ans);
    }
    public static int romanToInteger(String s){
        int value = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int curr = 0;
            if(ch == 'I') curr = 1;
           else if(ch == 'V') curr = 5;
           else if(ch == 'X') curr = 10;
           else if(ch == 'L') curr = 50;
           else if(ch =='C') curr = 100;
           else if(ch == 'D') curr = 500;
           else if(ch == 'M') curr = 1000;

           if(i < s.length() - 1){
                char next = s.charAt(i+1);

                if((ch == 'I' && (next == 'V' || next == 'X')) || 
                    (ch == 'X' && (next == 'L' || next == 'C'))||
                    (ch == 'C' && (next == 'D' || next == 'M'))){
                        value -= curr;
                }
                else{
                    value += curr;
                }  
           }
           else{
            value += curr;
           }  
        }
        return value ;
        }
    }

