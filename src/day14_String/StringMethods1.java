package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "     batch 25     ";
        str1 = str1.trim(); //batch25
        System.out.println(str1);

        String str2 = "Cydeo School";

        int indexNumberOfH = str2.indexOf("h");
        System.out.println("indexNumberOfH = " + indexNumberOfH);

        int indexOfFirstO = str2.indexOf("ol");
        System.out.println("indexOfFirstO = " + indexOfFirstO);

        String str3 = "Java Programming Language";
        int indexNumberOfFourthA = str3.indexOf("an");
        System.out.println("indexNumberOfFourtA = " + indexNumberOfFourthA);

        int indexNumberOfThirdG = str3.indexOf("gu");
        System.out.println("indexNumberOfFirstG = "+indexNumberOfThirdG);

        System.out.println("-----------------------------------------------------");
        String s = "Java Nova Cava Wawa orange";

        int firstA=s.indexOf("a");
        int lastA=s.lastIndexOf("a");
        int secondA=s.indexOf("a ");
        int thirdA=s.indexOf("a C");
        // int fourthA=s.indexOf("ava W");
        int fourthA = s.indexOf("Ca") + 1;
        int fifthA = s.lastIndexOf("a W");

        System.out.println(firstA);
        System.out.println(lastA);
        System.out.println(secondA);
        System.out.println(thirdA);
        System.out.println(fourthA);





    }
}
