package Lesson_16;

public class ResizableRectangle implements Resizable {

    private double rectangleArea;

    public ResizableRectangle(double rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

    public double getRectangleArea() {
        return rectangleArea;
    }

    public void setRectangleArea(double rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

    @Override
    public void resize() {
        rectangleArea *= 4;
        System.out.print("Area of rectangle has changed. The new area is = " + rectangleArea);
    }
}
