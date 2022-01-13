package day23_Tasks;


public class ifAnagram {
    public static void main(String[] args) {
        anagram("ana","anna");

    }

    public static void anagram(String word1, String word2){
        String reversedWord2="";
        for (int i = word2.length()-1; i >=0 ; i--) {
            char ch=word2.charAt(i);
            reversedWord2+=ch;
        }
        if(word1.equals(reversedWord2)){
            System.out.println("Is anagram");
        }else {
            System.out.println("Is not anagram");
        }
    }
}
