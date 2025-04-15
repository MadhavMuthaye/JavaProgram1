package JavaDay_16Feb_WrapperClass;

public class Ex3_WrapperClass {

    public static void main(String[] args) {
        int a = 10;
        //System.out.println(a.); a doesn't has access to any built-in functions
        Integer b = 20;
        System.out.println(b.byteValue());// here due to wrapper class b has access to any built-in functions
        Integer a1=a;
        System.out.println(a1.floatValue());//a1 has access to build in functions
    }
}
