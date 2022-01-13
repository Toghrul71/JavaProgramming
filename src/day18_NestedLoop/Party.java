package day18_NestedLoop;
import java.util.Scanner;
public class Party {

    public static void main(String[] args) {

              Scanner scan = new Scanner(System.in);

                // your code
                // ----------Scanner--------------------------

                String name ="";
                String answer ="";
                String list ="";


                    System.out.println("Please enter first guest name:"); // Question 1
                    name=scan.next();


                    System.out.println("Do you want to enter one more guest?");  // Question 2
                    answer = scan.next();


                    while (answer.equalsIgnoreCase("yes")){
                        System.out.println("Please enter guest name:");
                        name+=", "+scan.next(); // before next scan( name) it gives ", "

                        System.out.println("Do you want to enter new guest name:");
                        answer = scan.next();

                    }if(answer.equalsIgnoreCase("no"))

                        list=name;


                    System.out.println("Guest's list: "+list);
                }

            }





