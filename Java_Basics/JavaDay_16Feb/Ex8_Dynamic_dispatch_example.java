package JavaDay_16Feb;

public class Ex8_Dynamic_dispatch_example {
    public static void main(String[] args) {
        book2 d = new book1(); // Dynamic Dispatch with Interface
        book1 d1 = new book1();
        d.display();
        System.out.println(d.a);

        // Webdriver driver = new ChromeDriver(); // another exampleDay_ Dynamic Dispatch
    }
}


interface book2{
    public int a = 10;
    void display();
}

class book1 implements book2{

    @Override
    public void display() {
        System.out.println(a);
    }
}