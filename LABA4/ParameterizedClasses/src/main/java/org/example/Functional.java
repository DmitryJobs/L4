package org.example;

public interface Functional<T extends Function> {
    double calculate(T function);  // Метод вычисления функционала
}

