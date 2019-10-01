package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input();
        Circle circle = new Circle(userInput.getDouble());
//        System.out.println(userInput.getDouble());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
