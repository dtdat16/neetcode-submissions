class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strs){
            // Sort string
            char[] charArray = str.toCharArray();

            Arrays.sort(charArray);

            String sortedStr = new String(charArray);

            List<String> mapItem = anagramMap.getOrDefault(sortedStr, new ArrayList<String>());

            mapItem.add(str);

            anagramMap.put(sortedStr, mapItem);
        }
        
        List<List<String>> result = new ArrayList<>();
        for(String key : anagramMap.keySet()){
            result.add(anagramMap.get(key));
        }

        return result;
    }
}
