
import java.util.*;
public class OptimalSolution {
    public static void main(String[] args) {
        int numRows = 6;
        OptimalSolution obj = new OptimalSolution();
        System.out.println(obj.generate(numRows)); 
    }
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();   

        for(int row = 0 ; row < numRows ; row++){
            List<Integer> current = new ArrayList<>();

            for(int col = 0 ; col <= row ; col++){
                current.add(1);
            }
            for(int col = 1 ; col < row ; col++){
                int value = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                current.add(col , value);
            }
            triangle.add(current);

        }
        return triangle;
    }
}
