package day26_Tasks;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = ""; //
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;  // item 1, item 2, item 3
        double totalPrice = 0;

        do { // at least gets executed once, in any case at least 1 time
            System.out.println("Enter Item" + count + " and its price:");
            item=input.next();
            price=input.nextDouble();

            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", "; //
            totalPrice += price; // it gives us total of all prices;
            count++;

            System.out.println("Add one more item?");
            countinue = scan.next();

        }while(countinue.equalsIgnoreCase("yes")&& count<=10); // then it checks this condition


        if(countinue.equalsIgnoreCase("no") || count>10){
            System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
            System.out.println("Total price: "+totalPrice);
        }
    }
}

//Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
//output: Total price: 15.3

//In this assignment, you will write a program that will generate a shopping list.
// It's more advanced version of assignment Shopping list I.
//Your program should ask use to enter items followed by its price.

// After adding item, ask user if he wants to add one more item.

// If yes, repeat previous steps again. If no, print shopping list report and total price as show in examples.

// in 2 cases 1. Answer is No 2. if it reached 10 times it should print shopping list report

// Your program should accept up to 10 items.
//Hint: use do while loop.

//Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
//output: Total price: 15.3