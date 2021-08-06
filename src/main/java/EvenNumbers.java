/*
Even Numbers

Even number is an integer (positive or negative, not a fraction, including 0), which is divisible by 2.

Example: -6, -2, 0, 8, 20, 100

Problem: Print out even numbers up to given number: 10
 */

package main.java;

public class EvenNumbers {

    public static void main(String[] args) {
        int max = 10;
        System.out.print("The even numbers are: ");
        for (int i = 0; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
