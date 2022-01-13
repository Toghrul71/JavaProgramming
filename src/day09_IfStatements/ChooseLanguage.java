package day09_IfStatements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 5;

        boolean for1 = selection ==1;
        if(for1) {
            System.out.println("Hello, thank for your call");
        }

        boolean for2 = selection ==2;
        if(for2) {
            System.out.println("Hola, gracias para llamar");
        }

        boolean for3 = selection ==3;
        if(for3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }
        boolean for4 = selection ==4;
        if(for4) {
            System.out.println("Privet, spasibo za vash zvonok");
        }

        boolean for5 = selection ==5;
        if(for5) {
            System.out.println("Merci ,pour votre appel");
        }








    }
}


    //Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:
//
//		for 1: Hello, thank for your call
//		for 2: Hola, gracias para llamar
//		for 3: Merhaba, aradiginiz icin tesekkurler
//		for 4: Privet, spasibo za vash zvonok
//		for 5: Merci ,pour votre appel