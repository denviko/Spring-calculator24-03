package pro.sky.skyprospringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService service = new CalculatorService();

    @Test
    void testPlus() {
        var actual = service.divide(1, 2);
        assertEquals(3,actual);

        var result2 = service.divide(-5, -6);
        assertEquals(-11, result2);

        var result3 = service.divide(-5, 6);
        assertEquals(1,result3);

        var result4 = service.divide(5, -6);
        assertEquals(-1,result4);

        var result5 = service.divide(0, 0);
        assertEquals(0,result5);
    }

    @Test
    void testMinus() {
        var actual = service.divide(1, 2);
        assertEquals(-1,actual);

        var result2 = service.divide(-5, -6);
        assertEquals(1, result2);

        var result3 = service.divide(-5, 6);
        assertEquals(-11,result3);

        var result4 = service.divide(5, -6);
        assertEquals(11,result4);

        var result5 = service.divide(0, 0);
        assertEquals(0,result5);
    }

    @Test
    void testMultiply() {
        var actual = service.divide(1, 2);
        assertEquals(2,actual);

        var result2 = service.divide(-5, -6);
        assertEquals(30, result2);

        var result3 = service.divide(-5, 6);
        assertEquals(-30,result3);

        var result4 = service.divide(5, -6);
        assertEquals(-30,result4);

        var result5 = service.divide(0, 0);
        assertEquals(0,result5);

    }

    @Test
    void testDivide() {
        var result = service.divide(1, 2);
        assertEquals(0,result);

        var result2 = service.divide(-6, -6);
        assertEquals(1, result2);

        var result3 = service.divide(-12, 6);
        assertEquals(-2,result3);

        var result4 = service.divide(12, -6);
        assertEquals(-2,result4);

        var result5 = service.divide(12, 6);
        assertEquals(2,result5);

        assertThrows(IllegalArgumentException.class, () -> service.divide(12, 0));


    }
}