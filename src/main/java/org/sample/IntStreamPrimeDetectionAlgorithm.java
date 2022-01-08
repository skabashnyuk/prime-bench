package org.sample;

import java.util.stream.IntStream;

public class IntStreamPrimeDetectionAlgorithm implements PrimeDetectionAlgorithm {
  @Override
  public boolean isPrime(int number) {
    return number > 1
        && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(n -> (number % n == 0));
  }
}
