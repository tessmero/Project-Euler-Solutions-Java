package com.tessmero.projecteuler.solvers;

import static com.tessmero.projecteuler.util.Primes.getPrimes;

import java.util.List;

/**
 * What is the 10 001st prime number.
 * 
 * @author Oliver
 */
public class Solver7 extends Solver {

  @Override
  public long doSolution() {
    return getNthPrimeNumber( 10001 );
  }

  @Override
  public long doTest() {
    return getNthPrimeNumber( 6 );
  }

  @Override
  public long getExpectedTestResult() {
    return 13;
  }
  
  private long getNthPrimeNumber( int count ) {
    List<Long> primes = getPrimes( count );
    return primes.get( count - 1 );
  }
}
