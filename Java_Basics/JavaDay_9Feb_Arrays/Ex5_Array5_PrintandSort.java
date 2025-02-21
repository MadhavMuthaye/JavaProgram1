package JavaDay_9Feb_Arrays;

import java.util.Arrays;

public class Ex5_Array5_PrintandSort {
    public static void main(String[] args) {
        int[] marks1 = {91,90, 89, 75, 64};
        System.out.println(marks1.length);
        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[2]);
        System.out.println(marks1[3]);
        System.out.println(marks1[4]);


        System.out.println("-------");
        for (int i=0 ;i<marks1.length;i++)
            System.out.println(marks1[i]);

        System.out.println("-------");
        //sort values in Array
        Arrays.sort(marks1);/// sort in ascending order
        for (int i=0 ;i<marks1.length;i++)
            System.out.println(marks1[i]);

    }
}
