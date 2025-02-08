package JavaDay_2Feb;

public class EX3_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Madhav");
        sb.append("Muthaye");///same string is appended instead of creating new string
        System.out.println(sb);//o/p is MadhavMuthaye
        sb.reverse();
        System.out.println(sb);//o/p is eyahtuMvahdaM


        StringBuilder sb1 = new StringBuilder("Manoj");
        sb1.append("MOre");///same string is appended instead of creating new string
        System.out.println(sb1);//o/p is ManojMore
        sb1.reverse();
        System.out.println(sb1);//o/p is erOMjonaM
    }
}
