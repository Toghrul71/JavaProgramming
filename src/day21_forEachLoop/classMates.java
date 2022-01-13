package day21_forEachLoop;

public class classMates {
    public static void main(String[] args) {

        String[] classmates = {"Ali B", "Toghrul H", "Koray B"};

        for (String eachName : classmates) { // each name

            System.out.println(""+eachName.charAt(0)+"."+eachName.charAt(eachName.indexOf(" ")+1));

        }


    }
}
