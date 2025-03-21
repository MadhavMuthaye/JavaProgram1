package JavaDay_16Feb;

public class Ex3_Abstract {
    public static void main(String[] args) {
        child c  =new child();
        c.loan50k();
        c.loan25k();

        //father f = new father(); // cannot create object for abstract class
    }
}

abstract class father{// if any method is abstract then class also need to be abstract
   abstract void loan50k();// abstract methods cannot have body
    void loan25k(){
        System.out.println("25 loan paid");
    }
}

class child extends father{
    @Override       // override has to be used in case of any abtract method present in parent class
        // else error is given by application
    void loan50k() {

    }
}