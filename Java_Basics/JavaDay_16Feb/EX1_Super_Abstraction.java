package JavaDay_16Feb;

public class EX1_Super_Abstraction {
    public static void main(String[] args) {
        car c1 = new car(100);
        c1.display();

    }
}

    // single inheritance

    class vehicle   {
        public int maxspeed = 180;

        vehicle(){
            System.out.println("Default Constructor");
        }
        //parametrized constructor
         vehicle(int a) {
             this.maxspeed = a;
         }

            void message(){
                 System.out.println("No return type , No agrument");
            }
    // Method overloading - same name of function but different argument/parameters
            void message(int a){
                 System.out.println("This is parametrized constructor");

             }

             void display()
             {
                 System.out.println("Vehicle Parent");
             }
        }

    class car extends vehicle{
        int maxspeed = 200;

        car(){
            super(100);
        }

        car(int a){
            System.out.println("Parametrized Constructor Car");
        }

        @Override
        void display() {
            System.out.println("Override - Car ");
            System.out.println(super.maxspeed); //180  - Using super keyword access variable of parent
            System.out.println(this.maxspeed);// 200 - calling our own

        }
    }





