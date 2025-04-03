package org.example;



public class LinearFunction implements Function {
    private double A, B;
    private double a, b;

    public LinearFunction(double A, double B, double a, double b) {
        this.A = A;
        this.B = B;
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return A * x + B;
    }

    @Override
    public double getLowerBound() {
        return a;
    }

    @Override
    public double getUpperBound() {
        return b;
    }
}

