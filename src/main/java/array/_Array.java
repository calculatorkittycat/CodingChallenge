/*
Array https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
It’s a fixed size, indexed, containing the same type elements data structure (collection).
Defined in Java language itself as a fundamental data structure.
Array is a sequential collection of similar data that can be accessed on the basis of "index".
It is the simplest type of data structure in which the elements get stored in contiguous memory location.

 */
package main.java.array;

public class _Array {
    public static void main(String[] cla) {
        String[] month = new String[12];
        month[0] = "January";
        month[1] = "February";
        month[2] = "March";
        month[3] = "April";
        month[4] = "May";
        month[5] = "June";
        month[6] = "July";
        month[7] = "August";
        month[8] = "September";
        month[9] = "October";
        month[10] = "November";
        month[11] = "December";
        System.out.println(month[11]);
        System.out.println(month.length);
        System.out.println(month.getClass());
    }
}
/*
Output:
December
12
class [Ljava.lang.String;
 */