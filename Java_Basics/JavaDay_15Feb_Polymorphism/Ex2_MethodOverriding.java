package JavaDay_15Feb_Polymorphism;

public class Ex2_MethodOverriding {

        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            Animal myDog = new Dog();

            myAnimal.sound(); // Calls the method from the Animal class
            myDog.sound();    // Calls the overridden method from the Dog class
        }
    }

    // Base class
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Derived class
    class Dog extends Animal {
        @Override // even if @override is not return then too output will be same
        void sound() {
            System.out.println("Dog barks");
        }
    }

