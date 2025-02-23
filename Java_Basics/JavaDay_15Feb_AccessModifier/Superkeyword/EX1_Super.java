package JavaDay_15Feb_AccessModifier.Superkeyword;

public class EX1_Super {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();
    }
}

class Father {
    Father() {
        System.out.println("Default constructor of Father");
    }

    int gold = 10;

    void home() {
        System.out.println("Home Father");
    }
}

class Son extends Father {

    Son() {
        super();// here super keyword calls parent constructor can be called only in constructor
    }

    void t1() {
        super.home();//here super keyword calls parent method
        System.out.println(super.gold);//here super keyword calls parent variable
    }
}