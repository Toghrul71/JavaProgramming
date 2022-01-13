package December11Tasks;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        boolean isAnaggram=isAnagram("listen","silent");

        System.out.println(isAnaggram);
    }
        public static boolean isAnagram (String str1, String str2){



          char[] ch1 = str1.toCharArray();
          char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1,ch2);

        return result;
        }



    }

