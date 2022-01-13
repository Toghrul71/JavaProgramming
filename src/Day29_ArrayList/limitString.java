package Day29_ArrayList;

public class limitString {
    public static void main(String[] args) {
        String texxxt=limit("abcd",2);
        System.out.println(texxxt);

    }
    public static String limit(String text, int maxLength){
        String neww =(text.substring(0,maxLength));
        return neww;
    }
}
