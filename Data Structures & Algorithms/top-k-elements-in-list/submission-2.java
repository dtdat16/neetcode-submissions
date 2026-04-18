class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequenceMap = new HashMap<>();

        for(int num : nums) {
            frequenceMap.put(num, frequenceMap.getOrDefault(num, 0) + 1);
        }

        //find max frequence number to create bucket
        int maxFrequence = Collections.max(frequenceMap.values());

        // Create buckets
        List<Integer>[] buckets = new List[maxFrequence + 1];

        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // add element into bucket based on the frequence number of the element
        for(Map.Entry<Integer, Integer> entry : frequenceMap.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }
        // Get top k numbers with down from maxFrequence to 1
        int[] result = new int[k];
        int currentResultIndex = 0;
        
        for(int i = maxFrequence; i > 0; i--){
            List<Integer> elements = buckets[i];

            if(elements.isEmpty()){ continue;}

            for(Integer element : elements){
                if(currentResultIndex == k) return result;

                result[currentResultIndex] = element;
                currentResultIndex++;
            }
        }

        return result;
    }
}
