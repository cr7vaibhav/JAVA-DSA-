package Sort;

public class Quick {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);// starting always low for first array
            quickSort(arr, pi + 1, high);// ending is always high for second array
        }
    }

    private static int partition(int nums[], int low, int high) {
        int pivot = high;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = { 6, 5, 2, 8, 9, 4 };

        System.out.println("Before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        quickSort(nums, 0, nums.length - 1);

        System.out.println();
        System.out.println("After Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
