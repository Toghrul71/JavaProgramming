package day32_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {

        Carpet carpet1=new Carpet(2,3,5,true);
        System.out.println(carpet1);

        Carpet carpet2=new Carpet(3,3,3,true);

        Carpet[] allCarpets={carpet1,carpet2};
        ArrayList<Carpet> persianCarpets=new ArrayList<>(Arrays.asList(allCarpets));
        persianCarpets.removeIf(p-> !p.isPersian);
        System.out.println(persianCarpets);
    }
}
