package JavaDay_19Jan;

public class EX13_TO_CLI_Task1 {
    public static void main(String[] args) {
       //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //
        //A: 90-100
        //
        //B: 80-89
        //
        //C: 70-79
        //
        //D: 60-69
        //
        //F: 0-59
        int marks = Integer.parseInt(args[0]) ;

        String grade = (marks>=0 && marks <=59) ? "Grade F" :
                (marks >=60 && marks <=69) ? "Grade D" :
                        (marks >=70 && marks <=79) ? "Grade C" :
                                (marks >=80 && marks <=89) ? "Grade B" :
                                        (marks >=90 && marks <=99) ? "Grade A" :
                                                "Marks not valid" ;
        System.out.printf("Your grade is %s",grade);
    }
}
