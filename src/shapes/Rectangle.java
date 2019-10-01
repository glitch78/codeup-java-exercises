package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
//    protected double width;
//    protected double length;
//
//    public Rectangle(double width, double length) {
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea(){
//        return this.length * this.width;
//    }
// Method for perimeter
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
//
//   public double getWidth() {
//       return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
}
