package day19_LoopPractices;

public class firstDuplicate {
    public static void main(String[] args) {
        String word="aabbhn";                    //  aabbhn
        String result="";

        for (int i = 0; i < word.length(); i++) {
            int count =0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
        }

            if (count>1){
                result=""+word.charAt(i);
                break;
            }

        }
        System.out.println(result);

    }
}
