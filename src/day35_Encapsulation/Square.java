package day35_Encapsulation;

public class Square {
    private int side;  // instance because it differs for each square

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if(side<0){
            System.err.println("Invalid side: "+side);
            System.exit(0);
        }
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }

    public double calcArea(){ // which method is it called
        return side*side;  // this method returns double value
    }
    public double calcPerimeter(){
        return 4*side;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
