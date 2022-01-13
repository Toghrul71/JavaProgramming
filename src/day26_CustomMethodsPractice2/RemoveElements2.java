package day26_CustomMethodsPractice2;

public class RemoveElements2 {

    public static int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int ind = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[ind] = array[i];
            ind++;
        }
        return newArray;
    }

    public static double[] removeElement(double[] array, int index) {
        double[] newArray = new double[array.length - 1];
        int ind = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[ind] = array[i];
            ind++;
        }
        return newArray;
    }

    public static String[] removeElement(String[] array, int index) {
        String[] newArray = new String[array.length - 1];
        int ind = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[ind] = array[i];
            ind++;
        }
        return newArray;
    }
}