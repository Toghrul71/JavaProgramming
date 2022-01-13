package day30CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        car car1=new car();
        car1.setInfo("Lada","2107", "White", 2005, 5000);


        car car2=new car();
        car2.setInfo("Toyota", "Corolla", "Silver", 2005, 10000);

        System.out.println(car1);
        System.out.println(car2);

       car1.drive();
       car2.start();

        ArrayList<car>carslist=new ArrayList<>();
        carslist.addAll(Arrays.asList(car1,car2));

        for (car each:carslist){
            System.out.println(each.brand+" : "+each.price);
        }
        System.out.println("=-------------------------");

        carslist.removeIf(p-> p.brand.equals("Toyota") && p.year>=2005 && p.year<=2008);
            carslist.removeIf(p-> p.equals("BMW") && p.year>=2003 && p.year<=2010);
        System.out.println(carslist);


        }
    }

