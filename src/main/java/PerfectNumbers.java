/*
Perfect Numbers

Perfect number is a positive integer that is equal to the sum of its proper divisors (6 => 1 + 2 + 3).

Example: 6, 28, 496, 8128, 33_550_336, 8_589_869_056

Problem: Print out perfect numbers up to given number: 10,000
 */

package main.java;

public class PerfectNumbers {

        public static boolean isPerfect(int number){
            int temp = 0;
            for (int i = 1; i <= number / 2; i++) {if (number % i == 0) {temp += i;}}
            if (temp == number) {return true;}
            else {return false;}
        }
        public static void main(String[] args) {
            int max = 10_000;
            for (int i = 1; i <= max; i++) {if (isPerfect(i)) {System.out.print(i + ", ");}}
        }
    }

