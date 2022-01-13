package day35_Encapsulation;

public class iPhone {
    public static String brand, OS, madeIn, designedIn;
    public String model, color;
    public char size;
    public double price;
    public static boolean isSmartphone;


    public iPhone(String model, char size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    static {
        brand="Iphone";
        OS="IOS";
        madeIn="China";
        designedIn="California";
        isSmartphone=true;
    }
    public static void printOperatingSystem(){
        System.out.println("Operating system is: "+OS);
    }
    public void call(long phoneNumber){
        System.out.println(phoneNumber+" phone number is calling");
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber+" phone number is texting");
    }
    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+" is faceCalling");
    }
    public void faceTime(String email){
        System.out.println(email+" is faceTimig");
    }

    public String toString() {
        return "iPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", brand=" + brand +
                ", OS=" + OS +
                ", made in=" + madeIn +
                ", designed in=" + designedIn +
                ", isSmartphone=" + isSmartphone +
                '}';
    }
}
