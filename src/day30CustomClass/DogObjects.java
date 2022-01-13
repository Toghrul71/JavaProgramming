package day30CustomClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {
        dog dog1=new dog();

        dog1.name="Lusy";
        dog1.age=3;
        dog1.breed="Husky";
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="White";

        dog dog2=new dog();
        dog2.name="Luy";
        dog2.age=3;
        dog2.breed="Huy";
        dog2.gender='F';
        dog2.size="Small";
        dog2.color="White";

        dog dog3=new dog();
        dog3.setInfo("Jack", "German Shepard", 2,'M',"Small", "White");

        dog dog4=new dog();
        dog4.setInfo("Bullet","Ger", 2, 'M', "Medium", "Black");

        dog dog5=new dog();
        dog5.setInfo("Ulet","Rex", 2, 'F', "Medium", "Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog[] dogs={dog1,dog2,dog3,dog4,dog5};

        ArrayList<dog> femaleDogs= new ArrayList<>();
        ArrayList<dog>maleDogs=new ArrayList<>();

        int count=0;

        for (dog each:femaleDogs){

        }
        femaleDogs.removeIf(p-> p.equals('M'));
        System.out.println(femaleDogs);

        dog1.eat();
        dog2.bark();
        dog3.eat();

    }
}
