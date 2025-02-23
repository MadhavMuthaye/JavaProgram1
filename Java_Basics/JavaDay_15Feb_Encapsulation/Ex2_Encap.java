package JavaDay_15Feb_Encapsulation;

public class Ex2_Encap {
    public static void main(String[] args) {
         ICICIBank c1= new ICICIBank("Madhav",10000);
        System.out.println(c1.getBal());

        boolean iscashier = true;
        c1.setBal(50000,iscashier);
        System.out.println(c1.getBal());
    }
}

class ICICIBank {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean iscashier) {
        if (iscashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the balance");
        }
    }
}