class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> differenceMap = new HashMap<>();

        for(int index = 0; index < nums.length; index++) {
            if(differenceMap.containsKey(nums[index])) {
                return new int[]{differenceMap.get(nums[index]), index};
            }

            int difference = target - nums[index];
            differenceMap.put(difference, index);
        }

        return new int[0];
    }
}
