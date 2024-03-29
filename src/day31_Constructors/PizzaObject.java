package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObject {
    public static void main(String[] args) {
        Pizza pizza1=new Pizza('M', 1,2);

        ArrayList<Pizza> pizzas=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza=new Pizza('S',2,3);
            Pizza mediumPizza=new Pizza('M',3,4);
            Pizza largePizza=new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }
        System.out.println("Total number of pizzas: "+pizzas.size());
        double totalPrice=0;

        for (Pizza pizza : pizzas) {
           totalPrice+= pizza.calcCost();
        }
        System.out.println("Total price: "+totalPrice);
    }
}

// create 100 pizza objects: size- 'S', cheese topping-2, pepperoni topping-3
// create 100 Pizza objects: szie- 'M', cheese topping-3, pepperoni topping-4
// create 100 Pizza objects: szie- 'L', cheese topping-4, pepperoni topping-5

