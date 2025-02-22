package JavaDay_9Feb_OppsConstructors;

public class car2 {
    String model;
    int year;

    car2(){
        model = "XXXX";
        year = 0;
        System.out.println("Default Constructor");
    }
/// parametrized constructor
    car2(String model_name, int year_created){
        this.model = model_name;// This keyword used only in constructor
        this.year = year_created;

    }
}
