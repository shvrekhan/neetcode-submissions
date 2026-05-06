class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int index = 0; index < nums.length - 1; index++) {
            for (int innerIndex = index + 1; innerIndex < nums.length; innerIndex++) {
                if ((nums[index] + nums[innerIndex]) == target) {
                    ans[0] = index;
                    ans[1] = innerIndex;
                    return ans;
                }
            }
        }

        return ans;
    }
}
