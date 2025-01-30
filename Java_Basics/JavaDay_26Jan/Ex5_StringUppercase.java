package JavaDay_26Jan;

public class Ex5_StringUppercase {
    public static void main(String[] args) {
            String name = "Madhav";
        System.out.println(name.length()); //o/p is 6
            name.toUpperCase();

        System.out.println(name);//o/p is Madhav
        name = name.toUpperCase();
        System.out.println(name);//o/p is MADHAV

        name = name.toLowerCase();

        System.out.println(name);//o/p is madhav
        System.out.println(name.concat("Muthaye"));//o/p is madhavMuthaye


    }
}
