abstract class Shape {
    abstract double rectangleArea(double length, double breadth);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Area extends Shape {
    @Override
    double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    double squareArea(double side) {
        return side * side;
    }

    @Override
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Area area = new Area();

        // Calculate and print area of rectangle
        double rectangleArea = area.rectangleArea(5, 10);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculate and print area of square
        double squareArea = area.squareArea(5);
        System.out.println("Area of square: " + squareArea);

        // Calculate and print area of circle
        double circleArea = area.circleArea(5);
        System.out.println("Area of circle: " + circleArea);
    }
}
