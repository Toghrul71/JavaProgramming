package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class gradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer>scores=new ArrayList<>();
        scores.addAll(Arrays.asList(50,55,60,65,70,75,80,85,90,95));

        ArrayList<Integer>gradeOfA=new ArrayList<>(scores);
        gradeOfA.removeIf(p-> !(p>=90 && p<=100));  // dont remove if between 90 and 100
        System.out.println(gradeOfA);

        ArrayList<Integer>gradeOfB=new ArrayList<>(scores);
        gradeOfB.removeIf(p-> !(p>=80 && p<=89));
        System.out.println(gradeOfB);

        ArrayList<Integer>gradeOfC=new ArrayList<>(scores);
        gradeOfC.removeIf(p-> !(p>=70 && p<=79));
        System.out.println(gradeOfC);

        ArrayList<Integer>gradeOfD=new ArrayList<>(scores);
        gradeOfD.removeIf(p-> !(p>=60 && p<=69));
        System.out.println(gradeOfD);

        ArrayList<Integer>gradeOfF=new ArrayList<>(scores);
        gradeOfF.removeIf(p-> !(p>=0 && p<=59));
        System.out.println(gradeOfF);




    }
}
