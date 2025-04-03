package org.example;

public class SinusoidalFunction implements Function {
    private double A, B;
    private double a, b;

    public SinusoidalFunction(double A, double B, double a, double b) {
        this.A = A;
        this.B = B;
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return A * Math.sin(B * x);
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
