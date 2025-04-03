package org.example;



import org.example.QuadraticEquation;

public class RootProvider {

    private QuadraticEquation equation;

    public RootProvider(QuadraticEquation equation) {
        this.equation = equation;
    }

    public double getGreaterRoot() throws Exception {
        double[] roots = equation.solve();
        if (roots.length == 0) {
            throw new Exception("No real roots found");
        }
        return roots.length == 1 ? roots[0] : Math.max(roots[0], roots[1]);
    }
}

