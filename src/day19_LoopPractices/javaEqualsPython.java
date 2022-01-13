package day19_LoopPractices;

import java.util.Scanner;

public class javaEqualsPython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava=0;
        int countPython=0;
        boolean check;

        for (int i = 0; i <=sentence.length()-4 ; i++) {

            if(sentence.substring(i,i+4).equals("java")){
                countJava++;

            }
            if((i<=sentence.length()-6) && sentence.substring(i,i+6).equals("python")){
                countPython++;
            }

        }
        if(countJava==countPython){
           check=true;
        }else {
            check=false;
        }

        System.out.println(check);

    }
}


/*
String sentence = "cat and dog is a friend because cat and dog be a friend.";
                         //0123456
        String findCat = "cat";
        String findDog = "dog";

        int countCat =0;
        int countDog = 0;
        boolean check;

        for (int i = 0; i <=sentence.length()-findCat.length(); i++) {// it starts by: 0+1. then checks if its<54. Again 1+1.

            if(sentence.substring(i,i+3).equalsIgnoreCase(findCat)  ){
                // if sentence.substring(0,0+3) = "cat"  then : java does: countCat+1=1
                                                                  // it is 0 in the beginning and adds 1=1


                countCat++;// if find cat the adds 1 to 0;


            }
            if(i<=sentence.length()-findDog.length() && sentence.substring(i,i+3).equalsIgnoreCase(findDog)){
                countDog++;
                // if sentence.substring(0,0+4) = "dog"  then : java does: countCat+1=1
                // it is 0 in the beginning and adds 1=1
            }

        }
        if(countCat==countDog){
            check =true;
        }else {
            check=false;
        }
        System.out.println(check);
 */