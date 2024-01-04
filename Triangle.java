package org.example.abstraction_1;


class Triangle extends GeometricFigure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    @Override
    public double area() {
        // Uchburchakning yuzini hisoblash
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        // Uchburchakning perimetri
        return sideA + sideB + sideC;
    }
}
