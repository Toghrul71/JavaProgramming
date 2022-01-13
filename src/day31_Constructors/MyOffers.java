package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setInfo("AB", "Google", "QA", 105000, true, true, true, true);

        Offer offer2=new Offer();
        offer2.setInfo("ON", "APPLE", "SDET", 98000, true, true, true, false);

        Offer offer3=new Offer();
        offer3.setInfo("BC", "IBM", "QA", 92000, true, false, true, true);

        Offer offer4=new Offer();
        offer4.setInfo("NS", "VOLVO", "QA", 140000, true, true, false, true);

        Offer offer5= new Offer();
        offer5.setInfo("FL", "TESLA", "QA", 145000, true, false, true, false);

        //System.out.println(offer1);
        //System.out.println(offer2);
        //System.out.println(offer3);
        //System.out.println(offer4);
        //System.out.println(offer5);

        Offer[] myOffers={offer1, offer2, offer3,offer4, offer5};

        ArrayList<Offer> fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime); // remove if offer is Not Fulltime (!exclanation mark)
        System.out.println(fullTimeOffers);
        System.out.println("------------------------");

        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("AB")); // removes offer that is not from "AB"
        System.out.println("Local offers: "+localOffers.size());  // to know how many offers suit to local call  .size()

        ArrayList<Offer> higherSalary=new ArrayList<>(Arrays.asList(myOffers));
        higherSalary.removeIf(p-> p.salary<100000);
        System.out.println("Offers higher than 100000: "+higherSalary.size());
        System.out.println("--------------");

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+" : "+localOffer.salary);
        }

    }

}
/*
String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolea
 */