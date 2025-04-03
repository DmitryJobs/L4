package org.example;

public class IntegralFunctional implements Functional<Function> {
    @Override
    public double calculate(Function function) {
        double a = function.getLowerBound();
        double b = function.getUpperBound();
        int n = 100000;  //  разбиения
        double h = (b - a) / n;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double x = a + i * h;
            sum += function.calculate(x) * h;
        }

        return sum;
    }
}
