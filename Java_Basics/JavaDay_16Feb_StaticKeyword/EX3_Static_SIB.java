package JavaDay_16Feb_StaticKeyword;

public class EX3_Static_SIB {
    public static void main(String[] args) {
        sblock s1 = new sblock();
    }


}
class sblock{
    static { // This is a Static Block. It is called when class is loaded.
        System.out.println("Called only Once when Class is loaded");
        System.out.println("You can write a code reading a excel, file,database file");
    }
    static int a = 10;
    static void m1(){
        System.out.println("static function");
    }
    //    static class B{/ static class is not used

//    }

}