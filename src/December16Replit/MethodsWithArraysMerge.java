package December16Replit;

import java.util.Arrays;

public class MethodsWithArraysMerge {

    public static void main(String[] args) {
       int[] a1 = {1,2,3};
        int[] a2 = {4,5,6};

        int[] merged = mergR(a1,a2);
        System.out.println(Arrays.toString(merged));
    }

    public static int[] mergR(int[] a, int[] b){
    int[] newArray= new int[a.length+ b.length];
    int index=0;

        for (int i = 0; i < a.length; i++) {
            newArray[index++]=a[i];


        }
        for (int j = 0; j < b.length; j++) {
            newArray[index++]=b[j];
        }
        return newArray;
    }
}
