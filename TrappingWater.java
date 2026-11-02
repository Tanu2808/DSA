public class TrappingWater {
    public int trap(int[] height) {
        int first = 0;
        int second = height.length - 1;
        int firstMax = 0;
        int secondMax = 0;
        int maxArea = 0;
        while (first <= second) {
            if (firstMax < secondMax)
            {
                firstMax = Math.max(firstMax, height[first]);
                maxArea += firstMax - height[first];
                first++;
            }
            else {
                secondMax = Math.max(secondMax, height[second]);
                maxArea += secondMax - height[second];
                second--;
            }
        }        
        
        return maxArea;
    }
}
