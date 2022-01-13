package day19_LoopPractices;

public class charsAppearedTwice {
    public static void main(String[] args) {

        String word = "gghfsdd";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            int count=0;

            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if(count==2 && !result.contains(""+word.charAt(i))){
                result+=""+word.charAt(i);

            }
        }
        System.out.println(result);
    }
}
