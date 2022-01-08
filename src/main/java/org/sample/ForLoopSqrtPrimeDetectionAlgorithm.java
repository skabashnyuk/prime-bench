package org.sample;

public class ForLoopSqrtPrimeDetectionAlgorithm implements PrimeDetectionAlgorithm {
  @Override
  public boolean isPrime(int number) {
    if (number == 0 || number == 1 || number == 2) return true;

    int sqrt = (int) Math.sqrt(number) + 1;
    for (int i = 2; i < sqrt; i++) {
      if (number % i == 0) {

        return false;
      }
    }
    return true;
  }
}
