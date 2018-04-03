package ru.lesson.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());
    }
    @Test
    public void testDiv() throws Exception{
        Calculator calculator = new Calculator();
        calculator.div(1,1);
        assertEquals(1, calculator.getResult());
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        calculator.sub(1, 1);
        assertEquals(0, calculator.getResult());
    }
    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        calculator.pow(1, 1);
        assertEquals(1, calculator.getResult());
    }
    @Test
    public void testExp() {
        Calculator calculator = new Calculator();
        calculator.exp(1, 1);
        assertEquals(1, calculator.getResult());
    }
    @Test
    public void testCleanResult() {
        Calculator calculator = new Calculator();
        calculator.cleanResult();
        assertEquals(0, calculator.getResult());
    }
  /*  @Test(expected = UserException.class)
    public void divException() throws UserException, IllegalAccessException {
        Calculator calculator = new Calculator();
        calculator.div(1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void divRuntimeException() throws UserException, IllegalAccessException {
        Calculator calculator = new Calculator();
        calculator.div(1,0);
    }*/
}