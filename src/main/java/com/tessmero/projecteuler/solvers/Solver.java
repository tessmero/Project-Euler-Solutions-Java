package com.tessmero.projecteuler.solvers;

/**
 * Abstract class that all problem-solutions should inherit from.
 * 
 * @author Oliver
 */
public abstract class Solver {
  
  /**
   * For convenient one-off testing of new solver implementations.
   * @param args ignored
   */
  public static void main(String[] args) throws Exception {
    Solver instance = new Solver11();
    System.out.println( instance.doSolution() );
  }
  
  /**
   * Compute the correct solution for the ProjectEuler problem the implementation pertains to.
   * 
   * @return the solution, which can be verified at ProjectEuler.org
   */
  public abstract long doSolution() throws Exception;
  
  /**
   * Run a shorter version of the solution, used to confirm that the implementation still works.
   * 
   * <p>When applicable, this will return the example result listed in the online problem 
   * description
   * 
   * @return a computed result matching {@link #getExpectedTestResult()}
   */
  public abstract long doTest() throws Exception;
  
  /**
   * Provides the implementation's expected result from {@link #doTest()}.
   * 
   * <p>When applicable, this will match the example result listed in the online problem 
   * description
   * 
   * @return a hard-coded expected test result
   */
  public abstract long getExpectedTestResult();
}
