package day19_LoopPractices;

public class IndexNumber1stUnique {
    public static void main(String[] args) {

        String  word = "baadlkj";
        int indexResult =-1;

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if(count==2){
                indexResult=i;
                break;
            }
        }
        System.out.println("index number is: " +indexResult);
    }
}
