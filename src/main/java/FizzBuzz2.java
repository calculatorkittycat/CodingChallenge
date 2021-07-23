/*
 * Title: Fizzbuzz (Java Coding Sample)
 * Description:
 *     Program that prints the numbers from 1 to 100. But for multiples of
 *     three print "Fizz" instead of the number and for the multiples of five
 *     print "Buzz". For numbers which are multiples of both three and five
 *     print "FizzBuzz".
 */

package main.java;

public class FizzBuzz2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0) {output += "Fizz";}
            if (i % 5 == 0) {output += "Buzz";}

            if(output.equals("")) { output = Integer.toString(i);}

            System.out.println(output);
        }
    }
}
