package org.example.abstraction_1;


class Rectangle extends GeometricFigure {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        sideA = a;
        sideB = b;
    }

    @Override
    public double area() {
        // To'g'ri to'rtburchakning yuzini hisoblash
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        // To'g'ri to'rtburchakning perimetri
        return 2 * (sideA + sideB);
    }
}
