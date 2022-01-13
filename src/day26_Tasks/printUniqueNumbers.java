package day26_Tasks;

public class printUniqueNumbers {
    public static void main(String[] args) {

        printUniqueNumbers(new int[]{1,2,3,2,2});
    }

    public static void printUniqueNumbers(int[] nums){


        for (int i = 0; i < nums.length; i++) {
            int count=0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
                if ((count==1)){
                    System.out.println(nums[i]);
                }
            }

        }
    }

