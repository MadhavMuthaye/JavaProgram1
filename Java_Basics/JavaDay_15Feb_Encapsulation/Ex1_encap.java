package JavaDay_15Feb_Encapsulation;

public class Ex1_encap {
    public static void main(String[] args) {
        vwologin v1= new vwologin("madhav","123");
        ///cannot be accessed
        //v1.Username()  = "Manoj"; // Not allowed
       v1.setUsername("Manoj");// use set function to change username
        System.out.println(v1.getUsername());


        boolean isadmin = true;
        v1.setPassword("345",true);/// only when user is admin then allowed to change password
        System.out.println(v1.getPassword());

    }
}

class vwologin{
    private String username;// can't be accessed outside the class
    private String password;// can't be accessed outside the class


    //shortcut to create Getter setter
    //right click -- > generate -- > constructor --?  select reqd paramaters-- click on OK
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isadmin) {
        if (isadmin) {
            this.password = password;
        }
        else {
            System.out.println("Not allowed to change password !");
        }
    }
    // Getter setter end
    //shortcut to create constructor
    //right click -- > generate -- > constructor --?  select both paramaters-- click on OK
    public vwologin(String user, String pwd) {
      this.username = user;
      this.password = pwd;
    }
}
