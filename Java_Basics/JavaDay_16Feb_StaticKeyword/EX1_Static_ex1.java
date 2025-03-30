package JavaDay_16Feb_StaticKeyword;

public class EX1_Static_ex1 {

    public static void main(String[] args) {
        student s1 = new student(23);
        student s2 = new student(33);
        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(s1.course_name);//can be accessed using object
        System.out.println(student.course_name);// To access static variable object is not required.
        // Directly can be accessed using class name

        s1.m1();
        student.m1();//being static method it can Directly can be accessed using class name

    }


}

class student {
    int age; // This is not a static variable as static keyword is not used
    static String course_name = "ATB10x";// This is static variable
                                            // can be accessed at Class loader level

    public student(int age_c) {// constructor
        this.age = age_c;
    }

    static void m1(){
        System.out.println("Static Method");
    }
}