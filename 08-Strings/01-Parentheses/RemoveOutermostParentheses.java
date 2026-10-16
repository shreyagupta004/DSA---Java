public class RemoveOutermostParentheses{
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        String ans = removeParentheses(s);
        System.out.println(ans);
    }
    public static String removeParentheses(String s){
        StringBuilder str = new StringBuilder();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(count > 0) str.append(s.charAt(i));
            count++;
            }
            else{
                count--;
                if(count > 0) str.append(s.charAt(i));
            } 
        }
        return str.toString();
    }
}