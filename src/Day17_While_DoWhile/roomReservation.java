package Day17_While_DoWhile;

import java.util.Scanner;

public class roomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Do you want a room?");
        String yesOrNo = input.next().toLowerCase();

        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
            System.out.println("Invalid entry, please re enter");
            yesOrNo = input.next().toLowerCase();
        }
        if (yesOrNo.equals("yes")) {
            System.out.println("Which type of room do you want? King/Queen/Single");
            String typeOfRoom = input.next().toLowerCase();


            while (!(typeOfRoom.equals("king") || typeOfRoom.equals("queen") || typeOfRoom.equals("single"))) {
                System.out.println("Invalid room type, please re enter");
                typeOfRoom = input.next().toLowerCase();

            }
            if (typeOfRoom.equals("king")) {
                System.out.println("King Bed ==> 120$");
            }
            if (typeOfRoom.equals("queen")) {
                System.out.println("Queen Bed ==> 100$");
            }
            if (typeOfRoom.equals("single")) {
                System.out.println("Single Bed ==> 80$");
            }

        }   if(yesOrNo.equals("no")) {
                    System.out.println("Have a nice day");


                }
                input.close();

                }


            }







/*
Create a class called RoomReservation, write a program for the room reservation, your program asks the user
 wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no,
    	print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user
    			provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a
            valid entry)

 */