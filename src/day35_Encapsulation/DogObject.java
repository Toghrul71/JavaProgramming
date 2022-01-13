package day35_Encapsulation;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1=new Dog("German","White",'M','F',2);
        System.out.println(dog1);
        System.out.println(dog1.breed);

        Dog dog2=new Dog("Buldog","White", 'M','M',1);
        System.out.println(dog2);
        System.out.println(dog2.color);

        Dog[] dogs={dog1,dog2};

        for (Dog each:dogs){
            if(each.breed.equals("Buldog")){
                System.out.println(each);
            }
        }
    }
}
