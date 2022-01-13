package day32_Constructors;

public class Carpet {  // class name should be same as constructor name
    public double width, length, unitPrice;
    public boolean isPersian;
                        // 5.5          7.5             20
    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        // class name(Carpet) should be same as constructor name
        this.width = width;     // to assign argument to instance variable
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price=" + calcCost() +
                '}';
    }

    public double calcCost(){
        double totalPrice=0;
        totalPrice=(isPersian)? width*length*unitPrice+200 : width*length*unitPrice;

        return totalPrice;
    }
}
