package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] nums)
    {
        // In bubble Sort we swap adjacent elements if current element is greater than next element
        // after each pass biggest element reaches the end
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
