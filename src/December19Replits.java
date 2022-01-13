public class December19Replits {
    public static void main(String[] args) {

        printUniqueNumbers(new int[]{2, 5, 5});
    }
    public static void printUniqueNumbers(int[] nums){

        for (int outerEach:nums){   // it reads full array, takes index 0 (2) from this array and compares to all indexes (using inner loop)
            int count=0; //
            for (int innerEach:nums){ // index 0(2) is compared with all indexes here  0  1  2  3  4
                if(outerEach==innerEach){
                    count++; // count increases one by one
                }
            } // after second array
            if(count==1){
                System.out.println(outerEach);
            }
        }

    }
}
