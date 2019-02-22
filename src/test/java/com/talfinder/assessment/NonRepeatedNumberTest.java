package com.talfinder.assessment;

import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hbhargav on 22/02/19.
 */
public class NonRepeatedNumberTest {
  private NonRepeatedNumber nonRepeatedNumber = new NonRepeatedNumber();

  @Test
  public void filterListWithRepeatedNumber() {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 1, 3));
    List<Integer> actual = nonRepeatedNumber.getNonRepeatedNumber(numbers);
    Assert.assertThat(actual.size(), is(1));

    numbers = new ArrayList<>(Arrays.asList(10, 2, 22, 3, 1, 43, 10, 35));
    actual = nonRepeatedNumber.getNonRepeatedNumber(numbers);
    Assert.assertThat(actual.size(), is(6));
  }

  @Test
  public void filterListWithNoRepeatedNumber() {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    List<Integer> actual = nonRepeatedNumber.getNonRepeatedNumber(numbers);
    Assert.assertThat(actual.size(), is(8));

    numbers = new ArrayList<>(Arrays.asList(108, 652, 22, 3897, 112345, 43, 140, 35, 899, 5430));
    actual = nonRepeatedNumber.getNonRepeatedNumber(numbers);
    Assert.assertThat(actual.size(), is(10));
  }

  @Test
  public void filterEmptyList() {
    List<Integer> numbers = new ArrayList<>();
    List<Integer> actual = nonRepeatedNumber.getNonRepeatedNumber(numbers);
    Assert.assertThat(actual.size(), is(0));
  }
}
