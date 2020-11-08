package com.elingp.calculator_tdd_goacademy;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
  private static final double DELTA = 1e-15;

  @Test
  public void givenCalculatorShouldReturnZeroAsInitialValue() {
    Calculator classUnderTest = new Calculator();
    String result = classUnderTest.toString();
    assertEquals("0.0", result);
  }

  @Test
  public void givenCalculatorWhenCancelShouldReturnZero() {
    Calculator classUnderTest = new Calculator();
    double result = classUnderTest.cancel();
    assertEquals(0.0, result, DELTA);
  }

  @Test
  public void givenCalculatorWhenAddIntegerShouldReturnDouble() {
    Calculator classUnderTest = new Calculator();
    double result = classUnderTest.calculateAddition(10);
    assertEquals(10.0, result, DELTA);
  }

  @Test
  public void givenCalculatorWhenSubtractIntegerShouldReturnDouble() {
    Calculator classUnderTest = new Calculator();
    double result = classUnderTest.calculateSubtraction(10);
    assertEquals(-10.0, result, DELTA);
  }

  @Test
  public void givenCalculatorWhenMultiply2ShouldReturnDouble() {
    Calculator classUnderTest = new Calculator();
    classUnderTest.calculateAddition(2);
    double result = classUnderTest.calculateMultiplication(2);
    assertEquals(4.0, result, DELTA);
  }

  @Test
  public void givenCalculatorWhenDivideByNonZeroIntegerShouldReturnDouble() {
    Calculator classUnderTest = new Calculator();
    classUnderTest.calculateAddition(10);
    double result = classUnderTest.calculateDivision(5);
    assertEquals(2.0, result, DELTA);
  }
}
