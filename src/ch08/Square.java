package ch08;

import ch08.InterfaceBundle.Shape;

public class Square implements Shape {
    private double side;    // 정사각형의 변의 길이값

    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
