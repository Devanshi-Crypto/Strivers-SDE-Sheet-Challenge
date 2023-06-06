import java.io.*;
import java.util.*;

public class pascalTriangle{

    public List<List<Integer>> generate(int numRows) {
    
        List<List<Integer>> triangles = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            List<Integer> currentRow = new ArrayList<>();
            //add 1 at begining of current row
            currentRow.add(1);

            //inner loop to add the mid values
            for(int j=1;j<i;j++) {
                int val = triangles.get(i-1).get(j-1)+triangles.get(i-1).get(j);
                currentRow.add(val);
            }

            //add 1 at the end of row
            if(i>0){
                currentRow.add(1);
            }

            triangles.add(currentRow);
            
        }
        return triangles;
    
    }
    public static void main(String[] args) {
        
        int numRows = 5;
        pascalTriangle pascal = new pascalTriangle();
        List<List<Integer>> result = pascal.generate(numRows);

        // Print the triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    
    }
}