package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName = "cYDEo",
                lastName = "SChoOL";

         // firstName= firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toUpperCase();

        firstName = (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
       lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstName);
        System.out.println(lastName);


    }
}

/*
input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */