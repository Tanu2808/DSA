public class HappyNumber {
    private int nextNumber(int n)
    {
        int nextNumber = 0;
        while (n != 0) {
            int remain = n % 10;
            nextNumber = (int) (nextNumber + Math.pow(remain, 2));
            n /= 10;
        }
        return nextNumber;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = nextNumber(slow);
            fast = nextNumber(nextNumber(fast));
        } while (slow != fast);
        return slow == 1;
    }
}
