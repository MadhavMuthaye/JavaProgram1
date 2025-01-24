package JavaDay_19Jan;

public class Ex9_TO_Input_CLI {
    public static void main(String[] args) {

        String age_string = args[0];
        int age = Integer.parseInt(age_string);//to convert string to Integer
        System.out.println(age);


        String result = age < 18 ? "Minor" : (age >=65? "Senior" : "Adult");
        System.out.println(result);
        System.out.printf("You are %s",result);//%s is used to print a string
    }
}
