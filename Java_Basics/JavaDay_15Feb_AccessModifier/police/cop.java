package JavaDay_15Feb_AccessModifier.police;

public class cop {
    int gun;

    //constructor
    public cop(int gun) {
        this.gun = gun;
    }

    protected void canishoot(){
        System.out.println("Yes you can shoot");
    }
}
