package day36_Inheritance.Phone;

public class PhoneParent {
    public String brand, model;
    public char size;
    public int price;
    public String color;

    public void setInfo(String brand, String model, char size, int price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public void call(long phoneNumber){
        System.out.println(brand+" calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" calling "+ phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
