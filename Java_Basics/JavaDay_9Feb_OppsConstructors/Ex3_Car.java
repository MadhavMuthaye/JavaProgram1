package JavaDay_9Feb_OppsConstructors;

public class Ex3_Car {
    public static void main(String[] args) {
        car tesla = new car();
        // values (Unknow car XXXX 0 )  will be taken from Class car
        System.out.println(tesla.name + " " + tesla.model + " " + tesla.year);

        tesla.name = "Tesla Zen3";
        tesla.year = 2025;
        tesla.model = "3rd Generation";
        System.out.println(tesla.name + " " + tesla.model + " " + tesla.year);
        System.out.println("----------------");

        car nano = new car();
        nano.name = "Nano Zen3";
        nano.year = 2025;
        nano.model = "A Generation";
        System.out.println(nano.name + " " + nano.model + " " + nano.year);


    }
}
