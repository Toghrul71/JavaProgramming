package day18_NestedLoop;

public class Multiplication {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 11; j++) {          //
                System.out.print(i * j + " \t");    //  i = 1, j=1    // i=2  ,  j=1
                                                   //   i= 1, j=2     // i =2,  j=2
            }

            System.out.println();
        }
    }}

