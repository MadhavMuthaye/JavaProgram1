package JavaDay_16Feb_StaticKeyword;

public class Ex5_Static_example5 {
    public static void main(String[] args) {
        automation a1 = new automation();
        System.out.println(a1.driver);//o/p is same 'Chrome'
        System.out.println(automation.driver);//o/p is same 'Chrome'.
        // being static it can be access directly with class name ; object name is not required
        automation.driver = "Firefox";//static value updated from chrome to Firefox
        System.out.println(automation.driver);
        System.out.println(automation.driver2);//o/p is null (default value)


    }
}

class automation{
    static String driver = "Chrome";
    static String driver2;//static variable not initialised
}