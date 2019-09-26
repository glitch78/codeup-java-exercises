package Shapes;

import Util.Input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input();
        Circle circle = new Circle(userInput.getDouble());
//        System.out.println(userInput.getDouble());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
