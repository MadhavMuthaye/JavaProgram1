package JavaDay_19Jan;

public class Ex7_TO_max_of_3nos {
    public static void main(String[] args) {
        int a= 25, b= 35, c= 10;
        //Nested ternary to find max of 3 nos
        int max = a > b ? (a>c? a:c) :(b>c?b:c);
        System.out.println("largest number :" + max); // + is used to concatenate

    }
}
