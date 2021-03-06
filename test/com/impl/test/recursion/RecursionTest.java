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
package com.impl.test.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.impl.recursion.Recursion;

/**
 * The {@code RecursionTest} is used to the {@code Recursion} class.
 * 
 * @author rahulnadella
 */
public class RecursionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test to determine whether the factorial method returns the correct sum
     * 
     * {@link com.impl.recursion.Recursion#factorial(int)}
     */
    @Test
    public void testFactorial() {
	assertEquals(1, Recursion.factorial(1));
	assertEquals(24, Recursion.factorial(4));
    }

    /**
     * Test to determine whether the bunnyEars method returns the correct sum
     * 
     * {@link com.impl.recursion.Recursion#bunnyEars(int)}
     */
    @Test
    public void testBunnyEars() {
	assertEquals(0, Recursion.bunnyEars(0));
	assertEquals(2, Recursion.bunnyEars(1));
	assertEquals(4, Recursion.bunnyEars(2));
    }

    /**
     * Test to determine whether the bunnyEars2 method returns the correct sum
     * 
     * {@link com.impl.recursion.Recursion#bunnyEars2(int)}
     */
    @Test
    public void testBunnyEars2() {
	assertEquals(0, Recursion.bunnyEars2(0));
	assertEquals(2, Recursion.bunnyEars2(1));
	assertEquals(5, Recursion.bunnyEars2(2));
    }

    /**
     * Test to determine whether the triangle method returns the correct blocks
     * 
     * {@link com.impl.recursion.Recursion#triangle(int)}
     */
    @Test
    public void testTriangle() {
	assertEquals(0, Recursion.triangle(0));
	assertEquals(1, Recursion.triangle(1));
	assertEquals(3, Recursion.triangle(2));
    }

    /**
     * Test to determine whether the sumDigits method returns the calculated
     * value
     * 
     * {@link com.impl.recursion.Recursion#sumDigits(int)}
     */
    @Test
    public void testSumDigits() {
	assertEquals(9, Recursion.sumDigits(126));
	assertEquals(13, Recursion.sumDigits(49));
	assertEquals(3, Recursion.sumDigits(12));
    }

    /**
     * Test to determine whether the count7 method returns the number of 7's in
     * the integer value.
     * 
     * {@link com.impl.recursion.Recursion#count7(int)}
     */
    @Test
    public void testCount7() {
	assertEquals(2, Recursion.count7(717));
	assertEquals(0, Recursion.count7(8643));
    }

    /**
     * Test to determine whether the count8 method returns the corresponding
     * number of 8's in integer value
     * 
     * {@link com.impl.recursion.Recursion#count8(int)}
     */
    @Test
    public void testCount8() {
	assertEquals(1, Recursion.count8(8));
	assertEquals(2, Recursion.count8(818));
	assertEquals(4, Recursion.count8(8188));
    }

    /**
     * Test to determine whether the sumDownBy2 recursive method returns the sum
     * of the positive integers of n+(n-2)+(n-4)... (until n-x =< 0)
     * 
     * {@link com.impl.recursion.Recursion#sumDownBy2(int)}
     */
    @Test
    public void testSumDownBy2() {
	assertEquals(0, Recursion.sumDownBy2(0));
	assertEquals(2, Recursion.sumDownBy2(2));
	assertEquals(6, Recursion.sumDownBy2(4));
    }

    /**
     * Test to determine whether the harmonicSum recursive method returns the
     * sum of the positive integers of 1 + 1/2 + 1/(n-1) .... + 1/n
     * 
     * {@link com.impl.recursion.Recursion#harmonicSum(int)}
     */
    @Test
    public void testHarmonicSum() {
	assertEquals(1, Recursion.harmonicSum(1), 0.001);
	assertEquals(1.5, Recursion.harmonicSum(2), 0.001);
	assertEquals(1.833, Recursion.harmonicSum(3), 0.001);
	assertEquals(2.083, Recursion.harmonicSum(4), 0.001);
    }

    /**
     * Test to determine whether the geometricSum recursive method returns the
     * sum of the positive integers of 1 + 1/2 + 1/(n-1) .... + 1/n
     * 
     * {@link com.impl.recursion.Recursion#geometricSum(double)}
     */
    @Test
    public void testGeometricSum() {
	assertEquals(1, Recursion.geometricSum(0), 0.001);
	assertEquals(1.5, Recursion.geometricSum(1), 0.001);
    }

    /**
     * Test to determine whether the mult recursive method returns j*k
     * 
     * {@link com.impl.recursion.Recursion#mult(int, int)}
     */
    @Test
    public void testMult() {
	assertEquals(6, Recursion.mult(2, 3), 0.001);
	assertEquals(-10, Recursion.mult(-2, 5), 0.001);
    }

    /**
     * Test to determine whether the recursive method returns the value of n to
     * k
     * 
     * {@link com.impl.recursion.Recursion#expt(int, int)}
     */
    @Test
    public void testExpt() {
	assertEquals(8, Recursion.expt(2, 3), 0.001);
	assertEquals(3, Recursion.expt(3, 1), 0.001);
    }

    /**
     * Test to determine whether the countX method returns the integer value of
     * X's contained in the String object.
     * 
     * {@link com.impl.recursion.Recursion#countX(String)}
     */
    @Test
    public void testCountX() {
	assertEquals(4, Recursion.countX("xxhixx"));
	assertEquals(3, Recursion.countX("xxhix"));
	assertEquals(0, Recursion.countX("hi"));
    }

    /**
     * Test to determine whether the countHi method returns the integer value of
     * Hi's contained in the String object
     * 
     * {@link com.impl.recursion.Recursion#countHi(String)}
     */
    @Test
    public void testCountHi() {
	assertEquals(1, Recursion.countHi("xxhixx"));
	assertEquals(2, Recursion.countHi("xhixhix"));
	assertEquals(1, Recursion.countHi("hi"));
    }

    /**
     * Test to determine whether the changeXY method returns the String object
     * with any X characters changed to Y characters
     * 
     * {@link com.impl.recursion.Recursion#changeXY(String)}
     */
    @Test
    public void testChangeXY() {
	assertEquals("codey", Recursion.changeXY("codex"));
	assertEquals("yyhiyy", Recursion.changeXY("xxhixx"));
	assertEquals("yhiyhiy", Recursion.changeXY("xhixhix"));
    }

    /**
     * Test to determine whether the changePi method returns the String object
     * with any Pi characters changed to 3.14
     * 
     * {@link com.impl.recursion.Recursion#changePi(String)}
     */
    @Test
    public void testChangePi() {
	assertEquals("x3.14x", Recursion.changePi("xpix"));
	assertEquals("3.143.14", Recursion.changePi("pipi"));
	assertEquals("3.14p", Recursion.changePi("pip"));
    }

    /**
     * Test to determine whether the noX method returns the String object
     * without an X's characters in it
     * 
     * {@link com.impl.recursion.Recursion#noX(String)}
     */
    @Test
    public void testNoX() {
	assertEquals("ab", Recursion.noX("xaxb"));
	assertEquals("abc", Recursion.noX("abc"));
	assertEquals("", Recursion.noX("xx"));
    }

    /**
     * Test to determine whether the allStar method returns the String object
     * containing * character in it.
     * 
     * {@link com.impl.recursion.Recursion#allStar(String)}
     */
    @Test
    public void testAllStar() {
	assertEquals("h*e*l*l*o", Recursion.allStar("hello"));
	assertEquals("a*b*c", Recursion.allStar("abc"));
	assertEquals("a*b", Recursion.allStar("ab"));
    }

    /**
     * Test to determine whether the pairStar method returns the String object
     * containing * character for identical pairs of characters within the
     * String.
     * 
     * {@link com.impl.recursion.Recursion#pairStar(String)}
     */
    @Test
    public void testPairStar() {
	assertEquals("hel*lo", Recursion.pairStar("hello"));
	assertEquals("x*xy*y", Recursion.pairStar("xxyy"));
	assertEquals("a*a*a*a", Recursion.pairStar("aaaa"));
    }

    /**
     * Test to determine whether the endX method returns a String object with
     * any X character moved to the end of the String.
     * 
     * {@link com.impl.recursion.Recursion#endX(String)}
     */
    @Test
    public void testEndX() {
	assertEquals("rexx", Recursion.endX("xxre"));
	assertEquals("hixxxx", Recursion.endX("xxhixx"));
	assertEquals("hihixxx", Recursion.endX("xhixhix"));
    }

    /**
     * Test to determine whether the countPairs method returns the Integer value
     * with corresponding pairs within a String object
     * 
     * {@link com.impl.recursion.Recursion#countPairs(String)}
     */
    @Test
    public void testCountPairs() {
	assertEquals(1, Recursion.countPairs("axa"));
	assertEquals(2, Recursion.countPairs("axax"));
	assertEquals(1, Recursion.countPairs("axbx"));
    }

    /**
     * Test to determine whether the countABC method returns the Integer value
     * of the number of ABC character within the String
     * 
     * {@link com.impl.recursion.Recursion#countAbc(String)}
     */
    @Test
    public void testCountABC() {
	assertEquals(1, Recursion.countAbc("abc"));
	assertEquals(2, Recursion.countAbc("abcxxabc"));
	assertEquals(2, Recursion.countAbc("abaxxaba"));
    }

    /**
     * Test to determine whether the count11 method returns the Integer value of
     * the number of 11 characters within the String
     * 
     * {@link com.impl.recursion.Recursion#count11(String)}
     */
    @Test
    public void testCount11() {
	assertEquals(2, Recursion.count11("11abc11"));
	assertEquals(3, Recursion.count11("abc11x11x11"));
	assertEquals(1, Recursion.count11("111"));
    }

    /**
     * Test to determine whether the stringClean method returns the String
     * object of a String without any adjacent characters within it
     * 
     * {@link com.impl.recursion.Recursion#stringClean(String)}
     */
    @Test
    public void testStringClean() {
	assertEquals("yza", Recursion.stringClean("yyzzza"));
	assertEquals("abcd", Recursion.stringClean("abbbcdd"));
	assertEquals("Helo", Recursion.stringClean("Hello"));
    }

    /**
     * Test to determine whether the strCount method returns the Integer value
     * of String containing a specific sequence of characters within it
     * 
     * {@link com.impl.recursion.Recursion#strCount(String, String)}
     */
    @Test
    public void testStrCount() {
	assertEquals(2, Recursion.strCount("catcowcat", "cat"));
	assertEquals(1, Recursion.strCount("catcowcat", "cow"));
	assertEquals(0, Recursion.strCount("catcowcat", "dog"));
    }

    /**
     * Test to determine whether the strCopies method returns the Boolean value
     * 
     * {@link com.impl.recursion.Recursion#strCopies(String, String, int)}
     */
    @Test
    public void testStrCopies() {
	assertEquals(true, Recursion.strCopies("catcowcat", "cat", 2));
	assertEquals(false, Recursion.strCopies("catcowcat", "cow", 2));
	assertEquals(true, Recursion.strCopies("catcowcat", "cow", 1));
    }
    
    /**
     * Test to determine whether the strDist method returns the Integer value
     * 
     * {@link com.impl.recursion.Recursion#strDist(String, String)}
     */
    @Test
    public void testStrDist() {
	assertEquals(9, Recursion.strDist("catcowcat", "cat"));
	assertEquals(3, Recursion.strDist("catcowcat", "cow"));
	assertEquals(9, Recursion.strDist("cccatcowcatxx", "cat"));
    }
    
    /**
     * Test to determine whether the recursive method returns the least common
     * multiple of j and k
     * 
     * {@link com.impl.recursion.Recursion#lcm(int, int)}
     */
    @Test
    public void testLCM() {
	assertEquals(15, Recursion.lcm(5, 3), 0.001);
	assertEquals(24, Recursion.lcm(6, 8), 0.001);
    }

    /**
     * Test to determine whether loan length calc works
     * 
     * {@link com.impl.recursion.Recursion#loanLength(int, double, int)}
     */
    @Test
    public void testLoanLength() {
	assertEquals(0, Recursion.loanLength(0, 0, 0));
	assertEquals(5, Recursion.loanLength(1000, .1, 250));
    }

    /**
     * Test to determine whether reverseString works
     * 
     * {@link com.impl.recursion.Recursion#reverseString(String)}
     */
    @Test
    public void testReverse() {
	assertEquals("olleH", Recursion.reverseString("Hello"));
    }

    /**
     * Test to print out all prime numbers of 100
     * 
     * {@link com.impl.recursion.Recursion#primes(int, int)}
     */
    @Test
    public void testPrime() {
	for (int i = 2; i < 100; i++) {
	    if (Recursion.primes(i, i - 1)) {
		System.out.println(+i + " is prime");
	    }
	}
    }
}
