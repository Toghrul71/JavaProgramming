package day19_LoopPractices;

public class firstDuplicateIndex {
    public static void main(String[] args) {

        String word= "zabbmh";
        int indexNumber =-1; // it is less than 0 because if there is no duplicate
        // character it will show 0 if we assign the value to zero.

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if (count>1){
                indexNumber=i;
                break;
            }
        }


        System.out.println(indexNumber);
    }
}
