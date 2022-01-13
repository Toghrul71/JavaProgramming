package day23_Tasks;

public class dollar2Euro {
    public static void main(String[] args) {

        dollarToEuro(10);
        dollarToLira(10);
    }

    public static void dollarToEuro(double dollar){

        double euro = dollar*0.89;
        System.out.println(dollar+" dollar is: "+euro+" euro");

    }

    public static void dollarToLira(double dollar){

        double lira =  dollar*13.8;

        System.out.println(dollar+" dollar is: "+lira+" lira");

    }
}
