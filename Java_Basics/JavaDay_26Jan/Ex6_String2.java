package JavaDay_26Jan;

public class Ex6_String2 {
    public static void main(String[] args) {
        String s1 = "Hello";/// SCP has one word Hello
        String s2 = "Hello";//// s1 and S2 are pointed or referred to same literal Hello.
        //New Hello is not created

        String s3 = new String("Hello");
        String s4 = new String("Hello");//again new memory will be created in object area (OA)
    }
}
