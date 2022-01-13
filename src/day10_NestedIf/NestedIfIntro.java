package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 165;
        if (score>=0 && score<=100){ // if score is valid

        if(score>60){ // if student passed exam
        System.out.println("Passed");}

        else { // if student didnt pass exam
        System.out.println("Failed");}}
        else { // if the score not valid
            System.out.println("Invalid score");
        }

        System.out.println("-------------------------------------");

        int age = 18;
        boolean hasId = false;
        if(hasId){ // if the person has ID then it will check the age

        if(age>=21) {
            System.out.println("Eligible"); // if the person is more than 21 years old

        }
        else { // if the person is less than 21 years old
            System.out.println("Not Eligible");
        }}
        else{
            System.out.println("You must have ID");
        }

        System.out.println("------------------------------------");

        int number = 7;
      if(number>=1 && number<=7) { //if the number is a valid number (1-7)
      if(number==1){
          System.out.println("Monday");
      }
      else if (number==2){
          System.out.println("Tuesday");
      }
      else if(number==3){
          System.out.println("Wednesday");
      }
      else if(number==4){
          System.out.println("Thursday");
      }
      else if(number==5){
          System.out.println("Friday");

      }
      else if(number==6){
      }
      else {
          System.out.println("Sunday");
      }
      }
      else {
          System.out.println("Invalid number");
      }
    }
}
