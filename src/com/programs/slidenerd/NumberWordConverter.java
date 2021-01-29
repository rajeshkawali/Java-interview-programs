package com.programs.slidenerd;

import java.util.Random;

public class NumberWordConverter {
    public static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    public static final String[] tens = {
            "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
    };

    public static String convert(final int n) {
        if (n < 0) {
            return "minus " + convert(-n);
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }

        if (n < 1000000) {
            return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
        }

        if (n < 1000000000) {
            return convert(n / 1000000) + " million" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
        }

        return convert(n / 1000000000) + " billion"  + ((n % 1000000000 != 0) ? " " : "") + convert(n % 1000000000);
    }

    public static void main(final String[] args) {
        final Random generator = new Random();

        int n;
        for (int i = 0; i < 20; i++) {
            n = generator.nextInt(Integer.MAX_VALUE);

            System.out.printf("%10d = '%s'%n", n, convert(n));
        }

        n = 1000;
        System.out.printf("%10d = '%s'%n", n, convert(n));

        n = 2000;
        System.out.printf("%10d = '%s'%n", n, convert(n));

        n = 10000;
        System.out.printf("%10d = '%s'%n", n, convert(n));

        n = 11000;
        System.out.printf("%10d = '%s'%n", n, convert(n));

        n = 999999999;
        System.out.printf("%10d = '%s'%n", n, convert(n));

        n = Integer.MAX_VALUE;
        System.out.printf("%10d = '%s'%n", n, convert(n));
    }
}