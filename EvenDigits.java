public class EvenDigits {
    public int findNumbers(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((int) (Math.log10(Math.abs(nums[i])) + 1) % 2 == 0) answer++;
        }
        return answer;
    }
}
