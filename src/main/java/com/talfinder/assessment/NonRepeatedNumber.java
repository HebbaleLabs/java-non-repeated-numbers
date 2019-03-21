package com.talfinder.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hbhargav on 22/02/19.
 */
public class NonRepeatedNumber {

  public static List<Integer> getNonRepeatedNumber(List<Integer> numbers) { 
    /*
     * NOTE:
     * 1. Write your solution within this method
     * 2. Do not make changes to the Class Name, Method Name or Method Signature
     * 3. Use the Run-Java command to run main method
     * 4. Use the BuildAndRunTests command to evaluate your solution
     */
    List<Integer> output = null;
    return output;
  }

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2));
    List<Integer> nonRepeatedNumbers = getNonRepeatedNumber(numbers);
    nonRepeatedNumbers.forEach(number -> System.out.println(number));
  }
}
