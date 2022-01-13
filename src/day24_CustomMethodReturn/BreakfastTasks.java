package day24_CustomMethodReturn;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Toghrul", "Huseynov");
        domain("te7999@gmail.com");
        nameOfMonth(1);
        nameOfDay(1);
        daysOfTheMonth("December");
        uniqueCharacters("jhggggkjjjj");
        uniqueElements(new int[]{5,6,5});


    }
    //display the initials of the person

    public static void initials(String firstName, String lastName) {

        firstName = firstName.toUpperCase().substring(0, 1);
        lastName = lastName.toUpperCase().substring(0, 1);


        System.out.println(firstName + "." + lastName);

    }

    public static void domain(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println("Domain is: " + domain);

        String[] emails = {"te7999@gmail.com", "te@gmail.com"};

        for (String emaill : emails) {
            domain += emaill;
        }

        System.out.println(domain);


    }

    // display name of the month based on the given number
    public static void nameOfMonth(int number) {
        String name = "";

        if (number >= 1 && number <= 12) {


            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" :
                    (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" :
                            (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" :
                                    "December";

        } else {
            System.out.println("Invalid number");
        }
        System.out.println("Month name: " + name);


    }

    // print  name of day based on the given number  TASK1
    public static void nameOfDay(int number) {
        String nameOfTheDay = "";
        if (number >= 1 && number <= 7) {

            nameOfTheDay = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday"
                    : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";

        } else {
            nameOfTheDay = "Invalid number";
        }
        System.out.println("Name of the day: " + nameOfTheDay);

    }

    // method to print how many days months has  TASK2

    public static void daysOfTheMonth(String month) {
        boolean has28Days = month.equalsIgnoreCase("February");
        boolean has30Days = month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November");
        boolean has31Days = !has28Days && !has30Days;

        if(has28Days){
            System.out.println(month+" has 28 days");
        }else if(has30Days){
            System.out.println(month+" has 30 days");
        }else if(has31Days){
            System.out.println(month+" has 31 days");
        }


    }

    // create a method that can display the unique characters of a string

    public static void uniqueCharacters(String characters){

        for (int i = 0; i < characters.length(); i++) {
            String ch=""+characters.charAt(i);
            int count =0;
            for (int j = 0; j < characters.length(); j++) {
                String each=""+characters.charAt(j);

                if(ch.equals(each)){
                    count++;
                }

            }
            if (count == 1) {

                System.out.println(ch);
            }
        }
    }

    //create a method that can display the unique elements of array
//



    public static void uniqueElements(int[] array){

        for (int i = 0; i < array.length; i++) {
            int count =0;

            for (int j = 0; j < array.length; j++) {

                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("Unique elements: "+ array[i]);
            }
        }
    }
}