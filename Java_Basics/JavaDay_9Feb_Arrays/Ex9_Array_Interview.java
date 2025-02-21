package JavaDay_9Feb_Arrays;

import java.util.Arrays;

public class Ex9_Array_Interview {

    // find 2nd largest number in an array
    public static void main(String[] args) {
        int numbers[]= {10,15,20, 26,35};

        Arrays.sort(numbers);
        System.out.println("2nd largest number is : " + numbers[numbers.length-2]);

        // find 2nd smallest number in an array

        System.out.println("2nd smallest number is : " + numbers[1]);

    }

}
