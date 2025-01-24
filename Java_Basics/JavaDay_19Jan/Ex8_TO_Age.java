package JavaDay_19Jan;

public class Ex8_TO_Age {
    public static void main(String[] args) {
        int age = 25;
        //Minor < 18
        //Adult > 18
        //Senior > 65

        String result = age < 18 ? "Minor" : (age >65? "Senior" : "Adult");
        System.out.println(result);
        System.out.printf("You are %s",result);//%s is used to print a string
    }
}
