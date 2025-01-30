package JavaDay_26Jan;

public class Ex2_fun_duplicateofmain { // JVM program calls this main function
    public static void main(String[] args) {
    main(); // function calling
    }

    static void main() { // defined outside of main class having no argument and no return(void)
        System.out.println("This function is similar to main function");
        main2();



    }
    static void main2(){
        System.out.println("One more function");
    }
}
