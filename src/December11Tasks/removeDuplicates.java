package December11Tasks;

public class removeDuplicates {
    public static void main(String[] args) {

        removeDuplicates("ggghhhj");

    }
    public static void removeDuplicates(String str){
        int count =0;
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if(!result.contains(""+each)){
                result+=each;
            }
        }
        System.out.println(result);

            }
        }


