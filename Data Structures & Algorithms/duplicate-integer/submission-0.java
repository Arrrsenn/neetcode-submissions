class Solution {
    public boolean hasDuplicate(int[] nums) {
        int lenArray = nums.length;
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        return lenArray != hashSet.size();
    }
}