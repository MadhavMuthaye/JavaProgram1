package JavaDay_16Feb_Enum;

public class Ex2_ENUM {
    public static void main(String[] args) {
        System.out.println(urls.Google);
        System.out.println(urls.katalon);
        if (urls.Google.equals("Google")){
            System.out.println("Open google page");
        }
    }
}

enum urls {
   Google, Restassured, katalon , vwo
}