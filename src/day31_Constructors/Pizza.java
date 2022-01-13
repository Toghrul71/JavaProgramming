package day31_Constructors;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice=$" + calcCost() +
                '}';
    }
    public double calcCost(){
        double startingPrice=(size=='S')? 10: (size=='M')? 20: 14;
        double totalPrice=startingPrice+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
       return totalPrice;
        }

    }


