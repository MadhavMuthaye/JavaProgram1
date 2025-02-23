package JavaDay_15Feb_AccessModifier.police;

public class jrcop {
    public static void main(String[] args) {
        cop c1= new cop(5);
        c1.canishoot();// canishoot() function of cop can be accessed here only bcoz it
        // is marked as protected
    }
}
