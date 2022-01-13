package December11Tasks;

public class integerArrayAndIntegerNum {
    public static void main(String[] args) {

        Integer frequencyOfNumber = integerArrayCheck(new int[]{1,1,2,1,1,1}, 1);
        System.out.println(frequencyOfNumber);

    }

    public static Integer integerArrayCheck(int[] array, int number){

        int frequency=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==number){
                frequency++;
            }
        }
            return frequency;
    }
}
