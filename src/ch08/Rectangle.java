package ch08;

import ch08.InterfaceBundle.Drawable;
import ch08.InterfaceBundle.Shape;

public class Rectangle implements Shape, Drawable {
    public double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width * height);
    }
    @Override
    public void drawLines() {

    }
}
