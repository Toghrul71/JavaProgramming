package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        //i initialization   condition     iteration

        for (int number=15;  number<=45;   number++ ){
            System.out.print(number+" ");
        }
        System.out.println("\nHello");

        //i initialization   condition     iteration
        for(int number =100; number>=50; number--){
            System.out.print(number+" ");
        }
        System.out.println("");
        // print number from 1---55
        for (int number=1;  number<=55; number++){
            if(number%2==0){

                System.out.print(number+" ");
            }


        }

    }
}
