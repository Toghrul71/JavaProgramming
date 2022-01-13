package day21_forEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Toghrul", "Zeynab", "Vahida", "Vahida"};

        for (String outerEachElement : words) { // outerEach : every single element  "Toghrul", "Zeynab", "Vahida"

        int count =0;

        for (String eachElement : words) {
            if(eachElement.equals(outerEachElement)){ // eachElement : every single element "Toghrul", "Zeynab", "Vahida"
                count++;
            }

        }
        if(count==1){
            System.out.println(outerEachElement);
        }

        }
    }
}
