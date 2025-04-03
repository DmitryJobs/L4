package org.example;


import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation {

    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] solve() {
        double discriminant = b * b - 4 * a * c;
        List<Double> roots = new ArrayList<>();

        if (discriminant > 0) {
            roots.add((-b + Math.sqrt(discriminant)) / (2 * a));
            roots.add((-b - Math.sqrt(discriminant)) / (2 * a));
        } else if (discriminant == 0) {
            roots.add(-b / (2 * a));
        }

        return roots.stream().mapToDouble(d -> d).toArray(); // Convert list to array
    }
}
