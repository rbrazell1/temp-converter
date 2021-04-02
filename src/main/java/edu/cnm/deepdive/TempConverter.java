package edu.cnm.deepdive;

/**
 * Simple class to demonstrate reading properties and iterating over arguments
 */

public class TempConverter {

   public static void main(String[] args) {
     
     String mode = System.getProperty("mode");

     for (String arg : args) {

       if (mode != null && mode.equals("c2f")) {
         double tempC = Double.parseDouble(arg);
         System.out.println(convertCToF(tempC));
       } else {
         double tempF = Double.parseDouble(arg);
         System.out.println(convertFToC(tempF));
       }
     }
    }

/**
 * convert tempF (Fahrenheit) to a Celsius value
 * @param tempF temperature in Fahrenheit degrees
 * @return Temperature in Celsius degrees
 */
  public static double convertFToC(double tempF) {
    return (tempF - 32) * 5/9;
  } 

  public static double convertCToF(double tempC) {
    return tempC * 9 /5 + 32;
  }

  public static double convertKToC(double tempK) {
    return tempK - 273.15;
  }

}