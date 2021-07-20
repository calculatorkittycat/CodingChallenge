/*
Odd Numbers

Odd number is an integer (positive or negative, not a fraction), which is not divisible by 2.

Example: -3, -1, 7, 11

Problem: Print out odd numbers up to given number: 10
 */

package main.java;

public class OddNumbers {

    public static void main(String[] args) {
        int max = 10;
        System.out.print("Odd numbers are: ");
        for (int i = 0; i < max; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}