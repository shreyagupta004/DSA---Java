import java.util.*;
public class h_07_ExpressionAddOperator {
    public static void main(String[] args) {
        String num = "234";
        List<String> ans = new ArrayList<>();
        addOperator(0, num, "", 9, ans, 0, 0);
        System.out.println(ans);
    }
    public static void addOperator(int idx,String num,String curr, int target, List<String> ans, long prev, long res){
        if(idx == num.length()){
            if(res == target){
                ans.add(curr);
                
            }
            return;
        }
        String str = "";
        long currRes = 0;
        for(int i = idx; i < num.length(); i++){

            if(i > idx && num.charAt(idx) == '0') break;
            str += num.charAt(i);
            currRes = currRes*10 + (num.charAt(i) - '0');
            if(idx == 0){
                addOperator(i + 1, num, str, target, ans, currRes, currRes);
            }
            else{
                addOperator(i+1, num, curr +"+"+str, target, ans, currRes, res+currRes);
                addOperator(i+1, num, curr + "-" + str, target, ans, -currRes,res - currRes);
                addOperator(i+1, num, curr + "*" + str, target, ans, prev*currRes, res-prev+(prev*currRes));
            }
        }
    }
}
