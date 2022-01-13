package day19_LoopPractices;

public class indexNumberOfFirstUnique {
    public static void main(String[] args) {


        String str = "azzbbcd";
        String result = "";
        int resultIndex = -1;

        // outer:
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            //inner:
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                result = "" + str.charAt(i);
                resultIndex = i;
                break;
            }
        }
        System.out.println("result = " + result);
        System.out.println("resultIndex = " + resultIndex);
    }
}