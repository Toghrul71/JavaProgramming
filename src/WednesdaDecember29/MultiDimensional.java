package WednesdaDecember29;

import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {


        String[] scrum1 = {"A", "T", "G"};
        String[] scrum2 = {"B", "D", "K"};
        String[] scrum3 = {"V", "M", "L"};

        String[][] scrumTeams = {scrum1, scrum2, scrum3};
        System.out.println(Arrays.deepToString(scrumTeams));
        System.out.println(scrum2[1]);
        System.out.println("--------");

        for (String[] each:scrumTeams){
            System.out.println(Arrays.toString(each));
        }
        System.out.println(scrum1[1]);

        for (String[] eachScrum:scrumTeams){
            for (String eachName:eachScrum){
                System.out.print(eachName+" ");
            }
        }
    }
}