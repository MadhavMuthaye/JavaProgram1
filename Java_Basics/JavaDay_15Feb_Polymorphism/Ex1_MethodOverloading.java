package JavaDay_15Feb_Polymorphism;

public class Ex1_MethodOverloading {
    public static void main(String[] args) {
        Mathoperations m1 = new Mathoperations();
        int sum2 =m1.add(2,4);
        System.out.println("Sum of 2 nos is " + sum2);
        int sum3  = m1.add(3,5,7);
        System.out.println("Sum of 3 nos is " + sum3);


    }

    public static class Mathoperations {
        int add (int a, int b) {
            return a + b;
        }
        // Method overloading - In same class function with same name
        // but different parameters / Arguments
            int add (int a, int b, int c){
                return a +b + c;

        }
    }
}


