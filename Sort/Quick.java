package Sort;

public class Quick {

    public static int partition(int nums[],int low,int high,int pivot)
    {
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums[i],nums[j]);
            }
        }
        swap(nums[i+1],nums[high]);

        return i+1;
    }
    public static void main(String[] args) {
        int nums[] = { 6, 5, 2, 8, 9, 4 };
        int size = nums.length;
        
        System.out.println("Before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    
        System.out.println();
        System.out.println("After Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
