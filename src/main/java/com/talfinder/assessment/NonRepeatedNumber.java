package com.talfinder.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hbhargav on 22/02/19.
 */
public class NonRepeatedNumber {

  public static List<Integer> getNonRepeatedNumber(List<Integer> numbers) {
    return numbers;
  }

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2));
    List<Integer> nonRepeatedNumbers = getNonRepeatedNumber(numbers);
    nonRepeatedNumbers.forEach(number -> System.out.println(number));
  }
}
