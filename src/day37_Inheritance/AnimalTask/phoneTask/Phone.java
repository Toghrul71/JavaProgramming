package day37_Inheritance.AnimalTask.phoneTask;

public class Phone { // it is called parent class
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;
    public  static boolean hasBattery=true;

    public Phone(String brand, String model, String size, double price, String color) { // this step is mandatory for all subclasses
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$ " + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }

}
