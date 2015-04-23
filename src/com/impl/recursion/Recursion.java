/*
 The MIT License (MIT)

 Copyright (c) 2015 Rahul Nadella https://github.com/rahulnadella

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
package com.impl.recursion;

/**
 * The {@code Recursion} provides several examples using recursion to solve a
 * set of problems: for example -> (Factorial, Fibonacci, SumDownBy2, Harmonic
 * Sum, Geometric Sum, Multiply, Exponential, Greatest Common Divisor, Least
 * Common Divisior, Loan Length, Reversing a String, Prime Number, and Tower of
 * Hanoi)
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
     * We have a number of bunnies and each bunny has two big floppy ears. We
     * want to compute the total number of ears across all the bunnies
     * recursively (without loops or multiplication).
     * 
     * <pre>
     * Example:
     * bunnyEars(0) → 0 
     * bunnyEars(1) → 2 
     * bunnyEars(2) → 4
     * </pre>
     */
    public static int bunnyEars(int bunnies) {
	if (bunnies == 0) {
	    return 0;
	} else {
	    return 2 + bunnyEars(bunnies - 1);
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
     * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
     * (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
     * have 3 ears, because they each have a raised foot. Recursively return the
     * number of "ears" in the bunny line 1, 2, ... n (without loops or
     * multiplication).
     * 
     * <pre>
     * Example:
     * bunnyEars2(0) → 0 
     * bunnyEars2(1) → 2 
     * bunnyEars2(2) → 5
     * </pre>
     */
    public static int bunnyEars2(int bunnies) {
	if (bunnies == 0) {
	    return 0;
	} else if (bunnies % 2 == 1) {
	    return 2 + bunnyEars2(bunnies - 1);
	} else {
	    return 3 + bunnyEars2(bunnies - 1);
	}
    }

    /**
     * We have triangle made of blocks. The topmost row has 1 block, the next
     * row down has 2 blocks, the next row has 3 blocks, and so on. Compute
     * recursively (no loops or multiplication) the total number of blocks in
     * such a triangle with the given number of rows.
     * 
     * <pre>
     * Example:
     * triangle(0) → 0 
     * triangle(1) → 1 
     * triangle(2) → 3
     * </pre>
     */
    public static int triangle(int rows) {
	if (rows == 0) {
	    return 0;
	} else {
	    return rows + triangle(rows - 1);
	}
    }

    /**
     * Given a non-negative int n, return the sum of its digits recursively (no
     * loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is
     * 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * 
     * <pre>
     * Example:
     * sumDigits(126) → 9 
     * sumDigits(49) → 13 
     * sumDigits(12) → 3
     * </pre>
     */
    public static int sumDigits(int n) {
	if (n == 0) {
	    return 0;
	} else {
	    return n % 10 + sumDigits(n / 10);
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
     * Given a non-negative int n, return the count of the occurrences of 7 as a
     * digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
     * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
     * removes the rightmost digit (126 / 10 is 12).
     * 
     * <pre>
     * Example:
     * count7(717) → 2 
     * count7(7) → 1 
     * count7(123) → 0
     * </pre>
     */
    public static int count7(int n) {
	if (n == 0) {
	    return 0;
	} else if (n % 10 == 7) {
	    return 1 + count7(n / 10);
	} else {
	    return count7(n / 10);
	}
    }

    /**
     * Given a non-negative int n, compute recursively (no loops) the count of
     * the occurrences of 8 as a digit, except that an 8 with another 8
     * immediately to its left counts double, so 8818 yields 4. Note that mod
     * (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by
     * 10 removes the rightmost digit (126 / 10 is 12).
     * 
     * <pre>
     * Example:
     * count8(8) → 1 
     * count8(818) → 2 
     * count8(8818) → 4
     * </pre>
     */
    public static int count8(int n) {
	if (n == 0) {
	    return 0;
	} else if (n >= 88 && n % 100 == 88) {
	    return 2 + count8(n / 10);
	} else if (n % 10 == 8) {
	    return 1 + count8(n / 10);
	} else {
	    return count8(n / 10);
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
     * Given a string, compute recursively (no loops) the number of lowercase
     * 'x' chars in the string.
     * 
     * <pre>
     * Example:
     * countX("xxhixx") → 4 
     * countX("xhixhix") → 3 
     * countX("hi") → 0
     * </pre>
     */
    public static int countX(String str) {
	if (str.length() == 0) {
	    return 0;
	} else if (str.charAt(0) == 'x') {
	    return 1 + countX(str.substring(1));
	} else {
	    return countX(str.substring(1));
	}
    }

    /**
     * Given a string, compute recursively (no loops) the number of times
     * lowercase "hi" appears in the string.
     * 
     * <pre>
     * Example:
     * countHi("xxhixx") → 1 
     * countHi("xhixhix") → 2 
     * countHi("hi") → 1
     * </pre>
     */
    public static int countHi(String str) {
	if (str.length() < 2) {
	    return 0;
	} else if (str.substring(0, 2).equals("hi")) {
	    return 1 + countHi(str.substring(2));
	} else {
	    return countHi(str.substring(1));
	}
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all the
     * lowercase 'x' chars have been changed to 'y' chars.
     * 
     * <pre>
     * Example:
     * changeXY("codex") → "codey" 
     * changeXY("xxhixx") → "yyhiyy"
     * changeXY("xhixhix") → "yhiyhiy"
     * </pre>
     */
    public static String changeXY(String str) {
	if (str.length() == 0) {
	    return str;
	} else if (str.charAt(0) == 'x') {
	    return "y" + changeXY(str.substring(1));
	} else {
	    return str.charAt(0) + changeXY(str.substring(1));
	}
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all
     * appearances of "pi" have been replaced by "3.14".
     * 
     * <pre>
     * Example:
     * changePi("xpix") → "x3.14x" 
     * changePi("pipi") → "3.143.14" 
     * changePi("pip") → "3.14p"
     * </pre>
     */
    public static String changePi(String str) {
	if (str.length() < 2) {
	    return str;
	} else if (str.substring(0, 2).equals("pi")) {
	    return "3.14" + changePi(str.substring(2));
	} else {
	    return str.charAt(0) + changePi(str.substring(1));
	}
    }

    /**
     * Given a string, compute recursively a new string where all the 'x' chars
     * have been removed.
     * 
     * <pre>
     * Example:
     * noX("xaxb") → "ab" 
     * noX("abc") → "abc" 
     * noX("xx") → ""
     * </pre>
     */
    public static String noX(String str) {
	if (str.length() == 0) {
	    return "";
	} else if (str.charAt(0) == 'x') {
	    return noX(str.substring(1));
	} else {
	    return str.charAt(0) + noX(str.substring(1));
	}
    }

    /**
     * Given a string, compute recursively a new string where all the adjacent
     * chars are now separated by a "*".
     * 
     * <pre>
     * Example:
     * allStar("hello") → "h*e*l*l*o" 
     * allStar("abc") → "a*b*c" 
     * allStar("ab") → "a*b"
     * </pre>
     */
    public static String allStar(String str) {
	if (str.length() <= 1) {
	    return str;
	} else {
	    return str.charAt(0) + "*" + allStar(str.substring(1));
	}
    }

    /**
     * Given a string, compute recursively a new string where identical chars
     * that are adjacent in the original string are separated from each other by
     * a "*".
     * 
     * <pre>
     * Example:
     * pairStar("hello") → "hel*lo" 
     * pairStar("xxyy") → "x*xy*y" 
     * pairStar("aaaa") → "a*a*a*a"
     * </pre>
     */
    public static String pairStar(String str) {
	if (str.length() < 2) {
	    return str;
	} else if (str.charAt(0) == str.charAt(1)) {
	    return str.charAt(0) + "*" + pairStar(str.substring(1));
	} else {
	    return str.charAt(0) + pairStar(str.substring(1));
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
     * Given a string, compute recursively a new string where all the lowercase
     * 'x' chars have been moved to the end of the string.
     * 
     * <pre>
     * Example:
     * endX("xxre") → "rexx" 
     * endX("xxhixx") → "hixxxx" 
     * endX("xhixhix") → "hihixxx"
     * </pre>
     */
    public static String endX(String str) {
	if (str.length() == 0) {
	    return str;
	} else if (str.charAt(0) == 'x') {
	    return endX(str.substring(1)) + "x";
	} else {
	    return str.charAt(0) + endX(str.substring(1));
	}
    }

    /**
     * We'll say that a "pair" in a string is two instances of a char separated
     * by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA"
     * contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number
     * of pairs in the given string.
     * 
     * <pre>
     * Example:
     * countPairs("axa") → 1 
     * countPairs("axax") → 2 
     * countPairs("axbx") → 1
     * </pre>
     */
    public static int countPairs(String str) {
	if (str.length() < 3) {
	    return 0;
	} else if (str.charAt(0) == str.charAt(2)) {
	    return 1 + countPairs(str.substring(1));
	} else {
	    return countPairs(str.substring(1));
	}
    }

    /**
     * 
     Count recursively the total number of "abc" and "aba" substrings that
     * appear in the given string.
     * 
     * <pre>
     * Example:
     * countAbc("abc") → 1 
     * countAbc("abcxxabc") → 2 
     * countAbc("abaxxaba") → 2
     * </pre>
     */
    public static int countAbc(String str) {
	if (str.length() < 3) {
	    return 0;
	} else if (str.substring(0, 3).equals("abc")
		|| str.substring(0, 3).equals("aba")) {
	    return 1 + countAbc(str.substring(1));
	} else {
	    return countAbc(str.substring(1));
	}
    }

    /**
     * Given a string, compute recursively (no loops) the number of "11"
     * substrings in the string. The "11" substrings should not overlap.
     * 
     * <pre>
     * Example:
     * count11("11abc11") → 2 
     * count11("abc11x11x11") → 3 
     * count11("111") → 1
     * </pre>
     */
    public static int count11(String str) {
	if (str.length() < 2) {
	    return 0;
	} else if (str.substring(0, 2).equals("11")) {
	    return 1 + count11(str.substring(2));
	} else {
	    return count11(str.substring(1));
	}
    }

    /**
     * Given a string, return recursively a "cleaned" string where adjacent
     * chars that are the same have been reduced to a single char. So "yyzzza"
     * yields "yza".
     * 
     * <pre>
     * Example:
     * stringClean("yyzzza") → "yza" 
     * stringClean("abbbcdd") → "abcd"
     * stringClean("Hello") → "Helo"
     * </pre>
     */
    public static String stringClean(String str) {
	if (str.length() < 2) {
	    return str;
	} else if (str.charAt(0) == str.charAt(1)) {
	    return stringClean(str.substring(1));
	} else {
	    return str.charAt(0) + stringClean(str.substring(1));
	}
    }

    /**
     * Given a string and a non-empty substring sub, compute recursively the
     * number of times that sub appears in the string, without the sub strings
     * overlapping.
     * 
     * <pre>
     * Example:
     * strCount("catcowcat", "cat") → 2 
     * strCount("catcowcat", "cow") → 1
     * strCount("catcowcat", "dog") → 0
     * </pre>
     */
    public static int strCount(String str, String sub) {
	if (str.length() < sub.length()) {
	    return 0;
	} else if (str.substring(0, sub.length()).equals(sub)) {
	    return 1 + strCount(str.substring(sub.length()), sub);
	} else {
	    return strCount(str.substring(1), sub);
	}
    }

    /**
     * Given a string and a non-empty substring sub, compute recursively if at
     * least n copies of sub appear in the string somewhere, possibly with
     * overlapping. N will be non-negative.
     * 
     * <pre>
     * Example:
     * strCopies("catcowcat", "cat", 2) → true 
     * strCopies("catcowcat", "cow", 2) → false 
     * strCopies("catcowcat", "cow", 1) → true
     * </pre>
     */
    public static boolean strCopies(String str, String sub, int n) {
	if (str.length() < sub.length()) {
	    return (n <= 0);
	} else if (str.substring(0, sub.length()).equals(sub)) {
	    return strCopies(str.substring(1), sub, n - 1);
	} else {
	    return strCopies(str.substring(1), sub, n);
	}
    }

    /**
     * Given a string and a non-empty substring sub, compute recursively the
     * largest substring which starts and ends with sub and return its length.
     * 
     * <pre>
     * Example:
     * strDist("catcowcat", "cat") → 9 
     * strDist("catcowcat", "cow") → 3
     * strDist("cccatcowcatxx", "cat") → 9
     * </pre>
     */
    public static int strDist(String str, String sub) {
	if (str.indexOf(sub) == -1) {
	    return 0;
	} else if (str.substring(0, sub.length()).equals(sub)
		&& str.substring(str.length() - sub.length()).equals(sub)) {
	    return str.length();
	} else if (!str.substring(0, sub.length()).equals(sub)) {
	    return strDist(str.substring(1), sub);
	} else {
	    return strDist(str.substring(0, str.length() - 1), sub);
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
     * Finds months needed to pay off loan payment with an interest rate over a
     * year
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
     * Finds the months needed to pay off loan payment
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
	    System.out.println("Month " + months + ": " + (int) p);
	    return loanLengthHelper((p - mp) + (p * i), i, mp, months + 1);
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
     * Given an array of ints, compute recursively if the array contains a 6.
     * We'll use the convention of considering only the part of the array that
     * begins at the given index. In this way, a recursive call can pass index+1
     * to move down the array. The initial call will pass in index as 0.
     * 
     * <pre>
     * Example:
     * array6({1, 6, 4}, 0) → true 
     * array6({1, 4}, 0) → false
     * array6({6}, 0) → true
     * </pre>
     */
    public static boolean array6(int[] nums, int index) {
	if (nums.length == 0) {
	    return false;
	} else if (index == nums.length - 1) {
	    return nums[index] == 6;
	} else if (nums[index] == 6) {
	    return true;
	} else {
	    return array6(nums, index + 1);
	}
    }

    /**
     * Given an array of ints, compute recursively the number of times that the
     * value 11 appears in the array. We'll use the convention of considering
     * only the part of the array that begins at the given index. In this way, a
     * recursive call can pass index+1 to move down the array. The initial call
     * will pass in index as 0.
     * 
     * <pre>
     * Example
     * array11({1, 2, 11}, 0) → 1 
     * array11({11, 11}, 0) → 2 
     * array11({1, 2, 3, 4},0) → 0
     * </pre>
     */
    public static int array11(int[] nums, int index) {
	if (index == nums.length) {
	    return 0;
	} else if (nums[index] == 11) {
	    return 1 + array11(nums, index + 1);
	} else {
	    return array11(nums, index + 1);
	}
    }

    /**
     * Given an array of ints, compute recursively if the array contains
     * somewhere a value followed in the array by that value times 10. We'll use
     * the convention of considering only the part of the array that begins at
     * the given index. In this way, a recursive call can pass index+1 to move
     * down the array. The initial call will pass in index as 0.
     * 
     * <pre>
     * Example:
     * array220({1, 2, 20}, 0) → true 
     * array220({3, 30}, 0) → true 
     * array220({3},0) → false
     * </pre>
     */
    public static boolean array220(int[] nums, int index) {
	if (nums.length < 2 || index == nums.length - 1) {
	    return false;
	} else if (nums[index + 1] == nums[index] * 10) {
	    return true;
	} else {
	    return array220(nums, index + 1);
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
    public static void towerOfHanoi(int n, String start, String auxillary,
	    String end) {
	if (n == 1) {
	    System.out.println("Current Disk " + n + ": " + start + " -> "
		    + end);
	} else {
	    towerOfHanoi(n - 1, start, end, auxillary);
	    System.out.println("Current Disk " + n + ": " + start + " -> "
		    + end);
	    towerOfHanoi(n - 1, auxillary, start, end);
	}
    }
}
