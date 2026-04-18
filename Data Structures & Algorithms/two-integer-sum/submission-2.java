class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> supplementMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int mapItem = supplementMap.getOrDefault(nums[i], -1);
            if(mapItem > -1){
                int[] result = new int[]{mapItem, i};
                return result;
            }else{
                int supplement = target - nums[i];
                supplementMap.put(supplement, i);
            }
        }
        return  new int[2];
    }
}
