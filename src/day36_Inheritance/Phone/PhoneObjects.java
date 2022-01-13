package day36_Inheritance.Phone;

public class PhoneObjects {
    public static void main(String[] args) {
       iPhone iPhone=new iPhone();
       iPhone.setInfo("Iphone","11",'M',1300, "White");
        System.out.println(iPhone.brand);

        Samsung samsung=new Samsung();
        samsung.setInfo("Samsung","Galaxy", 'M',1500,"White");
        System.out.println(samsung);
        samsung.freeze();
    }

}
