import java.util.*;
public class BruteForceSolution {
    public static void main(String[] args) {
        int numRows = 6;
        BruteForceSolution obj = new BruteForceSolution();
        System.out.println(obj.generate(numRows));
        

    }
     public static int getValue(int row , int col){
        if(col == 0 || col == row){
            return 1;
        }
        return getValue(row - 1, col - 1) + getValue(row - 1, col);
    }
    
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int row = 0 ; row < numRows ; row++){
            List<Integer> current = new ArrayList<>();
            for(int col = 0 ; col <= row ; col++){
                current.add(getValue(row , col));
            }
            triangle.add(current);
        }
        return triangle;
    }
}
