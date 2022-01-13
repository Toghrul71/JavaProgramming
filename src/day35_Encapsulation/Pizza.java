package day35_Encapsulation;

public class Pizza {
    private int numberOfCheeseTopping, numberOfPepperoniTopping;
    private String size;

    public Pizza(int numberOfCheeseTopping, int numberOfPepperoniTopping, String size) {
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
        setSize(size);
    }

    public String getSize() {  // reads instance variables
        return size;
    }

    public void setSize(String size) {  // sets instance variables
        if(!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")||
                size.equalsIgnoreCase("large"))){
            System.err.println("Invalid pizza size: "+size);
            System.exit(0);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping<0 || numberOfCheeseTopping>3&&size.equalsIgnoreCase("small")|| numberOfCheeseTopping>4&&size.equalsIgnoreCase("medium")
        || numberOfCheeseTopping>5&&size.equalsIgnoreCase("large")){
            System.err.println("Invalid entry: "+numberOfCheeseTopping);
            System.exit(0);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping<0 || numberOfPepperoniTopping>4&&size.equalsIgnoreCase("small")|| numberOfPepperoniTopping>5&&size.equalsIgnoreCase("medium")
        ||numberOfPepperoniTopping>6&&size.equalsIgnoreCase("large")){
            System.err.println("Invalid entry: "+numberOfPepperoniTopping);
            System.exit(0);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calcCost(){
        double cost=(size.equalsIgnoreCase("small"))?10:(size.equalsIgnoreCase("medium"))?12:14;
        cost+=(numberOfCheeseTopping+numberOfPepperoniTopping)*2;
        return cost;
    }
        /*if(size.equalsIgnoreCase("small")){
            return 10+2*numberOfCheeseTopping*numberOfPepperoniTopping;
        }else if (size.equalsIgnoreCase("medium")){
            return 12+2*numberOfPepperoniTopping*numberOfCheeseTopping;
        }else {
            return 14+2*numberOfCheeseTopping*numberOfPepperoniTopping;
        }
    }*/

    public String toString() {
        return "Pizza{" +
                "numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", size='" + size +
                ", pizza cost='" + calcCost() + '\'' +
                '}';
    }
}

