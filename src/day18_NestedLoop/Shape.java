package day18_NestedLoop;

public class Shape {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <=i; j++) {  // prints * and checks


                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
