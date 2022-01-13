package day18_NestedLoop;

public class Triple {
    public static void main(String[] args) {

        String triple = "xxxbng";
        int count = 0;

        for (int i = 0; i < triple.length(); i++) {

        if(triple.indexOf(i)==triple.lastIndexOf(i)){
            count++;
            }




        }
        System.out.println(count);
    }
}


/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number
of triples in the given string. The triples may overlap.
 */