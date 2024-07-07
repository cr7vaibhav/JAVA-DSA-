public class BinarySearch {

    private static int binarySrc(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Steps taken for Binary Search : " + steps);
                return mid;
            } else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println("Steps taken for Binary Search : " + steps);
        return -1;
    }

    public static int linearSrc(int arr[], int target) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                System.out.println("Steps taken for Linear Search : " + steps);
                return i;
            }

        }
        System.out.println("Steps taken for Linear Search : " + steps);
        return -1;
    }

    public static void main(String[] args) {
        // can be applicable on sorted array only
        int nums[] = new int[10000];
        int target = 900;
        int result = binarySrc(nums, target);
        int result2 = linearSrc(nums, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

}
