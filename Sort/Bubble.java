package Sort;


public class Bubble {
    public static void main(String[] args) {
        int nums[] = { 6, 5, 2, 8, 9, 4 };
        int size = nums.length;
        int temp = 0;
        System.out.println("Before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                // j should end before the last value
                // and j should end early if last elements are already sorted
                // we save time by not checking already sorted elements
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
