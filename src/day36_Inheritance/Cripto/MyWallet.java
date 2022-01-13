package day36_Inheritance.Cripto;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin bitcoin=new Bitcoin();
        bitcoin.setInfo(20,3000,50,45,70,true);
        System.out.println(bitcoin);
        System.out.println(bitcoin.totalPrice());
    }
}
