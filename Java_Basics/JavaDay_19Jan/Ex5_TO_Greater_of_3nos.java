package JavaDay_19Jan;

public class Ex5_TO_Greater_of_3nos {
    public static void main(String[] args) {
        int num1=39, num2 = 20, num3 = 15;
        /// simple ternary to find max of 3 nos
        int max1 = num1 > num2 ? num1:num2;
        int max2 = max1 > num3 ? max1:num3;
        int max = max1 > max2 ? max1:max2;
        //System.out.println(max);
        System.out.printf("Greater Number is %d",max);
        System.out.println();

        /// Nested Ternary to find max of 3 nos
        int a=10,b=20,c=15;
        int large = a>b?(a>c ? a :c):(b>c ? b:c);
        System.out.printf("Greater Number is %d",large);//%d is used to print integer

    }
}
