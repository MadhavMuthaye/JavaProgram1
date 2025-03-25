package JavaDay_16Feb;

public class Ex4_Abtract2 {
    public static void main(String[] args) {
        wagonr w1= new wagonr();
        w1.drive();

    }
}


abstract class engine{
     abstract void startengine();
     abstract void stopengine();
}

class wagonr extends engine{

    @Override
    void startengine() {
        System.out.println("Start");

    }

    @Override
    void stopengine() {
        System.out.println("Stop");

    }

    void drive(){
        startengine();
        System.out.println("I am driving");
        stopengine();
    }
}