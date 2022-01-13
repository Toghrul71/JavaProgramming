package day23_Tasks;

public class positiveNegativeOrZero {
    public static void main(String[] args) {
        positiveNegOrZero(0);
    }

    public static void positiveNegOrZero(int number){

        if(number<0){
            System.out.println(number+" is negative number");
        }else if(number==0){
            System.out.println(number+" is zero");
        }else {
            System.out.println(number+" is positive number");
        }

    }
}
