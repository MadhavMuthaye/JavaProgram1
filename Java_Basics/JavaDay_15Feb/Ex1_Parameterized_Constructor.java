package JavaDay_15Feb;

public class Ex1_Parameterized_Constructor {
    public static void main(String[] args) {
        mobile oppo = new mobile();
        System.out.println(oppo.model);
        System.out.println(oppo.year);

        mobile oppo1 = new mobile("Oppo k12",2021);
        System.out.println(oppo1.model + oppo1.year);

        mobile iphone= new mobile("iphone16",2025);
        System.out.println(iphone.model + iphone.year);

    }



}

class mobile{
    String model  = "oppo v1";
    int year = 2024;
    mobile(){

    };

    //parameterized constructor
    mobile(String model_name, int year_launch){
        this.model = model_name;
        this.year = year_launch;
    }
}