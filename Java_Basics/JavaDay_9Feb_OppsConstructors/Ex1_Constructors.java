package JavaDay_9Feb_OppsConstructors;

import javax.print.attribute.standard.NumberUpSupported;

public class Ex1_Constructors {
    public static void main(String[] args) {
        Numbers n2 = new Numbers();

    }
    }

    class Numbers{
        int n1;

        Numbers(){ ///  Constructor has name as class. No return type and it is called default when
            //object is crated for class
            System.out.println("This line is called automatically when object is created ");
        }
    }

