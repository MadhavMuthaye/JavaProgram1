package JavaDay_26Jan;

import javax.swing.*;
import java.util.Scanner;

public class Ex4_Task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st number");

//        if(sc.hasNextInt()){
//            a = sc.nextInt();
//
//            }
//        else{
//            System.out.println("Please enter Integer only");
//            System.exit(0);
//        }
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
//        if(sc.hasNextInt()){
//            int b = sc.nextInt();
//
//        }
//        else{
//            System.out.println("Please enter Integer only");
//            System.exit(0);
//        }
        int b = sc.nextInt();

        int result_sum = sum(a,b);
        System.out.printf("Sum is %d\n",result_sum);
        int result_sub = sub(a,b);
        System.out.printf("Sub is %d\n",result_sub);
        int result_mul = mul(a,b);
        System.out.printf("Mul is %d\n",result_mul);
        int result_modulus = modulus(a,b);
        System.out.printf("Mod is %d\n",result_modulus);
        int result_div = div(a,b);
        System.out.printf("Division is %d\n",result_div);

    }
    // create a function of sum, sub, mul, modulus and division
    //with parameter a and b . Take parameter from user

    static int sum(int a, int b){
        return a + b;
                 }

    static int sub(int a, int b){
        return a - b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    static int modulus(int a, int b){
        return a % b;
    }
    static int div(int a, int b){
        if(b==0){
            System.out.println("Div by zero is not allowed");
        }
        return a/b;
    }
}
