## What is it?
JMH benchmark of various prime number detection algorithms.


### Is there a unit tests?
PrimeDetectionAlgorithmTest - have two generic methods to test algorithms. First one is testing some primes from 2 to 1000, 
plus it tests 3 quite a big prime number. Second test method is testing all non primes from 4 to 1000. 


### What algorithms was tested?

|Class|Description|
|---|---|
|BigIntPrimeDetectionAlgorithm| Is based on 100 certainty of BigInteger.isProbablePrime method|
|CommonNumbersPrimeDetectionAlgorithm|Used method from commons-math library |
|For6LoopSqrtWithLongPreconditionPrimeDetectionAlgorithm|For loop until square root of the testing number with precondition. Steps are made with size of 6, each step has two condition.|
|ForLoopSqrtPrimeDetectionAlgorithm|For loop until  square root of the testing number with small precondition|
|ForLoopSqrtWithPreconditionPrimeDetectionAlgorithm|For loop until  square root of the testing number with precondition|
|ForLoopDiv2PrimeDetectionAlgorithm|For loop until tested number divided 2 with small precondition|
|ForLoopDiv2WithPreconditionPrimeDetectionAlgorithm|For loop until tested number divided 2 with precondition|
|IntStreamPrimeDetectionAlgorithm|Used java.util.stream.IntStream from 2 to square root of the testing number plus filtering|
|WhileLoopDiv2PrimeDetectionAlgorithm|While loop until tested number divided 2 with precondition|

### Results 

```
Benchmark                                                                                 Mode  Cnt     Score     Error  Units
PrimeDetectionAlgorithmBenchmark.for6LoopSqrtWithLongPreconditionPrimeDetectionAlgorithm  avgt   15     4,109 ±   0,381  ns/op
PrimeDetectionAlgorithmBenchmark.isCommonsNumbers                                         avgt   15     9,771 ±   2,208  ns/op
PrimeDetectionAlgorithmBenchmark.isPrimeAllWithCond                                       avgt   15    30,925 ±   4,319  ns/op
PrimeDetectionAlgorithmBenchmark.isPrimeBigInt                                            avgt   15  1967,845 ± 277,186  ns/op
PrimeDetectionAlgorithmBenchmark.isPrimeDiv2                                              avgt   15    10,169 ±   0,231  ns/op
PrimeDetectionAlgorithmBenchmark.isPrimeSqrt                                              avgt   15    11,929 ±   0,568  ns/op
PrimeDetectionAlgorithmBenchmark.isPrimeSqrt2                                             avgt   15     8,087 ±   0,712  ns/op
PrimeDetectionAlgorithmBenchmark.isPrimeStream                                            avgt   15    51,369 ±  14,964  ns/op
PrimeDetectionAlgorithmBenchmark.isPrimeWhile                                             avgt   15     8,811 ±   0,319  ns/op
 ```
 
### How to run

```
mvn clean install &&  java -jar target/benchmarks.jar
```