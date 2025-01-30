package JavaDay_26Jan;

import java.util.Scanner;

public class Ex3_AlluserDefinefunc {
    public static void main(String[] args) {

        //            1. Without Parameters and Without Return Type.
        main1();
        String s = main2();
        System.out.printf("What day it is ? %s\n",s);

        //            2. Without Parameters but With Return Type
        int age1 = age();
        System.out.printf("Your age is %d\n",age1);

        //3. With Parameters and Without Return Type
        fullname("Madhav ","Muthaye");
        fullname("Manoj ","More");
        profile("Madhav",35, 20000.00);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        profile(name,age,salary);

        //4. With Parameters and With Return Type
        int sum = sumof3nos(35, 38 , 42);
        System.out.printf("The sum of 3 nos is %d",sum);




    }
//    ### **User Defined Functions.**
//            1. Without Parameters and Without Return Type.
    static void main1()
    {
        System.out.println("Hello");
    }
//            2. Without Parameters but With Return Type
    static String main2(){
        return "It is sunday";
    }


 static Integer age (){
        return 24;
 }
    //3. With Parameters and Without Return Type

    static void fullname(String firstname, String lastname){
        System.out.println("Your full name is "+ firstname + lastname);
    }
    static void profile(String name, int age, double salary){
        System.out.println("Your name is "+ name);
        System.out.println("Your age is "+ age);
        System.out.println("Your salary is "+ salary);
    }
//4. With Parameters and With Return Type
   static int sumof3nos(int a,int b, int c){
        return a + b + c;
   }
}
