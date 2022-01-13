package December19Replits;

import java.util.Scanner;

public class profitOrLoss {
    public static void main(String[] args) {

        String value = profits(200,20);
        System.out.println(value);
    }

    public static String profits(int buyPrice, int sellPrice){
        String value="";
        if((sellPrice-buyPrice)>0){
            value ="profit";
        }else if((sellPrice-buyPrice)<0){
            value="loss";
        }else {
            value="no loss";
        }
        return value;
    }
}
