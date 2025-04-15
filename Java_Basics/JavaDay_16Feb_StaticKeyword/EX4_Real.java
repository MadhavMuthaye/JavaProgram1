package JavaDay_16Feb_StaticKeyword;

public class EX4_Real {

}
class ATB1{
    {
        System.out.println("IIB - this is called when Object is created!");
    }
    static {
        System.out.println("Load the class?, I will execute");
    }
    private String name; // non static
    private String phone; //non static
    static String courseName = "ATB10x";
// Adding getter setter as below
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        ATB1.courseName = courseName;
    }
    void readDocuments(){
        System.out.println("Non Static Method");
        System.out.println(courseName);
    }

    static void doAssignment(){
        //System.out.println(phone); // Static method can't access the non-static variables
        System.out.println("Do Assignment");
    }
}