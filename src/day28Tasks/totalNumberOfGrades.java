package day28Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class totalNumberOfGrades {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (int i = 0; i < scores.size(); i++) {

            if (scores.get(i) >= 90 && scores.get(i) <= 100) {
                countA++;

            } else if (scores.get(i) >= 80 && scores.get(i) <= 89) {
                countB++;
            } else if (scores.get(i) >= 70 && scores.get(i) <= 79) {
                countC++;
            } else if (scores.get(i) >= 60 && scores.get(i) <= 69) {
                countD++;
            } else if (scores.get(i) >= 0 && scores.get(i) <= 59) {
                countF++;
            }
        }
        System.out.println("Grade A count: "+countA);
        System.out.println("Grade B count: "+countB);
        System.out.println("Grade C count: "+countC);
        System.out.println("Grade D count: "+countD);
        System.out.println("Grade F count: "+countF);
    }
}

