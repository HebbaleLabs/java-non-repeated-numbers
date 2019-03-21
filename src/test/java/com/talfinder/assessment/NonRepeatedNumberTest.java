package com.talfinder.assessment;

import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Created by hbhargav on 22/02/19.
 */
@RunWith(Parameterized.class)
public class NonRepeatedNumberTest {

  @Parameters
  public static Collection<Object[]> parameters() {
    return Arrays.asList(new Object[][] {
        {new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 1, 3)), new ArrayList<>(Arrays.asList(4))},
        {new ArrayList<>(Arrays.asList(10, 2, 22, 3, 1, 43, 10, 35)), new ArrayList<>(Arrays.asList(2, 22, 3, 1, 43, 35))},
        {new ArrayList<>(Arrays.asList(1, 1)), new ArrayList<>()},
        {new ArrayList<>(Arrays.asList(108, 652, 22, 899, 5430, 652, 22, 108, 899, 5430)), new ArrayList<>()},
        {new ArrayList<>(), new ArrayList<>()},
        {new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)), new ArrayList<>()}
    });
  }

  List<Integer> numbers;
  List<Integer> expectedValue;

  public NonRepeatedNumberTest(List<Integer> numbers, List<Integer> expectedValue) {
    this.numbers = numbers;
    this.expectedValue = expectedValue;
  }

  @Test
  public void filterListWithRepeatedNumber() {
    Assert.assertEquals("input:" + numbers.toString(), expectedValue, NonRepeatedNumber.getNonRepeatedNumber(numbers));
  }
}
