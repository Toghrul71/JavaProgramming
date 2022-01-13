package day23_Tasks;

public class evenNumbers1To100 {
    public static void main(String[] args) {

       evenNumbers1to100();
    }

    public static void evenNumbers1to100(){

        for (int i = 1; i <101 ; i++) {
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
    }

}
