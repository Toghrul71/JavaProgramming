package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word = "aabbbdddddddssj";
        String result="";  // unique is j


        for (int j = 0; j < word.length(); j++) {
            char outerLoopEach= word.charAt(j);
            int count=0;

            for (int i = 0; i < word.length(); i++) {
                char each = word.charAt(i);  // inner loop and each character of the word

                if(each==outerLoopEach){
                count++;

                }
            }
            if(count==2 && !result.contains(""+outerLoopEach)){
                result+=""+outerLoopEach;

            }


        }
        System.out.println(result);

    }
}


/*
for (int i = 0; i < word.length(); i++) {
            char ch =word.charAt(i); // when it is "a"
            int count=0;  // represents the frequency of the ch


            for (int j = 0; j < word.length(); j++) { // compares the character that outer loop picked with each characters of the string
                char each = word.charAt(j);   // each character of word

                if(ch==each){
                    count++;
                }
        }

            if(count==1){  // if the frequency of the character is 1, then character is unique
                result+=ch;
            }
        }

        System.out.println(result);
 */