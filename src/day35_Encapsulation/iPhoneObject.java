package day35_Encapsulation;

import java.util.Arrays;

public class iPhoneObject {
    public static void main(String[] args) {
        iPhone iPhone1=new iPhone("12",'L',"Black",1500);
        System.out.println(iPhone1);
        System.out.println(iPhone1.price);
        iPhone1.call(153466664);

        iPhone iPhone2=new iPhone("11",'L',"White",1300);
        System.out.println(iPhone2);
        System.out.println("price is: "+iPhone2.price);
        iPhone2.call(465464665);

        iPhone[] iphones={iPhone1,iPhone1};
        System.out.println(Arrays.toString(iphones));
    }
}
