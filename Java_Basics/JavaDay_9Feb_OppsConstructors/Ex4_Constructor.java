package JavaDay_9Feb_OppsConstructors;

import java.util.Scanner;

public class Ex4_Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car2 tesla = new car2();
        System.out.println(tesla.model);// values from default constructor of car2
        System.out.println(tesla.year);// values from default constructor of car2

        car2 tesla2 = new car2("tesla3", 2025);
        System.out.println(tesla2.model);
        System.out.println(tesla2.year);

        car2 nano = new car2("nano zen", 2022);
        System.out.println(nano.model);
        System.out.println(nano.year);
}
