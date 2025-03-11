package JavaDay_16Feb;

public class Ex2_privateVariable_example {
    public static void main(String[] args) {
        xyz a1 = new xyz();
        a1.display();
    }


}

 class abc{
    int mygold = 200;
 }

 class xyz extends abc{
    void display(){
        System.out.println(super.mygold);
    }

 }