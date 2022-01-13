package Day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String yesOrNo = input.next();

        while (!(yesOrNo).equals("yes") || (yesOrNo.equals("no"))){
            System.out.println("Please re-enter");
            yesOrNo= input.next();
        }


        if(yesOrNo.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }



    }
}
