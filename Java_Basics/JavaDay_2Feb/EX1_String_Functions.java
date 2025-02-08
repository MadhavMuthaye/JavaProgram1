package JavaDay_2Feb;

public class EX1_String_Functions {
    public static void main(String[] args) {
        String s1 = "Hello"; //stored in String constant pool /SCP
        String s2 = "Hello"; //only 1 string Hello is created . New s2 variable is pointing to this
        String s3 = new String("Hello");//this is created in object area
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true...equals function checks content

    }
}
