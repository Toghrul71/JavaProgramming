package day16_ForLoopString;

public class uniqueCharacters {
    public static void main(String[] args) {
        String word = "a a a b c c c";
                    // 0 1 2 3 4 5 6

        String result="";


        for (int i = 0; i <word.length() ; i++) { // i: index numbers of string starting from 0
            char ch = word.charAt(i); // ch is representing each character

            if(word.indexOf(ch)==word.lastIndexOf(ch)){ // if first and last index numbers of the char are same then char is unique
                result += ch;
            }
        }
        System.out.println(result);
    }
}
