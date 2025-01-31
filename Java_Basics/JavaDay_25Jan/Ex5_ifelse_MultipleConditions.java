package JavaDay_25Jan;

import java.util.Scanner;

public class Ex5_ifelse_MultipleConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.printf("num1 is Greater %d", num1);
        }
        else if (num1 < num2) {
            System.out.printf("num2 is Greater %d", num2);
        }
        else {
            System.out.println("Both nos are equal");
        }
    }
    }


