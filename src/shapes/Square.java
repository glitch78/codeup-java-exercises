package shapes;


public class Square extends Quadrilateral {
    protected double length;
    protected double width;

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public Square(double length) {
        super(length, length);


    }



    @Override
    public double getArea(){
        return Math.pow(super.length, 2);
    }

    @Override
    public double getPerimeter(){
        return 4 * super.width;
    }
}