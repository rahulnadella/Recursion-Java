package com.impl.recursion;

/**
 * The {@code Recursion} provides several examples using recursion to solve a
 * set of problems (Factorial, SumDownBy2, Harmonic Sum, Geometric Sum,
 * Multiply, Exponential, Greatest Common Divisor, Least Common Divisior, Loan
 * Length)
 * 
 * @author rahulnadella
 */
public class Recursion {

    /**
     * In mathematics, the factorial of a non-negative integer n, denoted by n!,
     * is the product of all positive integers less than or equal to n. For
     * example, The value of 0! is 1, according to the convention for an empty
     * product.
     * 
     * @return The Factorial value of integer (4! = 24)
     */
    public static int factorial(int k) {
	if (k <= 1) {
	    return 1;
	} else {
	    return k * factorial(k - 1);
	}
    }

    /**
     * Solves the Fibonacci Sequence using recursion.
     */
    public static int fibonacci(int n) {
	if (n == 1 || n == 2) {
	    return 1;
	} else {
	    return (fibonacci(n - 1) + fibonacci(n - 2));
	}
    }

    /**
     * Recursive method returns the sum of the positive integers of
     * n+(n-2)+(n-4)... (until n-x =< 0)
     * 
     */
    public static int sumDownBy2(int n) {
	if (n < 1) {
	    return 0;
	} else {
	    return n + sumDownBy2(n - 2);
	}
    }

    /**
     * Recursive method returns the harmonic sum of n-1
     */
    public static double harmonicSum(int n) {
	if (n < 2) {
	    return 1;
	} else {
	    return 1.0 / (n) + (harmonicSum(n - 1));
	}
    }

    /**
     * Recursive method returns the geometric sum
     */
    public static double geometricSum(double k) {
	if (k < 0) {
	    return 0;
	} else {
	    return 1 / (Math.pow(2, k)) + (geometricSum(k - 1));
	}
    }

    /**
     * Recursive method returns the multiplacative sum of j*k (uses multhelper
     * and then addresses the negative case)
     */
    public static int mult(int j, int k) {
	if (k < 0) {
	    return -multHelper(j, -k);
	} else {
	    return multHelper(j, k);
	}
    }

    /**
     * Recursive method returns the multiplacative sum of j*k when integers j, k
     * are positive
     */
    protected static int multHelper(int j, int k) {
	return (j == 0 || k == 0) ? 0 : (j + mult(j, k - 1));
    }

    /**
     * Recursive method returns the value of n to the k
     */
    public static int expt(int n, int k) {
	if (k <= 0) {
	    return 1;
	} else {
	    return n * expt(n, k - 1);
	}
    }

    /**
     * Recursive method returns the least common multiple of integers j and k
     */
    public static int lcm(int j, int k) {
	return (j * k) / (gcd(j, k));
    }

    /**
     * Recursive method returns the greatest common denominator of integers a
     * and b
     */
    public static int gcd(int a, int b) {
	if (b == 0) {
	    return a;
	} else {
	    return gcd(b, a % b);
	}
    }

    /**
     * Finds months needed to pay off loan p
     * 
     * @param p
     *            is principal
     * @param i
     *            is interest
     * @param mp
     *            is monthly payment
     */
    public static int loanLength(int p, double i, int mp) {
	return loanLengthHelper(p, i / 12, mp, 0);
    }

    /**
     * Recursive method returns the greatest common denominator of integers a
     * and b
     * 
     * @param p
     *            is principal
     * @param i
     *            is interest
     * @param mp
     *            is monthly payment
     * @param months
     *            is months paid
     */
    protected static int loanLengthHelper(double p, double i, double mp,
	    int months) {
	if (p <= 0) {
	    return months;
	} else {
	    System.out.println("Month" + months + ":" + (int) p);
	    return loanLengthHelper((p - mp) + (p * i), i, mp, months + 1);
	}
    }

    /**
     * The reverseString method returns a String in reverse order (HELLO ->
     * OLLEH)
     */
    public static String reverseString(String text) {
	if (text == null || text.isEmpty() || text.length() <= 1) {
	    return text;
	} else {
	    return reverseString(text.substring(1)) + text.charAt(0);
	}
    }

    /**
     * Determines if a number is prime or not.
     */
    public static boolean primes(int x, int i) {
	if (i == 1) {
	    return true;
	} else if (x % i == 0) {
	    return false;
	} else {
	    return primes(x, i - 1);
	}
    }

    /**
     * The Tower of Hanoi (also called the Tower of Brahma or Lucas' Tower,[1]
     * and sometimes pluralized) is a mathematical game or puzzle. It consists
     * of three rods, and a number of disks of different sizes which can slide
     * onto any rod. The puzzle starts with the disks in a neat stack in
     * ascending order of size on one rod, the smallest at the top, thus making
     * a conical shape.
     * 
     * The objective of the puzzle is to move the entire stack to another rod,
     * obeying the following simple rules:
     * 
     * Only one disk can be moved at a time. Each move consists of taking the
     * upper disk from one of the stacks and placing it on top of another stack
     * i.e. a disk can only be moved if it is the uppermost disk on a stack. No
     * disk may be placed on top of a smaller disk.
     */
    public static void hanoi(int n, String start, String auxillary, String end) {
	if (n == 1) {
	    System.out.println("Current Disk " + n + ": " + start + " -> "
		    + end);
	} else {
	    hanoi(n - 1, start, end, auxillary);
	    System.out.println("Current Disk " + n + ": " + start + " -> "
		    + end);
	    hanoi(n - 1, auxillary, start, end);
	}
    }
}
