package Sort;

public class Insertion {
    public static void main(String[] args) {
        int nums[] = { 6, 5, 2, 8, 9, 4 };
        int size = nums.length;
        int key = 0;
        System.out.println("Before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        for (int i = 1; i < size; i++) {
            key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        System.out.println();
        System.out.println("After Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
