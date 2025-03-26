package JavaDay_16Feb;

public class Ex6_Interface_p2 {
    public static void main(String[] args) {
        class1 c1 = new class1();
        c1.icm1();
        c1.icm2();
        c1.icm3();
    }
}



interface I1{
    void icm1();
    void icm2();
}

interface I2{
    void icm3();
}

class class1 implements I1,I2{

    @Override
    public void icm1() {
        System.out.println("ICM1 Complete");
    }

    @Override
    public void icm2() {
        System.out.println("ICM2 Complete");
    }

    @Override
    public void icm3() {
        System.out.println("ICM3 Complete");
    }
}