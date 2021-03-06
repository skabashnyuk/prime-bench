/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.sample;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Benchmark)
public class PrimeDetectionAlgorithmBenchmark {
  private int test = 223938093;
  private CommonNumbersPrimeDetectionAlgorithm commonNumbersPrimeDetectionAlgorithm =
      new CommonNumbersPrimeDetectionAlgorithm();
  private BigIntPrimeDetectionAlgorithm bigIntPrimeDetectionAlgorithm =
      new BigIntPrimeDetectionAlgorithm();
  private IntStreamPrimeDetectionAlgorithm intStreamPrimeDetectionAlgorithm =
      new IntStreamPrimeDetectionAlgorithm();
  private ForLoopDiv2PrimeDetectionAlgorithm forLoopDiv2PrimeDetectionAlgorithm =
      new ForLoopDiv2PrimeDetectionAlgorithm();
  private WhileLoopDiv2PrimeDetectionAlgorithm whileLoopDiv2PrimeDetectionAlgorithm =
      new WhileLoopDiv2PrimeDetectionAlgorithm();
  private ForLoopDiv2WithPreconditionPrimeDetectionAlgorithm
      forLoopDiv2WithPreconditionPrimeDetectionAlgorithm =
          new ForLoopDiv2WithPreconditionPrimeDetectionAlgorithm();
  private For6LoopSqrtWithLongPreconditionPrimeDetectionAlgorithm
      for6LoopDiv2WithLongPreconditionPrimeDetectionAlgorithm =
          new For6LoopSqrtWithLongPreconditionPrimeDetectionAlgorithm();
  private ForLoopSqrtPrimeDetectionAlgorithm forLoopSqrtPrimeDetectionAlgorithm =
      new ForLoopSqrtPrimeDetectionAlgorithm();
  private ForLoopSqrtWithPreconditionPrimeDetectionAlgorithm
      forLoopSqrtWithPreconditionPrimeDetectionAlgorithm =
          new ForLoopSqrtWithPreconditionPrimeDetectionAlgorithm();

  @Benchmark
  public void forLoopDiv2PrimeDetectionAlgorithm(final Blackhole bh) {
    bh.consume(forLoopDiv2PrimeDetectionAlgorithm.isPrime(test));
  }

  @Benchmark
  public void whileLoopDiv2PrimeDetectionAlgorithm(final Blackhole bh) {
    bh.consume(whileLoopDiv2PrimeDetectionAlgorithm.isPrime(test));
  }

  @Benchmark
  public void forLoopDiv2WithPreconditionPrimeDetectionAlgorithm(final Blackhole bh) {
    bh.consume(forLoopDiv2WithPreconditionPrimeDetectionAlgorithm.isPrime(test));
  }

  @Benchmark
  public void for6LoopDiv2WithLongPreconditionPrimeDetectionAlgorithm(final Blackhole bh) {
    bh.consume(for6LoopDiv2WithLongPreconditionPrimeDetectionAlgorithm.isPrime(test));
  }

  @Benchmark
  public void intStreamPrimeDetectionAlgorithm(final Blackhole bh) {
    bh.consume(intStreamPrimeDetectionAlgorithm.isPrime(test));
  }

  @Benchmark
  public void forLoopSqrtPrimeDetectionAlgorithm(final Blackhole bh) {
    bh.consume(forLoopSqrtPrimeDetectionAlgorithm.isPrime(test));
  }

  @Benchmark
  public void forLoopSqrtWithPreconditionPrimeDetectionAlgorithm(final Blackhole bh) {
    bh.consume(forLoopSqrtWithPreconditionPrimeDetectionAlgorithm.isPrime(test));
  }

  @Benchmark
  public void bigIntPrimeDetectionAlgorithm(final Blackhole bh) {
    bh.consume(bigIntPrimeDetectionAlgorithm.isPrime(test));
  }

  @Benchmark
  public void commonNumbersPrimeDetectionAlgorithm(final Blackhole bh) {
    bh.consume(commonNumbersPrimeDetectionAlgorithm.isPrime(test));
  }
}
