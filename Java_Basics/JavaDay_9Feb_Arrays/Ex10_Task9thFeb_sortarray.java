package JavaDay_9Feb_Arrays;

import java.util.Arrays;

public class Ex10_Task9thFeb_sortarray {

    //Sort the array → int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
    //
    //1,3,4,10,12,32,34,100
    //
    //without using any functions.
    //
    //Hint - compare and replace(temp)

    public static void main(String[] args) {
        int nos[]= {1,6,2,9,4,8};
        for(int i=0; i<nos.length-1; i++){
            if (nos[i]>nos[i+1]){
                int temp = nos[i];
                nos[i]= nos[i+1];
                nos[i+1]= temp;
                i= - 1;
            }

        }
        System.out.println("Sorted order : " + Arrays.toString(nos));//Returns a string representation of the contents of the specified array.


    }
}

