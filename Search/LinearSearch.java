public class LinearSearch {
    public static int linearSrc(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        // can be applicable on sorted and unsorted array
        int nums[] = { 5, 7, 9, 11, 13 };
        int target = 11;
        int result = linearSrc(nums, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
