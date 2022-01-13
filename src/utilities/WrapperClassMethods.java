package utilities;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str="123";   // convert to int

        int num = Integer.parseInt(str);  // int

        System.out.println(num+1);  // 123+1=124

        String str2="10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2+1);  // 10.5+1

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        String s1="maybe";  // if it is not true it will return false
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);
        System.out.println("-----------------------------------------");

        String s2="123";
        Integer x=Integer.valueOf(s2);
        int number = Integer.valueOf(s2);  //returns wrapper class
        System.out.println(x);
        System.out.println(number);

        String s3 ="1.5";
        Double z= Double.valueOf(s3);
        System.out.println(z);
        System.out.println("-----------------------------------------------");

        // isDigit()

        char ch1 ='0';

        boolean r2 = Character.isDigit(ch1);  // if ch1 is between 0 to 9 it returns true
        System.out.println(r2);

        char ch2='A';
        boolean r3=Character.isLetter(ch2);// if ch2 is letter it returns true

        System.out.println(r3);

        char ch3='&';
        boolean r4 =!Character.isLetterOrDigit(ch3);

        char r5 = Character.toUpperCase(ch2);
        System.out.println("r5: "+r5);

        String s ="ab1cde2efg3hi4";

        int sum=0;
        char[] ch = s.toCharArray();
       for (char each :ch){
           if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }

        System.out.println("sum: "+sum);
    }
}
