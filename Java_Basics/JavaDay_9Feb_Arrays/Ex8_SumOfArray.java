package JavaDay_9Feb_Arrays;

public class Ex8_SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {12,34,15};
        int sum=0;
        for(int i=0; i<numbers.length;i++) {
            sum = numbers[i] + sum;
        }
        System.out.println("Total of nos is " + sum );
        System.out.println("--------" );


    /// --- or---//
        // for each loop
        int sum1=0;
        for (int n: numbers){ ///  for each loop takes only range of array
        // works only with arrays and collection. It works only in increment order
            sum1 = sum1 + n;
        }
        System.out.println("Total of nos is " + sum );
    }
}
