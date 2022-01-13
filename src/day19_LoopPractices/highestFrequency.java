package day19_LoopPractices;

public class highestFrequency {
    public static void main(String[] args) {



    String  word = "baaaddddlkj";
    int highestFrequency =0;

        for (int i = 0; i < word.length(); i++) {
            int count = 0;


        for (int j = 0; j < word.length(); j++) {
            if(word.charAt(i)==word.charAt(j)){
                count++;
            }
        }
        if(count>highestFrequency){
            highestFrequency=count;

        }
        }
        System.out.println("highest frequency: " +highestFrequency);
    }

}
