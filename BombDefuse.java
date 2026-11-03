public class BombDefuse {
    public int[] decrypt(int[] code, int k) {
        if (k == 0) return new int[code.length];
        int i = (k < 0) ? code.length + k : 1;
        int j = (k < 0) ? code.length - 1 : k;
        int[] nums = new int[code.length];
        int sum = 0;
        for (int l = i; l <= j; l++) sum += code[l];
        for (int l = 0; l < nums.length; l++) {
            nums[l] = sum;
            sum -= code[i];
            sum += code[(j + 1) % nums.length];

            i = (i + 1) % nums.length;
            j = (j + 1) % nums.length;
        }
        return nums;
    }
}
