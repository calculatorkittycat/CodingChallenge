package main.java.array;

public class FirstUniqueElementInArrayUsingForLoop {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 1, 1, 1, 1};
        int firstUniqueElement = 0;

        for ( int each : nums) {

        int frequency = 0;
        for (int element : nums) {
            if (element == each) {
                frequency++;
            }
        }

        if(frequency == 1) {
            firstUniqueElement = each;
            break;
            }
        }
        System.out.println(firstUniqueElement);
    }
}
