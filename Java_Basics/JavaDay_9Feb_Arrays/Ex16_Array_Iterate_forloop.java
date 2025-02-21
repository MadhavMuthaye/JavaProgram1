package JavaDay_9Feb_Arrays;

import java.util.Arrays;

public class Ex16_Array_Iterate_forloop {
    public static void main(String[] args) {

        int[][] matrix3_3 = {{1,2,3},{4,5,6},{7,8,9}};/// 3 rows 3 column

        for(int i=0;i<matrix3_3.length;i++){// This loop is for Horizontal Rows
            for(int j=0;j<matrix3_3.length;j++){// This loop is for Vertical columns
                //for(int j=0;j<matrix3_3[i].length;j++){ this also will work
                System.out.print(matrix3_3[i][j]+"|");
            }
            System.out.println(" ");
        }

    }
}
