public class BinarySearchRec {
    public static void main(String[] args) {
        // can be applicable on sorted array only
        int nums[] = { 5, 7, 9, 11, 13 };
        int target = 11;
        int result = binarySrc(nums, target, 0, nums.length - 1);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    public static int binarySrc(int[] nums, int target, int left, int right) {
        // left =0;
        // int right= nums.length-1;

        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target)
                return binarySrc(nums, target, mid + 1, right);
            // calling the same method inside its scope
            else
                return binarySrc(nums, target, left, mid - 1);
        }

        return -1;

    }

}
