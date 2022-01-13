package day33Replits;

import java.util.ArrayList;
import java.util.Scanner;

public class deliveryCalc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }
    public static int refuel_times(ArrayList<Integer> deliveries, int maxFuel){
        int sum =0;
        int result=0;
        for (Integer eachNumber:deliveries){
            sum+=eachNumber;
            }
        if(sum%maxFuel==0){
           result= sum/maxFuel;
        }else {
            result=sum/maxFuel+1;
        }
        return result;

    }

}
