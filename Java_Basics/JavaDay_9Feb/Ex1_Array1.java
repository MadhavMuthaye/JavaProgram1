package JavaDay_9Feb;

public class Ex1_Array1 {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {91,90,51,100,92}; // Array creation with predefined elements
        System.out.println(marks.length);//o/p is 5
        System.out.println(marks[0]);//o/p is 91
        System.out.println(marks[1]);//o/p is 90
        System.out.println(marks[10]);//ArrayIndexOutOfBoundsException
    }
}
