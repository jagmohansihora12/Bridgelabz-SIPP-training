package javaObjectClass;

public class areaOfCircle {
    private double radius;

    public areaOfCircle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayResults() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        areaOfCircle circle = new areaOfCircle(5.0);
        circle.displayResults();
    }
}
