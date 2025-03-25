package JavaDay_16Feb;

public class Ex5_Interface_p1 {
    public static void main(String[] args) {
        car1 c1 = new car1();
        c1.drive();
    }
}


interface engine1{
    void startengine();
    void stopengine();//In interface we can only define function but cannot add anything in body
    default void test(){// only with default keyword we can add something in body of function
        System.out.println("Function description");
    }
}

interface brakes{
    void applybrakes();
}

class car1 implements engine1,brakes{

    // Implements is used in case of interface and can have more than one interface

    void drive (){
        startengine();
        applybrakes();
        stopengine();
    }

    @Override
    public void startengine() {
        System.out.println("Start");
    }

    @Override
    public void stopengine() {
        System.out.println("Stop");

    }

    @Override
    public void applybrakes() {
        System.out.println("Apply Break");
    }
}