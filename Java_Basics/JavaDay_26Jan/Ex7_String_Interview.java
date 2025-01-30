package JavaDay_26Jan;

public class Ex7_String_Interview {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2);//o/p is true

        String s3 = new String("Hello");
        System.out.println(s1==s3);//o/p is false

        System.out.println(s1.equals(s3));//o/p is true as just values are compared

        String s4 = new String("hello");
        System.out.println(s1.equals(s4));// o/p is false as one is capital and other is small

        System.out.println(s1.equalsIgnoreCase(s4));//o/p is true as case is ignored


    }
}
