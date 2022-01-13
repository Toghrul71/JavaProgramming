package day25_CustomMethods;

public class addElementsToArray_Overloading {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        numbers=addElement(numbers,3);

        char[] chars = {'A', 'B', 'C', 'D'};

        String[] names = {"Toghrul", "Zeynab", "Vahida"};

    }

    public static int[] addElement(int[] array1, int number) {
        int[] newArray = new int[array1.length + 1];  // new array should have the size of array1 and size of number(size is 1)
        int i = 0;  // index number starts with zero
        for (int each : array1) {// to get all elements of array1
            newArray[i] = each;//  starts with 0 next is 1 (i is indexes)
            i++;
        }
        newArray[i] = number;  // the las index will be assigned to number
        return newArray;


    }

}