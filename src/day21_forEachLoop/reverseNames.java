package day21_forEachLoop;

public class reverseNames {
    public static void main(String[] args) {

        String[] names = {"Koray B", "Nattaya A", "Cristina C", "Edrees S", "Gorkhmaz V","Nazir M", "Selma S", "He Young"};

        for (String eachName : names) {  // each:

            String reversed ="";

            for (int i = eachName.length()-1; i >=0 ; i--) {

                reversed+=eachName.charAt(i);
            }
            System.out.println(reversed);
        }

    }
}
