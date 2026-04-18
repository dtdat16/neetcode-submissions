
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        boolean result = false;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                result = true;
                break;
            }else{
                map.put(nums[i], true);
            }
        }

        return result;
    }
}