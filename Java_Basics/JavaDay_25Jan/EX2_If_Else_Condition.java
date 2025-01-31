package JavaDay_25Jan;

import java.util.Scanner;

public class EX2_If_Else_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Take input from user using scanner class. new keyword is used to define object
        System.out.println("Enter your age as positive number");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("you are allowed to Vote !!!...");

        }
        else{
            System.out.println("you are not allowed to Vote !!!...");
        }
        int age1 = Integer.parseInt(args[0]);// taking input from edit configurations
        if (age1 > 18){//Adding breakpoint
            System.out.println("you are allowed to Vote !!!...");

        }
        else{ //Adding breakpoint
            System.out.println("you are not allowed to Vote !!!...");
        }
    }
}
