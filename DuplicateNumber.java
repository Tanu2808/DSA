public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int j = 0;
        do {            
            i = nums[i];
            j = nums[nums[j]];
        } while (i != j);
        i = 0;
        while (nums[i] != nums[j]) {            
            i = nums[i];
            j = nums[j];
        }
        return nums[i];
    }
}
