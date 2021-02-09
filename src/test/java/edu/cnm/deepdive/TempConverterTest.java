package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConverterTest {

  static final float TOLERANCE_THOUSANDTHS = .001f;
  static final float TOLERANCE_TEN_THOUSANDTHS = .0018f;
  static final float[] celsius = {-40, 0, 100};
  static final float[] fahrenheit = {-40, 32, 212};

  @Test
  void convertFToC() {
    for (int i = 0; i < celsius.length; i++){
      float expected = celsius[i];
      float actual = TempConverter.convertFToC(fahrenheit[i]);
      System.out.printf("Expected Celsius = %.3f; input fahrenheit =%.3f; actual celsius = %.3f%n;",
          expected, fahrenheit[i], actual);
      assertEquals(expected, actual, TOLERANCE_THOUSANDTHS);
    }
   }

  @Test
  void convertCToF() {
    for (int i = 0; i < fahrenheit.length; i++){
      float expected = fahrenheit[i];
      float actual = TempConverter.convertCToF(celsius[i]);
      System.out.printf("Input celsius =%.3f; Expected fahrenheit =%.3f; Actual fahrenheit =%.3f%n;",
          celsius[i], expected, actual);
      assertEquals(expected, actual, TOLERANCE_TEN_THOUSANDTHS);
    }
  }

}