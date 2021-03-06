package com.tessmero.projecteuler.solvers;

import static org.slf4j.LoggerFactory.getLogger;

import com.tessmero.projecteuler.solvers.impl.Solver26;

/**
 * Interface that all problem-solvers inherit from.
 *
 * <p>Implementations generally should not implement Solver directly, but rather extend {@link
 * com.tessmero.projecteuler.solvers.LongSolver}.
 *
 * @author Oliver
 */
public interface Solver {

  /**
   * One-off for testing solver implementations.
   *
   * @param args ignored
   */
  public static void main(String[] args) throws Exception {
    Solver instance = new Solver26();
    getLogger(Solver.class).info("Solution: " + instance.doSolutionStr());
  }

  /**
   * Compute the correct solution for the ProjectEuler problem the implementation pertains to.
   *
   * @return the solution, which can be verified at ProjectEuler.org
   */
  public abstract String doSolutionStr() throws Exception;

  /**
   * Run a shorter version of the solution, used to confirm that the implementation still works.
   *
   * <p>When applicable, this will return the example solution given in the online problem
   * description
   *
   * @return a computed result matching {@link #getExpectedTestResult()}
   */
  public abstract String doTestStr() throws Exception;

  /**
   * Provides the implementation's expected result from {@link #doTest()}.
   *
   * <p>When applicable, this will be the example solution listed in the online problem description
   *
   * @return a hard-coded expected test result
   */
  public abstract String getExpectedTestResultStr();
}
