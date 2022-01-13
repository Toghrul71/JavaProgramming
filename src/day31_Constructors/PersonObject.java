package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonObject {
    public static void main(String[] args) {
        Person person1=new Person("Good", 'M', 35);
        System.out.println(person1);

        Person person2=new Person("Tony", 'M',36);
        System.out.println(person2);
        //Offer[] myOffers={offer1, offer2, offer3,offer4, offer5};
        Person[] persons={person1,person2};

        //ArrayList<Person> malesPersons=new ArrayList<>(Arrays.asList(persons));
        //ArrayList<Offer> fullrs=new ArrayList<>(Arrays.asList(myOffers));
    }
}
