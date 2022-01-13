package December22Replit;

public class printUniqueWords {
    public static void main(String[] args) {

    }

    public static void printUniqueWords(String[] words) {

        for (String outerEach:words){
            int count=0;
            for (String innerEach:words){

                if(outerEach.equals(innerEach)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(outerEach);
            }
        }

    }




}
