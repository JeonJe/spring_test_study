package org.example;

import java.util.Scanner;

public class CalculationRequestReader {

    public CalculationRequest read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers and an opertator (ex 1 + 2 ) :");
        String result = scanner.nextLine();
        String[] parts =  result.split(" ");
        return new CalculationRequest(parts);
    }
}
