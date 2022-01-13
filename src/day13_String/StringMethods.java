package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
               //index:01234
        char thirdCharacter = word.charAt(2);//(index method)
        System.out.println("thirdCharacter = " + thirdCharacter);

       //char tenthCharacter = word.charAt(9); // it is out of range 0f 0 to 4;
        //System.out.println("tenthCharacter = " + tenthCharacter);

        System.out.println("--------------------------------------------------------");

        String s1 = "Batch 25 is the best batch";
        int totalNumberOfCharacters = s1.length();
        System.out.println("total characters:" + totalNumberOfCharacters);
        
        char lastChar = s1.charAt(totalNumberOfCharacters - 1); // prints "t" from batch
        System.out.println("lastChar = " + lastChar);

        System.out.println("-----------------------------------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); //"WOODEN SPOON"

        System.out.println("str = " + str);
        
        String s = "JAVA";
        s = s.toLowerCase();

        System.out.println("s = " + s);




    }
}
