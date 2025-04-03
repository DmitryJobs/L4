package org.example;

public class SumFunctional implements Functional<Function> {
    @Override
    public double calculate(Function function) {
        double a = function.getLowerBound();
        double b = function.getUpperBound();
        double middle = (a + b) / 2;
        return function.calculate(a) + function.calculate(b) + function.calculate(middle);
    }
}
