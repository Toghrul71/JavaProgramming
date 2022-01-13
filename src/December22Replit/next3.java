package December22Replit;

import java.util.Scanner;

public class next3 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter number");

        int num = inp.nextInt();

            next3(num);

    }
    public static void next3(int n){
        System.out.println();
        System.out.println("next 3 are:");
        for (int i = n+1; i < n+4; i++) {

            System.out.print(i+" ");
        }

    }

}
