package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount(); // default constructor
        account1.setInfo("Toghrul", 7777777);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(500);
        account1.checkBalance();

        BankAccount account2=new BankAccount(); // default constructor
        account2.setInfo("Vahida", 78787878);
        System.out.println(account2);

        account2.deposit(500);
        account2.checkBalance();
        account2.withdraw(200);
        account2.checkBalance();
    }
}
