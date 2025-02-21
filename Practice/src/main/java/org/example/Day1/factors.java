package org.example.Day1;

import java.util.HashSet;
import java.util.Set;

public class factors {

    public static void main(String[] args) {
        Set factors = findFactors(12);
        System.out.println(factors);
    }

    public static Set<Integer> findFactors(int num) {
        Set factors = new HashSet();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors.add(i); // i is a factor

                if (i != num / i) { // Avoid duplicates for perfect squares (e.g., 25: 5 and 5)
                    factors.add(num / i); //

                }
            }
        }
        return factors;
    }
}