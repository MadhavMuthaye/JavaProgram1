package JavaDay_9Feb;

public class Ex2_Array2_Defaultvalues {
    public static void main(String[] args) {
        int[] marks = {10,20,30,40,50,60};// array with predefined elements
        //2nd way to create array
        int[] marks2 = new int[5]; /// need to provide size. Arrays have a fixed size
        System.out.println("Length of array marks2 is  "+ marks2.length);///length is property in case of array. o/p is 5
        String s1 = "Madhav";
        System.out.println("Length of String Madhav is  "+ s1.length());//length() is function in case of string

        System.out.println("String default Integer : "+marks2[1]);//default value stored is 0 for Integer data type.
        // so o/p is 0

        String[] s2 = new String[7];
        System.out.println("String default length: "+ s2[2]);//default value stored is null for Integer String.

        float[] f1= new float[6];
        System.out.println("float default length: "+ f1[0]);//float default length: 0.0
        double[] d1= new double[4];
        System.out.println("double default length: "+ d1[0]);//double default length 0.0
        boolean[] b1 = new boolean[1];
        System.out.println("boolean default length: " + b1[0]);//boolean default length false


    }
}