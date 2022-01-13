package day21_forEachLoop;

public class ClassmatesReverse {
    public static void main(String[] args) {

    String[] classmates = {"Ali B", "Toghrul H", "Koray B"};


        for (int i = 0; i < classmates.length; i++) {
            String reversed = "";

            for (int j = classmates[i].length(); j > 0; j--) {

                reversed+=""+classmates[i].charAt(j-1);
            }
            System.out.println(reversed);
        }


}
}