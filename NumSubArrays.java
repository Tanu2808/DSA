class NumSubArrays {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum = 0;
        int count = 0;

        
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        if (sum >= threshold * k) {
            count++;
        }

    
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];

            if (sum >= threshold * k) {
                count++;
            }
        }

        return count;
    }
}