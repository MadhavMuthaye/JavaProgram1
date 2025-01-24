package JavaDay_19Jan_Inc_Dec;

public class EX1_ID_preincrement {
    public static void main(String[] args) {
        //pre increament -- > ++ a
        //value is increased first and then print
        int a=10; // value of a is 10
        int b= ++a; // value of a is increment by 1 and assigned to B . so both a and b are 11
        int c= ++a; // a was 11 . increment by 1 is 12. so both a and c are 12

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
