package December22Replit;

import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());

    }

    public static void timeConversion(String s) {
        String[] array = s.split(":");

        if (!s.startsWith("12") && s.endsWith("PM")) {
            int n = Integer.parseInt(array[0]);

            System.out.println((n + 12) + ":" + array[1] + ":" + array[2].substring(0, 2));
        } else if (!s.startsWith("12")&&s.endsWith("AM")) {
            System.out.println(array[0] + ":" + array[1] + ":" + array[2].substring(0, 2));
        } else if (s.startsWith("12") && s.endsWith("PM")) {


            System.out.println(array[0] + ":" + array[1] + ":" + array[2].substring(0, 2));


            }else{// if (s.startsWith("12")&&s.endsWith("AM"))//{
            int n1 = Integer.parseInt(array[0]);
            System.out.println((n1 - 12) +"0"+ ":" + array[1] + ":" + array[2].substring(0, 2));
        }

        }
    }
