package ch08;

import ch08.InterfaceBundle.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; //(속도를 빨리 하려고 3.141592 이런식으로 넣는 경우도 있음.
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
