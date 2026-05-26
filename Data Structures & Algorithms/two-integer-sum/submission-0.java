class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }

        Map<Integer, Integer> difMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];

            if (difMap.get(x) == null) {
                difMap.put(nums[i], i);
            } else {
                return new int[] {difMap.get(x), i};
            }
        }
        return new int[] {};
    }
}
