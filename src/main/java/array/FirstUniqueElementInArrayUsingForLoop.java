package main.java.array;

public class FirstUniqueElementInArrayUsingForLoop {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 1, 1, 1, 1};
        int firstUniqueElement = 0;

        for (int j = 0; j < nums.length; j++ ) {

        int frequency = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == nums[j]) {
                frequency++;
            }
        }

        if(frequency == 1) {
            firstUniqueElement = nums[j];
            break;
            }
        }
        System.out.println(firstUniqueElement);
    }
}
