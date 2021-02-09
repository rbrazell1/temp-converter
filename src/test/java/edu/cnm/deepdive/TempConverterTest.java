package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConverterTest {

  static final float TOLERANCE_THOUSANDTHS = .001f;
  static final float TOLERANCE_TEN_THOUSANDTHS = .0018f;
  static final float[][] testCases = {
      // {celsius, fahrenheit}
      {-40, -40},
      {0, 32},
      {100, 212},
  };

  @Test
  void convertFToC() {
    for (float [] testCase : testCases){
      float expected = testCase[0];
      float input = testCase[1];
      float actual = TempConverter.convertFToC(input);
      System.out.printf("Expected Celsius = %.3f; input fahrenheit =%.3f; actual celsius = %.3f%n;",
          expected, testCase[1], actual);
      assertEquals(expected, actual, TOLERANCE_THOUSANDTHS);
    }
   }

  @Test
  void convertCToF() {
    for (float [] testCase : testCases){
      float expected = testCase[1];
      float input = testCase[0];
      float actual = TempConverter.convertCToF(input);
      System.out.printf("Expected Celsius = %.3f; input fahrenheit =%.3f; actual celsius = %.3f%n;",
          expected, testCase[0], actual);
      assertEquals(expected, actual, TOLERANCE_TEN_THOUSANDTHS);
    }
  }