package JavaDay_19Jan;

public class Ex4_TO_Greater_of_2nos {
    public static void main(String[] args) {
        int num1=10, num2 = 20;
        //String vote = age>=18 ? "Yes, You can vote":"No, You can't vote";
        String max = num1 > num2?"num1 is greater":"num2 is greater";
        System.out.println(max);
        //System.out.printf("Greater Number is %d",max);
        int large = num1> num2 ? num1:num2;
        System.out.printf("Greater number is %d",large);


    }
}
