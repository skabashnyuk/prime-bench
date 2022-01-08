package org.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimeDetectionAlgorithmTest {
  private final List<PrimeDetectionAlgorithm> primeDetectionAlgorithms = new ArrayList<>();
  private final Integer[] primes =
      new Integer[] {
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
        97, 101, 179423929, 179424667, 179424671, 179424673
      };

  @BeforeSuite
  public void setup() {
    primeDetectionAlgorithms.add(new CommonNumbersPrimeDetectionAlgorithm());
    primeDetectionAlgorithms.add(new BigIntPrimeDetectionAlgorithm());
    primeDetectionAlgorithms.add(new IntStreamPrimeDetectionAlgorithm());
    primeDetectionAlgorithms.add(new ForLoopDiv2PrimeDetectionAlgorithm());
    primeDetectionAlgorithms.add(new WhileLoopDiv2PrimeDetectionAlgorithm());
    primeDetectionAlgorithms.add(new ForLoopDiv2WithPreconditionPrimeDetectionAlgorithm());
    primeDetectionAlgorithms.add(new For6LoopSqrtWithLongPreconditionPrimeDetectionAlgorithm());
    primeDetectionAlgorithms.add(new ForLoopSqrtPrimeDetectionAlgorithm());
    primeDetectionAlgorithms.add(new ForLoopSqrtWithPreconditionPrimeDetectionAlgorithm());
  }

  @Test(dataProvider = "primeDataProvider")
  public void shouldTestPrimes(PrimeDetectionAlgorithm algorithm, Integer prime) {
    Assert.assertTrue(algorithm.isPrime(prime));
  }

  @Test(dataProvider = "nonPrimeDataProvider")
  public void shouldTestNonPrimes(PrimeDetectionAlgorithm algorithm, Integer nonPrime) {
    Assert.assertFalse(algorithm.isPrime(nonPrime));
  }

  @DataProvider
  public Object[][] nonPrimeDataProvider() {
    int[] nonPrimes =
        IntStream.rangeClosed(2, 100).filter(i -> Arrays.binarySearch(primes, i) < 0).toArray();
    Object[][] result = new Object[primeDetectionAlgorithms.size() * nonPrimes.length][];
    for (int i = 0; i < primeDetectionAlgorithms.size(); i++) {
      int indexBase = i * nonPrimes.length;
      for (int j = 0; j < nonPrimes.length; j++) {
        result[indexBase + j] = new Object[] {primeDetectionAlgorithms.get(i), nonPrimes[j]};
      }
    }
    return result;
  }

  @DataProvider
  public Object[][] primeDataProvider() {
    Object[][] result = new Object[primeDetectionAlgorithms.size() * primes.length][];
    for (int i = 0; i < primeDetectionAlgorithms.size(); i++) {
      int indexBase = i * primes.length;
      for (int j = 0; j < primes.length; j++) {
        result[indexBase + j] = new Object[] {primeDetectionAlgorithms.get(i), primes[j]};
      }
    }
    return result;
  }
}
