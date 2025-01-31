package JavaDay_25Jan;

import java.util.Scanner;

public class Ex7_TriangleClassifier_ifelsecondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = sc.nextDouble();

        if (side1<=0 || side2 <=0 || side3 <=0)
        {
            System.out.println("Invalid Input");

        }
        else {


        if(side1 == side2 && side2 == side3 && side1 == side3){
            System.out.println("This is Equilateral triangle");//A'' 3 sides are equal

        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("This is Isosceles triangle");//2 sides are equal
        }
        else{
            System.out.println("This is Scalene triangle");// All sides are different
        }
    }
    }
}
