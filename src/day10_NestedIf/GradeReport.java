package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int score = 75;

        if (score>=0 && score<=100) { // if this condition is true then compiler will check other conditions//5 possibilities

            if (score>=90) {  // no need for this : && score <= 100 , because its already given in first statement
                System.out.println("Excellent");
            }
            if (score>=80) {
                System.out.println("Great");
            }

            if (score>=70) {
                System.out.println("Good");
            }
            else if (score>=60) {
                System.out.println("Passed");


            }
        }
        else { // if the score is not valid
            System.out.println("Invalid score");

        }

    }

}
        /*
        if the score is between 90-100 excellent
        80-89 Great
        79-79 Good
        60-69 Passed
        0-59 Failed

         */
