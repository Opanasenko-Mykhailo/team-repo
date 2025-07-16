package com.team.calc.service;

public class CalcService {

    public double divide(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return numerator / denominator;
    }

    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiply(Integer a, Integer b){
        return a * b;
    }
}
