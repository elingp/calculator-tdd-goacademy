package com.elingp.calculator_tdd_goacademy;

public class Calculator {
  private double calculationResult = 0.0;

  public double calculateAddition(int adder) {
    this.calculationResult += adder;
    return this.calculationResult;
  }

  public double cancel() {
    this.calculationResult = 0.0;
    return this.calculationResult;
  }

  @Override
  public String toString() {
    return String.valueOf(this.calculationResult);
  }
}
