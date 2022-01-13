package day36_Inheritance.Phone;

public class iPhone extends PhoneParent {
    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+" is faceTiming");
    }
    public void faceTime(String email){
        System.out.println(email+" is face timing");
    }
}
