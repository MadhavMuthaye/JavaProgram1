package JavaDay_16Feb_StaticKeyword;

public class EX2_Static_ex2 {
    public static void main(String[] args) {
        ATB a1 = new ATB(68890807,"Madhav");
        System.out.println(a1.phone + " " + a1.name);
        System.out.println(ATB.course_name);
        ATB.m1();


    }
}

class ATB{
    static String course_name = "ATB10x";///use static when variable or method is common to all
    int phone;
    String name;

    public ATB(int phone, String name) {// Constructor added using right click - Constructor
        this.phone = phone;
        this.name = name;
    }

    static void m1(){
        System.out.println("Mark Attendance");
    }


}