package JavaDay_16Feb_WrapperClass;

public class Ex4_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "10";

        // Convert String Wrapper to Integer Wrapper
        Integer a = Integer.parseInt(num);
        // Convert String Wrapper to Primitive Integer
        int a1 = Integer.parseInt(num);

        Integer a2 = Integer.valueOf("10");// valueof can be used to convert string to Integer
        System.out.println(a2);

        System.out.println(Integer.MAX_VALUE);// Get maximum value of Integer
        System.out.println(Integer.MIN_VALUE);// Get Minimum value of Integer
    }
}
