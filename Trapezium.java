package org.example.abstraction_1;


class Trapezium extends GeometricFigure {
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double a, double b, double h) {
        sideA = a;
        sideB = b;
        high = h;
    }

    @Override
    public double area() {
        // Trapetsiya yuzini hisoblash
        return (sideA + sideB) * high / 2;
    }

    @Override
    public double perimeter() {
        // Trapetsiya perimetri
        return sideA + sideB + 2 * Math.sqrt(Math.pow((sideB - sideA) / 2, 2) + Math.pow(high, 2));
    }
}
