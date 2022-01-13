package day20_Arrays;

public class nameAndGrades {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"}; // 3 arrays   0  1  2
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length]; // size = [3] {'A', 'C', 'B'} // }

        grades[0]='A';
        grades[1]='C';
        grades[2]='B';

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]+"'s" +" score is "+scores[i]+", "+ " and grade is "+grades[i]);

        }



    }
}
