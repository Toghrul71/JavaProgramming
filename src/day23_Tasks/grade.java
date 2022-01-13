package day23_Tasks;

public class grade {

    public static void main(String[] args) {

        gradeBasedOnTheScore(150);
    }

    public static void gradeBasedOnTheScore(int score) {

        if (score >= 0 && score <= 100) {


            if (score <= 60) {
                System.out.println("Your grade is: " + 'F');
            } else if (score >= 61 && score <= 70) {
                System.out.println("Your grade is: " + 'D');
            } else if (score>=71 && score<=80){
                System.out.println("Your grade is: " + 'C');
            }else if(score>=81 && score<=90){
                System.out.println("Your grade is: " + 'B');
            }else {
                System.out.println("Your grade is: " + 'A');
            }

        }else {
            System.out.println("Invalid grade, please re-enter");
        }

    }
}