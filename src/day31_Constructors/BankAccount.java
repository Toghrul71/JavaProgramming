package day31_Constructors;

public class BankAccount {
    public String accountHolderName;  // called instance variables
    public long accountNumber;       // called instance variables
    public double accountBalance;   // called instance variables

    // action 1 // set info set arguments to instance variables above
    public void setInfo(String accountHolderName, long accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;

        }
    // action 2  // to String to print all info
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+accountBalance);
    }
    public void deposit(double amount){  // in order to deposit a money to balance there should be variable amount
        if(amount<=0){
            System.err.println("Depositing amount can't be 0 or negative");
            return;  // exits if amount<=0;
        }
        accountBalance+=amount;
    }

    public void withdraw(double amount){
        if(amount> accountBalance){
            System.err.println("Insufficient balance");
            return; // exit the function
        }
        if(amount<=0){
            System.err.println("Withdrawal can't be negative or zero");
            return; // exit the function
        }
        accountBalance-=amount;
    }
}

/*
BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber, 3. balance

        Actions:
            1. setInfo(): sets the accountHolder and accountNumber attributes
            2. toString()
                3. checkBalance():displays the available balance
                2. deposit(): increases the balance by the given amount
        3. withdraw(): decreases the balance by the given amount
 */