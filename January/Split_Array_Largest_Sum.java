class Split_Array_Largest_Sum {
    static int splitArray(int[] nums, int length, int subArrays) {
        int total = 0, maximum = Integer.MIN_VALUE;
        for (int num : nums) {
            total += num;
            maximum = Math.max(maximum, num);
        }

        int start = maximum, end = total, result = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canSplit(nums, mid, subArrays)) {
                result = Math.min(result, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    // Check if requiredSum is possible to get by splitting the array into k or
    // fewer subarrays
    public static boolean canSplit(int[] nums, int requiredSum, int subArrays) {
        int sum = 0, count = 1;
        for (int num : nums) {
            if (sum + num <= requiredSum) {
                sum += num;
            } else {
                sum = num;
                count++;
            }
        }
        return count <= subArrays;
    }
}