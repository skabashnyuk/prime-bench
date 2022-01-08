package org.sample;

public class ForLoopDiv2WithPreconditionPrimeDetectionAlgorithm implements PrimeDetectionAlgorithm {
  @Override
  public boolean isPrime(int number) {
    long i, m = 0, flag = 0;
    m = number / 2;
    if (number == 0 || number == 1 || number == 2) {
      return true;
    } else {
      for (i = 2; i <= m; i++) {
        if (number % i == 0) {
          return false;
        }
      }
    }
    return true;
  }
}
