package JavaDay_9Feb;

import java.util.Arrays;

public class Ex6_Array_MaxMinValue {
    public static void main(String[] args) {
        int[] nos = {10, 20, 35, 40, 16, 75, 85, 96, 98};

        /// to find maximum and minimum number from above list

        // 1st way
        Arrays.sort(nos);
        System.out.println("Maximum number in array nos is: " + nos[nos.length - 1]);
        System.out.println("Minimum number in array nos is " + nos[0]);

        System.out.println("-----------");

        // 2nd way
        int n1 = max_num(nos);
        System.out.println("Maximum number in array nos is: " + n1);

        int n2 = min_num(nos);
        System.out.println("Minimum number in array nos is: " + n2);
}
       static  int max_num(int[] nos){// here static keyword is used bcoz this function is call in main function which itself is static
            int max = nos[0];
            for (int i=0; i< nos.length; i++)
            {
                if(nos[i]>max){
                    max=nos[i];
                }

            }
            return max;
        }

    static  int min_num(int[] nos){
        int min = nos[0];
        for (int i=0; i< nos.length; i++)
        {
            if(nos[i]<min){
                min=nos[i];
            }

        }
        return min;
    }


    }

