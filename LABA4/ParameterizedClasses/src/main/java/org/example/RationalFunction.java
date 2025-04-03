package org.example;

public class RationalFunction implements Function {
    private double A, B, C, D;
    private double a, b;

    public RationalFunction(double A, double B, double C, double D, double a, double b) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return (A * x + B) / (C * x + D);
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
