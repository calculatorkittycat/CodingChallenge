/*
Prime Numbers

Prime number is a number (positive only) which only divisible by 1 and itself.

Example: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31

Problem: Print out prime numbers up to given number: 100
 */

package main.java;

public class PrimeNumber {

    public static boolean isPrime(int number) {

        if (number <= 1) { return false; } // Negative and 1 are not Prime
        if (number == 2) { return true; }   // 2 is only Even prime number
        if (number % 2 == 0) { return false; } // Excluding all Even numbers
        for (int i = 2; i < number; i++) {
            if (number % i == 0) { return false; }}
            return true;
    }

    public static void main(String[] args) {

        int max = 100;
        for (int i = 1; i <= max; i++) {
            if (isPrime(i)) { System.out.print(i + ", "); }
        }
    }
}