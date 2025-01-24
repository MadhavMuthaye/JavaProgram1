package JavaDay_19Jan;

public class Ex10_TO_MultipleInput_CLI {
    public static void main(String[] args) {

        String age_string = args[0];//18
        int age = Integer.parseInt(age_string);//to convert string to Integer
        System.out.println(age);
        System.out.println(args[1]);//25
        System.out.println(args[2]);//65
        System.out.println(args[3]);//40

    }
}
