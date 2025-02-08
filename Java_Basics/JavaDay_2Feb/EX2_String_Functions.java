package JavaDay_2Feb;

public class EX2_String_Functions {
    public static void main(String[] args) {
        String s1 = "Hello";//stored in String constant pool /SCP

        //1. length()
        System.out.println(s1.length());//o/p is 5. Length function Returns the length of this string.

        String s2 = "Madhav";

        //2. charAt()
        System.out.println(s2.charAt(3));//o/p is h. position starts with 0. Returns the char value at the specified index.
        // An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.

        //3    Concat()
        System.out.println(s1.concat(" ").concat(s2).concat(" Muthaye"));

        //4 . Contains
        System.out.println(s2.contains("av"));//Returns true if and only if this string contains the specified sequence of char values.

        //5. equals
        System.out.println(s1.equals("hello"));//o/p is false since s1 is Hello. Compares this string to the specified object

        //6. equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase("hello"));//o/p is true since case is ignored

        //7. indexOf()) //Returns the index (starts with 0) within this string of the first occurrence of the specified substring.
        System.out.println(s2.indexOf("a"));//o/p is 1

        //8. replace() Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
        System.out.println(s1.replace('H','h'));//o/p is hello
        System.out.println(s1);//o/p is Hello

        //9. split()
        String email = "madhav@in.com";
        String[] split = email.split("@");
        System.out.println(split[0]);//o/p is madhav
        System.out.println(split[1]);//o/p is in.com

        //10.substring() - Extracts a portion of String

        System.out.println(email.substring(0,7));//o/p is madhav@

        String quote = "Honesty is the best policy";
        System.out.println(quote.substring(15,26));/// o/p is best policy

        //11.toLowerCase
        System.out.println("MADHAV".toLowerCase());

        //12.toUpperCase
        System.out.println("madhav".toUpperCase());

        //13.startsWith()
        String name1= "madhav muthaye";
        System.out.println(name1.startsWith("m"));//case sensitive

        //14.endsWith()
        System.out.println(name1.endsWith("m"));//case sensitive

        //15. trim()

        String name2 = "     madhav    muthaye   ";
        System.out.println(name2.trim());///removes only end spaces. O/p is madhav    muthaye

        //16.compareTo() . ASCII values are compared.
        String name3="madhav";
        System.out.println(name3.compareTo("Madhav"));//o/p is difference in ASCII value m = 109 , M = 77 (109-77 = 32)
        System.out.println(name3.compareTo("madhav"));//o/p is 0 if both are same

        //17. compareToIgnoreCase()
        System.out.println(name3.compareToIgnoreCase("Madhav"));//o/p is 0

        //18. StringBuilder(). This is used to modify same string instead of creating new string like we do for concat()
        StringBuilder sb = new StringBuilder("Madhav");
        sb.append("Muthaye");// joins 2 words. this is used during String Builder
        System.out.println(sb);/// o/p is MadhavMuthaye













    }
}
