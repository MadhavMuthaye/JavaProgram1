package JavaDay_9Feb_OppsConstructors;

public class Ex2_Constructor {
    public static void main(String[] args) {
        A a1 = new A();//object creation. Default constructor is called
        new A();// This is also object creation. Default constructor is called
    }

}

class A{
    A(){
        System.out.println("Default Constructor");
    }
}