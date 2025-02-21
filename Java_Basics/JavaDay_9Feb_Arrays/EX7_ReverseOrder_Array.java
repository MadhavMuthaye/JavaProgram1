package JavaDay_9Feb_Arrays;

public class EX7_ReverseOrder_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Reverse order is: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
             System.out.println(numbers[i]);

        }
    }
}
