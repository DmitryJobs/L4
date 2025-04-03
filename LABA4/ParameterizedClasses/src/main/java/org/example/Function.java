package org.example;


public interface Function {
    double calculate(double x);  // Метод вычисления для заданного x

    double getLowerBound();  // Метод для получения нижней границы

    double getUpperBound();  // Метод для получения верхней границы
}

