package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConverterTest {

  static final float TOLERANCE_THOUSANDTHS = .001f;
  static final float TOLERANCE_TEN_THOUSANDTHS = .0018f;

  @Test
  void convertFToC() {
    assertEquals(100, TempConverter.convertFToC(212), TOLERANCE_THOUSANDTHS);
    assertEquals(-40, TempConverter.convertFToC(-40), TOLERANCE_THOUSANDTHS);
    assertEquals(0, TempConverter.convertFToC(32), TOLERANCE_THOUSANDTHS);

  }

  @Test
  void convertCToF() {

    assertEquals(212, TempConverter.convertCToF(100), TOLERANCE_TEN_THOUSANDTHS);
    assertEquals( 32, TempConverter.convertCToF(0), TOLERANCE_TEN_THOUSANDTHS);
    assertEquals(-40, TempConverter.convertCToF(-40), TOLERANCE_TEN_THOUSANDTHS);

  }

}