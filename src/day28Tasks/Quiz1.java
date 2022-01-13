package day28Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        /*String s= "the game was tied at 2-2";
        String s2=s.substring(5);

        int index1= s.indexOf("game");
        int index2=s2.indexOf("game");

        if(index1==index2){
            System.out.println(index1);
        }else {
            System.out.println(index2);
        }
        /*
        String z="popcorn";
z=z.substring(1,8);
if(z.equals("opcor")){
    System.out.println(z.length());
}else {
    System.out.println(z.replace("o,","a"));
}
*/
/*String a="today I will go to the beach";
boolean b= a.contains("i");
boolean c=a.substring(12).startsWith("go");

String result = b&&c ? "go" : "dont go";

        System.out.println(result);

        int number = 5;
        while ((number<100)){
            number+=number;
        }
        System.out.println(number);

        Scanner input = new Scanner(System.in);

        int num1 =input.nextInt();
        int num2 =input.nextInt();
        int iterate= input.nextInt();

        int total = 0;

        for (int j = 0; j < iterate; j++) {
            if(j%3==0)continue;

        total+=num1+num2;

        }
        System.out.println(total);

        int[] nums = new int[5];
        int a3= 5;

        nums[2]=a3--;
        nums[0]=a3*2;
        nums[4]=--a3+(a3-9);
        nums[1]=nums[2];
        nums[3]=nums[a3-3];
        System.out.println(Arrays.toString(nums));

        double[] doub=new double[4];
        doub[0]=1.0;
        doub[2]=42.1;
        doub=new double[4];
        doub[1]=17.2;
        doub[3]=doub.length;

        System.out.println(Arrays.toString(doub));

        String [] strs= {"display", "population", "meeting", "copy", "franchise"};
        int a = strs.length;
        int b = strs[5].length();

        System.out.println(a+" "+b);

        byte[] by= new byte[5];

        for (int j = 0; j < by.length; j++) {
            by[j]=(byte)(by[j]*2);

            
        }
        System.out.println(by);
        }

 */


        String [] things = {"house", "shed", "slide", "zebra", " park", "garden"};
        for (String s:things){
            switch (s.charAt(1)){
                case 'h':
                    System.out.println(1);
                    break;
                case 'a':
                    System.out.println(2);
                case 's':
                    System.out.println(3);
                    break;
                case 'o':
                default:
                    System.out.println(4);
                case 'p':
                    System.out.println(5);
                    break;
                case 'z':
                    System.out.println(6);
                case 'l':
                    break;
                case 'g':
                    System.out.println(7);
            }
        }
    }

}