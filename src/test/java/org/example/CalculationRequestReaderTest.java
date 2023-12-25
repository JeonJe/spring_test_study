package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationRequestReaderTest {

    @Test
    public void System_in_으로_데이터를_읽을수있다() {
        //given
        CalculationRequestReader calculationRequestReader = new CalculationRequestReader();

        //when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        CalculationRequest result = calculationRequestReader.read();

        //then
        assertEquals(2, result.getNum1());
        assertEquals("+", result.getOperation());
        assertEquals(3, result.getNum2());
    }
}