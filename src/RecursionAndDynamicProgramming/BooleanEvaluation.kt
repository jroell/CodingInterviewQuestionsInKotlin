package RecursionAndDynamicProgramming

/**
 * Created by Jason on 7/16/17.
 */

// Given a boolean expression consisting of the symbols 0 (false), 1 (true), * (AND), | (OR), and ^ (XOR), and a
// desired boolean result value result, implement a function to count the number of ways of parenthesizing he
// expression such that it evaluates to result. The expression should be fully parenthesized (e.g., (0)^(1) but not
// extraneously (e.g., (((0))^(1))).

// Example:
// countEval("1^0|0|1", false) -> 2
// countEval("0&0&0&1^1|0", true) -> 10