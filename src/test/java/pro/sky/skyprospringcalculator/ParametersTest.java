package pro.sky.skyprospringcalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametersTest {
    CalculatorService service = new CalculatorService();
    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(-5,-6),
                Arguments.of(-5,6),
                Arguments.of(5,-6));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void TestPlus(int num1,int num2) {
        var actual = service.plus(num1, num2);
        var expected = num1 + num2;
        assertEquals(expected, actual);


    }
    @ParameterizedTest
    @MethodSource("parameters")
    void TestMinus(int num1,int num2) {
        var actual = service.minus(num1, num2);
        var expected = num1 - num2;
        assertEquals(expected, actual);


    }
    @ParameterizedTest
    @MethodSource("parameters")
    void TestMultiply(int num1,int num2) {
        var actual = service.multiply(num1, num2);
        var expected = num1 * num2;
        assertEquals(expected, actual);


    }
    @ParameterizedTest
    @MethodSource("parameters")
    void TestDivide(int num1,int num2) {
        var actual = service.divide(num1, num2);
        var expected = num1 / num2;
        assertEquals(expected, actual);


    }
}
