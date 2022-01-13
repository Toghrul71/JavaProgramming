package day23_CustomeMethodsIntro;

public class CustomeMethodsPractice {

    public static void main(String[] args) {
        helloWorld5Times();

        System.out.println("--------------------------");

        helloCydeo5Times();

        System.out.println("--------------------------");

        evenNumbers1To10();
    }

    // print "Hello World" 5 times
    public static void helloWorld5Times(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }

    }

    // print "Hello Cydeo" 5 times
    public static void helloCydeo5Times(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    // print even numbers 1 to 10
    public static void evenNumbers1To10(){

        for (int i = 2; i <=10 ; i+=2) {

                System.out.println(i);

        }
    }

}
