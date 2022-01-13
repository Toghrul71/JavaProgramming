package December18_Replits;

public class countAppearance {

        public static void main(String[] args) {
            int c = countApearance(new String[]{"a","foo","bar","foo","bla"}, "foo");
            System.out.println(c);

        }

        public static int countApearance(String[] arr, String t){

            int count =0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i].equals(t)){
                    count++;
                }
            }
            return count;
        }
    }


