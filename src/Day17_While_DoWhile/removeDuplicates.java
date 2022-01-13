package Day17_While_DoWhile;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "AABBCC";
        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            String ch =""+ str.charAt(i);

            if(result.contains(ch)){  // if result already contains character it skips it
                continue; // skip

            } result+=ch;

        }
        System.out.println(result);
    }
}
