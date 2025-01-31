package JavaDay_25Jan;

public class EX1_IfCondition {
    public static void main(String[] args) {
        int age = 19;
        if (age > 18){
            System.out.println("you are allowed to Vote !!!...");

        }
        int age1 = Integer.parseInt(args[0]);// taking input from edit configurations
        if (age1 > 18){
            System.out.println("you are allowed to Vote !!!...");

        }
    }
}
