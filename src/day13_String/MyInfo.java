package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your gender");
        String gender = input.next();
        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.next();
        input.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();
        input.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter your School name");
        String schoolName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state name");
        String stateName = input.nextLine();

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();

        System.out.println("Enter your Street name");
        String streetName = input.next();

        input.close();

        System.out.println(fullName + "\n"+age+"\n"+gender+"\n"+phoneNumber+"\n"+"address:"+"\n     "+buildingNumber+ " "+streetName+"\n      "
                +cityName+", "+stateName+" "+zipCode+"\n"+schoolName);
    }
}
