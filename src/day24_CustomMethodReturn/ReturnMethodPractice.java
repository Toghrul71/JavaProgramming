package day24_CustomMethodReturn;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        // find the max number between 100& 200
        // multiply the max number by 2

        int maximumNumber = max(2,5);
        System.out.println(maximumNumber);

        int multiplication=maximumNumber*2;
        System.out.println(multiplication); // Use the variable 2nd time

    }

    public static int max(int a, int b){

        int resultMax =0;
        if(a>b){
            resultMax=a;
        }else {
            resultMax=b;
        }
        return resultMax;
    }
}
