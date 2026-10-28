import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> list = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]) continue;
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    long temp = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                    if (temp == target) {
                        List<Integer> subList = new ArrayList<>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[k]);
                        subList.add(nums[l]);
                        list.add(subList);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                        while (k < l && nums[l] == nums[l + 1])
                            l--;
                    } else if (nums[i] + nums[j] + nums[k] + nums[l] < target)
                        k++;
                    else
                        l--;

                }

            }
        }
        return List.copyOf(list);
    }
}
