package JavaDay_9Feb_OppsConstructors;

import java.util.Scanner;

public class Ex4_Constructor {
    public static void main(String[] args) {

        car2 tesla = new car2();
        System.out.println(tesla.model);// values from default constructor of car2
        System.out.println(tesla.year);// values from default constructor of car2
        System.out.println("-----");

        car2 tesla2 = new car2("tesla3", 2025);
        System.out.println(tesla2.model);
        System.out.println(tesla2.year);
        System.out.println("-----");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model name");
        String model_name = sc.next();
        car2 nano = new car2(model_name, 2022);
        System.out.println(nano.model);
        System.out.println(nano.year);
    }
}
