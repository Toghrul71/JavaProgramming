package December11Tasks;

public class reversedArray {
    public static void main(String[] args) {
        String reversedArray= reversed(new String[]{"java", "is", "good"});
                                    //                 0      1      2
        System.out.println(reversedArray);
    }

    public static String reversed(String [] arr){

        String reversed="";

        for (int i = arr.length-1; i >=0 ; i--) {

            reversed+=arr[i]+" ";
        }
        return reversed;

    }
}
