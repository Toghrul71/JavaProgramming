package day23_Tasks;

public class eachCharacterOfAString {
    public static void main(String[] args) {
        printEachChar("fgjhahj@@@6756");

    }

    public static void printEachChar(String characters){

        String numbers="";
        String letters="";
        String specialCharacters="";

        for (int i = 0; i < characters.length(); i++) {

            char ch = characters.charAt(i);

            if(ch>=48 && ch<=57){
                numbers+=""+ch;
            }else if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
                letters+=""+ch;
            }else {
                specialCharacters+=""+ch;
            }
        }

        System.out.println("Numbers: "+numbers);
        System.out.println("Letters: "+letters);
        System.out.println("Special characters: "+specialCharacters);

    }
}
