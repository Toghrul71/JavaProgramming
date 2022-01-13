package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String word = "  ";
        boolean isEmpty = word.isEmpty();
        System.out.println(isEmpty);

        System.out.println("----------------------");

        String word2 ="  5 ";
        boolean isBlank=word2.isBlank();
        System.out.println(isBlank);

        System.out.println("----------------------");

        String sentence = "jaVa is good";
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2= sentence.toLowerCase().contains("java");
        boolean hasJava3= sentence.toUpperCase().contains("JAVA");

        System.out.println(hasJava3);

        System.out.println("----------------------");

        String word4 = "Wooden SpOOn";
        boolean startsWithWoo = word4.startsWith("oo");

        boolean endsWithOon= word4.toLowerCase().endsWith("oon");


        System.out.println(endsWithOon);
    }
}
