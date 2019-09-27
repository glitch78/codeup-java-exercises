package Shapes;

public class Rectangle {


    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }
// Method to get the area
    public double getArea(){
        return this.length * this.width;
    }
// Method for perimeter
    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
