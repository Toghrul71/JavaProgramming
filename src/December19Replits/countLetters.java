package December19Replits;

import java.util.Arrays;

public class countLetters {
    public static void main(String[] args) {
        String countt = countLetters("ggggc");
        System.out.println(countt);

    }

    public static String countLetters(String str) {
        String result = "";
        //String[] array =str.split(" ");
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (!result.contains("" + str.charAt(i))) {
                result += "" + count + str.charAt(i);
            }

        }
        return result;
    }
}





        //int letters = countLetters("sdff");
        //System.out.println(letters);

    //public static String countLetters(String str){

        //char[] ch = str.toCharArray();
        //int count =0;
       // for (char each:ch){
            //if(Character.isLetter(each)){
                //count++;

       // }
        //return count;
  //  }
//}
