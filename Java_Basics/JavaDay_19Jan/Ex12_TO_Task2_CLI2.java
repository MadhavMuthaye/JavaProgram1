package JavaDay_19Jan;

public class Ex12_TO_Task2_CLI2 {
    public static void main(String[] args) {

//Take a user input 3 numbers from the arguments
// and calculate the maximum in between them with ternary operator.
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int max = num1 > num2 ? (num1 > num3 ? num1 :num3) :(num2>num3? num2:num3);
        System.out.printf("Greater number is %d",max);

    }
}
