package day38_MethodOverriding;

import java.util.Locale;

public class frequencyO {
    public static void main(String[] args) {
        String str = "aabccddd";
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }

            }


            if (!result.contains("" + str.charAt(i))) {

                result += "" +str.charAt(i)+ frequency;
            }
        }
        System.out.println(result);
    }
}
