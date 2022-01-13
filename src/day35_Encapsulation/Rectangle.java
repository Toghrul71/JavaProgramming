package day35_Encapsulation;

public class Rectangle {
    private double width, length;  // private variable

    public double getWidth() {  // reads the variable
        return width;
    }

    public void setWidth(double width) { // sets the variable a value
        if(width<0){ // condition
            System.err.println("Invalid entry: "+width);
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {  // reads variable
        return length;
    }

    public void setLength(double length) {  // it sets variable
        if(length<0){
            System.err.println("Invalid entry: "+length);
            System.exit(0);
        }
        this.length = length;
    }
}
