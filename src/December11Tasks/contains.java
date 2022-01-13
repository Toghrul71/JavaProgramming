package December11Tasks;

public class contains {
    public static void main(String[] args) {
        boolean checkIf= contains(new int[] {1,2,3},4);
        System.out.println(checkIf);

    }

    public static boolean contains(int[] array, int number){
        boolean check=false;

        for (int i = 0; i < array.length; i++) {

            if(array[i]==number){
                check=true;
            }else {
                check=false;
            }
        }
        return check;
    }
}
