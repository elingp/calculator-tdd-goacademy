package com.elingp.calculator_tdd_goacademy;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
  @Test
  public void givenCalculatorShouldReturnZeroAsInitialValue() {
    Calculator classUnderTest = new Calculator();
    String result = classUnderTest.toString();
    assertEquals("0.0", result);
  }
}
