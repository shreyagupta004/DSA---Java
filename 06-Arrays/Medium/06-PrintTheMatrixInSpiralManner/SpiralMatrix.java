import java.util.*;
public class  SpiralMatrix{
    public static void main(String[] args) {
        int matrix[][] = 
         {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        SpiralMatrix obj = new SpiralMatrix();
        
        List<Integer> res = obj.spiralMatrix(matrix);
        System.out.println(res);
        
    }
    public static List<Integer> spiralMatrix(int matrix[][]){

        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0 , right = col - 1;
        int top = 0 , bottom = row - 1;
        
        while(left <= right && top <= bottom){
            for(int i = left ; i <= right ; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            
            for(int i = top ; i <= bottom ; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(left <= right){
                for(int i = right ; i >= left ; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(top <= bottom){
                for(int i = bottom ; i >= top ; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
