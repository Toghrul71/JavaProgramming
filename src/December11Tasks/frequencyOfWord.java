package December11Tasks;

public class frequencyOfWord {
    public static void main(String[] args) {

        int countt= frequency("java java","java");
        System.out.println(countt);

    }

    public static int frequency(String sentence, String word){

        int count=0;
        String sentenceNew[]= sentence.split(" ");
        for (int i = 0; i < sentenceNew.length; i++) {

            if(sentenceNew[i].contains(word)){
                count++;
            }


        }
        return count;
    }



}
