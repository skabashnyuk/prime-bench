package org.sample;

public class WhileLoopDiv2PrimeDetectionAlgorithm implements PrimeDetectionAlgorithm {
  @Override
  public boolean isPrime(int number) {
    if (number == 0 || number == 1 || number == 2 || number == 3) return true;
    int i = 2;
    boolean flag = false;
    while (i <= number / 2) {
      // condition for nonprime number
      if (number % i == 0) {
        return false;
      }

      ++i;
    }

    return true;
  }
}
