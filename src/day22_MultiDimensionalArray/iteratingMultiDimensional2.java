package day22_MultiDimensionalArray;

public class iteratingMultiDimensional2 {
    public static void main(String[] args) {

        int[][] arr2D={ {1,2,3},{4,5,6,7},{8,9,10,11,12} };
        //                 0        1           2

        for (int i = arr2D.length - 1; i >= 0; i--) { // i: index number of 1 dimensional array starting from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) {  // j: index number of elements gets each element from arrays 0 to last index of array

                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();  // to print second and third array in the new line



            }
        System.out.println("--------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {  // i is index number of each single array

            for (int j = arr2D[i].length - 1; j >= 0; j--) {  // j is index number of each element

                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();
        }
    }
}
