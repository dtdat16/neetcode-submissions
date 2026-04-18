class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequenceMap = new HashMap<>();

        for(int num : nums) {
            frequenceMap.put(num, frequenceMap.getOrDefault(num, 0) + 1);
        }

        Integer[] objectArray =  frequenceMap.keySet().toArray(new Integer[frequenceMap.keySet().size()]);

        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return frequenceMap.get(o2).compareTo(frequenceMap.get(o1));
            }
        };

        Arrays.sort(objectArray, reverseComparator);

        Integer[] results = Arrays.copyOfRange(objectArray, 0, k);
        return Arrays.stream(results).mapToInt(Integer::intValue).toArray();
    }
}
