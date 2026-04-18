class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(complementMap.containsKey(nums[i])){
                return new int[] {complementMap.get(nums[i]), i};
            }else{
                int complement = target - nums[i];
                complementMap.put(complement, i);
            }
        }
        return  new int[2];
    }
}
