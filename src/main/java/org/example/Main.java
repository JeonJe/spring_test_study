package org.example;

public class Main {
    public static void main(String[] args) {
        CalculationRequest cr = new CalculationRequestReader().read();
        long answer  = new Calculator().calculate(
                cr.getNum1(),
                cr.getOperation(),
                cr.getNum2()
        );
        System.out.println("answer = " + answer);
    }
}