package day22_MultiDimensionalArray;

public class task {
    public static void main(String[] args) {
        //               j j j   j j j j j   j  j j   j  j
        int[][] arr2D={ {1,2,3},{4,5,6,7,8},{9,10,11,12,13} };
                    //  i( 0 )     i( 1 )       i( 2 )

        for (int i = arr2D.length - 1; i >= 0; i--) { // i : each single array

            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// 12,11,10,9,8
// 8,7,6,5,4
// 3,2,1
