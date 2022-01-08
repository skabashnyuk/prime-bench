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
PrimeDetectionAlgorithmBenchmark.bigIntPrimeDetectionAlgorithm                            avgt   15  1166,551 ± 49,779  ns/op
PrimeDetectionAlgorithmBenchmark.commonNumbersPrimeDetectionAlgorithm                     avgt   15     7,911 ±  0,537  ns/op
PrimeDetectionAlgorithmBenchmark.for6LoopDiv2WithLongPreconditionPrimeDetectionAlgorithm  avgt   15     3,918 ±  0,109  ns/op
PrimeDetectionAlgorithmBenchmark.forLoopDiv2PrimeDetectionAlgorithm                       avgt   15     8,150 ±  0,233  ns/op
PrimeDetectionAlgorithmBenchmark.forLoopDiv2WithPreconditionPrimeDetectionAlgorithm       avgt   15    24,301 ±  2,372  ns/op
PrimeDetectionAlgorithmBenchmark.forLoopSqrtPrimeDetectionAlgorithm                       avgt   15    10,036 ±  0,979  ns/op
PrimeDetectionAlgorithmBenchmark.forLoopSqrtWithPreconditionPrimeDetectionAlgorithm       avgt   15     6,677 ±  0,584  ns/op
PrimeDetectionAlgorithmBenchmark.intStreamPrimeDetectionAlgorithm                         avgt   15    26,319 ±  1,183  ns/op
PrimeDetectionAlgorithmBenchmark.whileLoopDiv2PrimeDetectionAlgorithm                     avgt   15     8,246 ±  0,307  ns/op
 ```
 
### How to run

```
mvn clean install &&  java -jar target/benchmarks.jar
```