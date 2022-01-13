package day36_Inheritance.Cripto;

public class CryptoToken {
    public double price, circulatingSupply;
    public int quantity, marketCap, volume;
    public boolean isMineable;

    public void setInfo(double price, double circulatingSupply, int quantity, int marketCap, int volume, boolean isMineable) {
        this.price = price;
        this.circulatingSupply = circulatingSupply;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.isMineable = isMineable;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", circulatingSupply=" + circulatingSupply +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", isMineable=" + isMineable +
                '}';
    }
    public double totalPrice(){
        double totalPrice=price*quantity;
        return totalPrice;
    }
}
