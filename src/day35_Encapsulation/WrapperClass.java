package day35_Encapsulation;

public class WrapperClass {
    public static void main(String[] args) {
        String str=")(*&^%Welcome669To087Java";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                result+=" ";
            }
            if(Character.isAlphabetic(str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        System.out.println(result.trim());
    }
}
