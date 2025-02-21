package JavaDay_9Feb_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11_ArrayUserInput_Integer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array length");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i=0; i<numbers.length;i++){
            System.out.println("Enter the number");
            numbers[i]= sc.nextInt();

        }
        System.out.println("-----");

        System.out.println("Numbers in Array are : " );
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("Array list is "+ Arrays.toString(numbers));//Returns a string representation of the contents of the specified array.
    }
}
