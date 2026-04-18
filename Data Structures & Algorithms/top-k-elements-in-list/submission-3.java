class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // build frequentMap
        // Sorted frequentMap
        //get k element in list

        Map<Integer, Integer> frequentMap = new HashMap<>();

        for(int num : nums){
            int frequent = frequentMap.getOrDefault(num, 0);
            frequentMap.put(num, frequent + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequentMap.entrySet());

        Comparator<Map.Entry<Integer, Integer>> valueComparator = (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue());
        entryList.sort(valueComparator);
        
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
