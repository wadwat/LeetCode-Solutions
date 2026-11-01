class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int x = nums.length;
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
    return new int[]{};
    }            
}