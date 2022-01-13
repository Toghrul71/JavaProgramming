package day16_ForLoopString;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "JavaJava";

        int frequency =0;

        for (int i = 0; i <=sentence.length()-4 ; i++) {
            String eachSub = sentence.substring(i,i+4);
            if(eachSub.equals("Java")){
                frequency++;
            }


        }

        System.out.println("frequency = " + frequency);
    }
}
