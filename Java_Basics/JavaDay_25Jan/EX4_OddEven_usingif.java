package JavaDay_25Jan;

import java.util.Scanner;

public class EX4_OddEven_usingif {
    public static void main(String[] args) {
        //take inout from user and tell whether it is odd or even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n%2 ==0){
            System.out.println("Even number");

        }
        System.out.println("Odd Number");
        sc.close();//close the scanner
    }
}
