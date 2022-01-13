package December19Replits;

import java.util.Scanner;

public class simpleRoomBooking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        if (year == 2018) {
            if (month == 7 && day >= 1 && day <= 8) {
                return false;
            } else {
                return isAvailable;
            }
        }else {
                return false;
            }
        }
    }
