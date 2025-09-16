import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] nums = {1,2, 4, 5,7, 9};
        int index = Arrays.binarySearch(nums, 4);
        System.out.println(index);
    }
}
