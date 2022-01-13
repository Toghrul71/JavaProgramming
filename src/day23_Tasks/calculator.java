package day23_Tasks;

public class calculator {
    public static void main(String[] args) {
        calculator(5,5,'*');

    }
    public static void calculator(int num1, int num2, char ch){
        int sum=0;
        if(ch=='+'){
            sum = num1+num2;
            System.out.println("Sum is: "+sum);
        }else if(ch=='-'){
            sum = num1-num2;
            System.out.println("Sum is: "+sum);
        }else if(ch=='*'){
            sum = num1*num2;
            System.out.println("Sum is: "+sum);
        }else if(ch=='/') {
            sum = num1/num2;
            System.out.println("Sum is: "+sum);
        }else {
            System.out.println("Invalid operator");
        }



    }

}
