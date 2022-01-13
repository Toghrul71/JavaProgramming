package December11Tasks;

public class mergeTwoArrays {
    public static void main(String[] args) {

        String mergedArraysNew= merge(new String[] {"java","java" }, new String[]{"is", "good"});
        System.out.println(mergedArraysNew);
    }

    public static String merge(String[] arr1, String[] arr2){
        String array1="";
        String array2="";
        String mergedArrays=array1+array2;

        for (int i = 0; i <arr1.length; i++) {
            array1+=arr1[i]+" ";

            for (int j = 0; j < arr2.length; j++) {
                array2+=arr2[j]+" ";
            }
        }
        return array1+array2+"";

    }
}
