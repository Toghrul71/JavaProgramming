package day21_forEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words={"Java Programming", "Cydeo School", "Early Birds", "Angry Birds"};

        for (String eachElement : words) {

            // first and last characters of each element
            System.out.println(""+eachElement.charAt(0)+ eachElement.charAt(eachElement.length()-1));

        }

    }
}
