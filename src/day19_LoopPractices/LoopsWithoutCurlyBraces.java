package day19_LoopPractices;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {
        String word = "bbaahhbbbl";
        String result = "";

        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j);
            int count = 0;


            for (int i = 0; i < word.length(); i++) {

                char each = word.charAt(i);

                if (ch == each) {
                    count++;
                }

            }
            if(result.contains(""+ch)){
                continue;


            }result+=ch;
        }

        System.out.println(result);
    }
}