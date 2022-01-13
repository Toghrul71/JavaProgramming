package day30CustomClass;

public class car {
    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;

    public void setInfo(String brandName, String modelName, String colorName, int yearInfo, int priceInfo ){
        brand=brandName;
        model=modelName;
        color=colorName;
        year=yearInfo;
        price=priceInfo;
    }

    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
    public void drive(){
        System.out.println(brand+" drives");
    }
    public void start(){
        System.out.println(brand+" starts");
    }
    public void stop(){
        System.out.println(brand+" stops");
    }




}


/*
Attributes:
brand, model, color, year, price

Actions:
drive(), start(), stop()... toString(),  SetInfo
 */