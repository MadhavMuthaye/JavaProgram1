package JavaDay_15Feb_Inheritance;

public class Ex3_Multilevel_Inheritance {
    public static void main(String[] args) {
        animal a = new animal();
        dog d = new dog();
        d.eat();
        puppy p = new puppy();
        p.barking();
        p.eat();
    }
}

class animal{
     void eat(){
         System.out.println("Eating");
     }
}

class dog extends animal{
    void barking (){
        System.out.println("barking");
    }
}

class puppy extends dog{

}