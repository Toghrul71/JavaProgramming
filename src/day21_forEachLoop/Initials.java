package day21_forEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Koray B", "Nattaya A", "Cristina C", "Edrees S", "Gorkhmaz V","Nazir M", "Selma S", "He Young"};

        for (String eachName : names) {

            System.out.println(eachName.charAt(0)+"."+eachName.charAt(eachName.indexOf(" ")+1));

        }

    }
}
