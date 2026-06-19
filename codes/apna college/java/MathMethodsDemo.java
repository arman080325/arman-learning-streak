/**
 * MathMethodsDemo.java
 * --------------------------------------------------------------
 * A single program demonstrating Java's java.lang.Math methods.
 * Each method has a short comment + a working example with output.
 *
 * Compile : javac MathMethodsDemo.java
 * Run     : java MathMethodsDemo
 * --------------------------------------------------------------
 */
public class MathMethodsDemo {

    public static void main(String[] args) {

        System.out.println("===== Java Math Methods Demo =====\n");

        /* ------------------------------------------------------------------
         * Math.abs() : returns the ABSOLUTE (non-negative) value.
         * ---------------------------------------------------------------- */
        System.out.println("abs(-12.5)        = " + Math.abs(-12.5));     // 12.5
        System.out.println("abs(7)            = " + Math.abs(7));         // 7

        /* ------------------------------------------------------------------
         * Math.max() : returns the LARGER of two values.
         * ---------------------------------------------------------------- */
        System.out.println("max(10, 25)       = " + Math.max(10, 25));    // 25

        /* ------------------------------------------------------------------
         * Math.min() : returns the SMALLER of two values.
         * ---------------------------------------------------------------- */
        System.out.println("min(10, 25)       = " + Math.min(10, 25));    // 10

        /* ------------------------------------------------------------------
         * Math.round() : rounds a decimal to the NEAREST whole number.
         * Returns long (for double) or int (for float).
         * ---------------------------------------------------------------- */
        System.out.println("round(7.6)        = " + Math.round(7.6));     // 8
        System.out.println("round(7.4)        = " + Math.round(7.4));     // 7

        /* ------------------------------------------------------------------
         * Math.sqrt() : SQUARE ROOT of a number.
         * ---------------------------------------------------------------- */
        System.out.println("sqrt(81)          = " + Math.sqrt(81));       // 9.0

        /* ------------------------------------------------------------------
         * Math.cbrt() : CUBE ROOT of a number.
         * ---------------------------------------------------------------- */
        System.out.println("cbrt(27)          = " + Math.cbrt(27));       // 3.0

        /* ------------------------------------------------------------------
         * Math.pow(a, b) : a raised to the power b  (a^b).
         * ---------------------------------------------------------------- */
        System.out.println("pow(2, 5)         = " + Math.pow(2, 5));      // 32.0

        /* ------------------------------------------------------------------
         * Math.signum() : sign of a value -> -1.0, 0.0, or 1.0.
         * ---------------------------------------------------------------- */
        System.out.println("signum(-9.0)      = " + Math.signum(-9.0));   // -1.0
        System.out.println("signum(9.0)       = " + Math.signum(9.0));    // 1.0

        /* ------------------------------------------------------------------
         * Math.ceil() : SMALLEST integer >= argument (rounds UP).
         * Returns a double.
         * ---------------------------------------------------------------- */
        System.out.println("ceil(4.1)         = " + Math.ceil(4.1));      // 5.0

        /* ------------------------------------------------------------------
         * Math.floor() : LARGEST integer <= argument (rounds DOWN).
         * Returns a double.
         * ---------------------------------------------------------------- */
        System.out.println("floor(4.9)        = " + Math.floor(4.9));     // 4.0

        /* ------------------------------------------------------------------
         * Math.copySign(mag, sign) : magnitude of 1st arg, sign of 2nd arg.
         * ---------------------------------------------------------------- */
        System.out.println("copySign(7.0,-1.0)= " + Math.copySign(7.0, -1.0)); // -7.0

        /* ------------------------------------------------------------------
         * Math.nextAfter(start, dir) : next floating-point value from
         * 'start' moving toward 'dir'.
         * ---------------------------------------------------------------- */
        System.out.println("nextAfter(1.0,2.0)= " + Math.nextAfter(1.0, 2.0)); // 1.0000000000000002

        /* ------------------------------------------------------------------
         * Math.nextUp() : next floating-point value toward +infinity.
         * ---------------------------------------------------------------- */
        System.out.println("nextUp(1.0)       = " + Math.nextUp(1.0));    // 1.0000000000000002

        /* ------------------------------------------------------------------
         * Math.nextDown() : next floating-point value toward -infinity.
         * ---------------------------------------------------------------- */
        System.out.println("nextDown(1.0)     = " + Math.nextDown(1.0));  // 0.9999999999999999

        /* ------------------------------------------------------------------
         * Math.floorDiv(a, b) : largest int <= the algebraic quotient a/b.
         * Differs from normal integer division for negative numbers.
         * ---------------------------------------------------------------- */
        System.out.println("floorDiv(-7, 2)   = " + Math.floorDiv(-7, 2));// -4 (normal / gives -3)

        /* ------------------------------------------------------------------
         * Math.random() : random double in range [0.0, 1.0).
         * (Output varies each run.)
         * ---------------------------------------------------------------- */
        System.out.println("random()          = " + Math.random());      // e.g. 0.5731...

        /* ------------------------------------------------------------------
         * Math.rint() : double closest to the argument, equal to an integer.
         * On a "tie" (x.5) it rounds to the EVEN value.
         * ---------------------------------------------------------------- */
        System.out.println("rint(2.5)         = " + Math.rint(2.5));      // 2.0 (even)
        System.out.println("rint(3.5)         = " + Math.rint(3.5));      // 4.0 (even)

        /* ------------------------------------------------------------------
         * Math.hypot(x, y) : sqrt(x^2 + y^2) without overflow/underflow.
         * ---------------------------------------------------------------- */
        System.out.println("hypot(3, 4)       = " + Math.hypot(3, 4));    // 5.0

        /* ------------------------------------------------------------------
         * Math.ulp() : size of an ULP (Unit in the Last Place) of the arg,
         * i.e. the gap to the next representable double.
         * ---------------------------------------------------------------- */
        System.out.println("ulp(1.0)          = " + Math.ulp(1.0));       // 2.22...E-16

        /* ------------------------------------------------------------------
         * Math.getExponent() : unbiased exponent in the binary representation.
         * 8.0 = 1.0 x 2^3  ->  exponent 3.
         * ---------------------------------------------------------------- */
        System.out.println("getExponent(8.0)  = " + Math.getExponent(8.0)); // 3

        /* ------------------------------------------------------------------
         * Math.IEEEremainder(x, y) : remainder per IEEE 754
         * (x - (round(x/y) * y)); can be negative.
         * ---------------------------------------------------------------- */
        System.out.println("IEEEremainder(5,3)= " + Math.IEEEremainder(5, 3)); // -1.0

        /* ------------------------------------------------------------------
         * *Exact methods: do normal arithmetic but THROW ArithmeticException
         * on int/long overflow instead of silently wrapping.
         * ---------------------------------------------------------------- */
        System.out.println("addExact(10, 5)        = " + Math.addExact(10, 5));        // 15
        System.out.println("subtractExact(10, 5)   = " + Math.subtractExact(10, 5));   // 5
        System.out.println("multiplyExact(10, 5)   = " + Math.multiplyExact(10, 5));   // 50
        System.out.println("incrementExact(10)     = " + Math.incrementExact(10));     // 11
        System.out.println("decrementExact(10)     = " + Math.decrementExact(10));     // 9
        System.out.println("negateExact(10)        = " + Math.negateExact(10));        // -10

        /* ------------------------------------------------------------------
         * Math.toIntExact(long) : safely convert long -> int, throwing if
         * the value does not fit in an int.
         * ---------------------------------------------------------------- */
        long bigButFits = 1234567L;
        System.out.println("toIntExact(1234567L)   = " + Math.toIntExact(bigButFits)); // 1234567

        /* ------------------------------------------------------------------
         * Demonstrating the OVERFLOW protection of an *Exact method.
         * Adding 1 to Integer.MAX_VALUE would overflow, so it throws.
         * ---------------------------------------------------------------- */
        System.out.println("\n--- Overflow demo with addExact ---");
        try {
            int overflow = Math.addExact(Integer.MAX_VALUE, 1);
            System.out.println("Result = " + overflow); // never reached
        } catch (ArithmeticException e) {
            System.out.println("Caught overflow: " + e.getMessage()); // integer overflow
        }

        System.out.println("\n===== End of Demo =====");
    }
}