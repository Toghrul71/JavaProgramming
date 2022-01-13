package Day29_ArrayList;

public class StringCover {
    public static void main(String[] args) {
        String resultt= coverString("hello hello", "ello");
        System.out.println(resultt);


    }
    public static String coverString(String main, String coverME){
        String result="";

        if(main.contains(coverME)){
            result=main.replaceAll(coverME,"["+coverME+"]");
        }else {
            result="["+main+"]";
        }
        return result;
    }
}
