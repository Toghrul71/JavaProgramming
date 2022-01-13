package day21_forEachLoop;

public class commonElementsForEach {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int outerEach : arr1) {
            for (int innerEach : arr2) {

                if(outerEach==innerEach){
                    System.out.println(outerEach);
                }
            }
        }

    }
}
