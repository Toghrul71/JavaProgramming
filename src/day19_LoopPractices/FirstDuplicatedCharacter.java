package day19_LoopPractices;

public class FirstDuplicatedCharacter {
    public static void main(String[] args) {

        String word = "aabbhytr";
        String result ="";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {

                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                result=""+word.charAt(i);
                break;
            }
        }

        System.out.println(result);
}
}

    //Write a program that can return the first duplicated character from a string

    // aabbhytr//  aa