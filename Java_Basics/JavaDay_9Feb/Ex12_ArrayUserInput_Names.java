package JavaDay_9Feb;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12_ArrayUserInput_Names {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array length");
        int size = sc.nextInt();
        String[] names = new String[size];

        for(int i=0; i<names.length;i++){
            System.out.println("Enter the names");
            names[i]= sc.next();////next() is used in case of string input

        }
        System.out.println("-----");

        System.out.println("Names in Array are : " );
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        System.out.println("-----");


        System.out.println("Array list is "+ Arrays.toString(names));//Returns a string representation of the contents of the specified array.
    }
}
