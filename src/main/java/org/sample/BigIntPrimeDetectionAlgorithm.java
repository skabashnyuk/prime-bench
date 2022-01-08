package org.sample;

import java.math.BigInteger;

public class BigIntPrimeDetectionAlgorithm implements PrimeDetectionAlgorithm {
  @Override
  public boolean isPrime(int number) {
    BigInteger bigInt = BigInteger.valueOf(number);
    return bigInt.isProbablePrime(100);
  }
}
