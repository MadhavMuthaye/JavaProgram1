package JavaDay_15Feb_Inheritance;

public class Ex2_SingleInheritance {
    public static void main(String[] args) {
        son s1= new son();
        System.out.println(s1.gold_f);///son can access father attribute
        s1.BHK1();///son can access father property/ function

        s1.BHK2();//can access own function

        son2 s2 = new son2();
        s2.BHK1();//son2 can access father property/ function



    }

    public static class father {

        int gold_f = 1000;
        void BHK1(){
            System.out.println("1 BHK");
        }
    }

    public static class son extends father {
        void BHK2(){
            System.out.println("2 BHK");
        }
    }

    public static class son2 extends father {
        void BHK3(){
            System.out.println("3BHK");
        }
    }
}
