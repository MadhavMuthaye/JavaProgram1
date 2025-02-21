package JavaDay_9Feb_OppsConstructors;

import javax.print.attribute.standard.NumberUpSupported;

public class Ex1_Constructors {
    public static void main(String[] args) {
        Numbers n2 = new Numbers();

    }
    }

    class Numbers{
        int n1;
        // Default Constructor
        Numbers(){ ///  Constructor has name as class. No return type and it is called default when
            //object is crated for class
            System.out.println("This line is called automatically when object is created ");
        }
        // Instance Initialization block. This is not a constructor. This is called even before contructor
        {
            System.out.println("I am also called when class is loaded");
        }
    }

