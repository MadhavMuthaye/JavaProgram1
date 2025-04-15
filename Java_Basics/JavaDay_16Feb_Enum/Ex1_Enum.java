package JavaDay_16Feb_Enum;

public class Ex1_Enum {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(Day.WEDNESDAY);
    }
}

enum Day{ /// enum are used to store constants
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }