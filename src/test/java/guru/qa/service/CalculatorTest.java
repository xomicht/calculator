package guru.qa.service;

import guru.qa.service.impl.StringWriter;
import guru.qa.service.mock.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculatorMultTest() {
        calculator = new Calculator(new MockMultReader(), new StringWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void calculatorSumTest() {
        calculator = new Calculator(new MockSumReader(), new StringWriter()); // 3, 5, +
        String result = calculator.start();
        Assertions.assertEquals("3 + 5 = 8", result);
    }

    @Test
    void calculatorDivTest() {
        calculator = new Calculator(new MockDivReader(), new StringWriter()); // 10, 2, /
        String result = calculator.start();
        Assertions.assertEquals("10 / 2 = 5", result);
    }

    @Test
    void calculatorMinusTest() {
        calculator = new Calculator(new MockMinusReader(), new StringWriter()); // 10, 2, -
        String result = calculator.start();
        Assertions.assertEquals("10 - 2 = 8", result);
    }

    @Test
    void calculatorPowTest() {
        calculator = new Calculator(new MockPowReader(), new StringWriter()); // 2, 3, ^
        String result = calculator.start();
        Assertions.assertEquals("2 ^ 3 = 8", result);
    }
}
