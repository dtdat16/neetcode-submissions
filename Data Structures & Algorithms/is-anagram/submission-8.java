class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sCharFrequency = new HashMap<>();
        Map<Character, Integer> tCharFrequency = new HashMap<>();

        for(char sChar : s.toCharArray()){
            sCharFrequency.put(sChar, sCharFrequency.getOrDefault(sChar, 0) + 1);
        }

        for (char tChar: t.toCharArray()) {
            tCharFrequency.put(tChar, tCharFrequency.getOrDefault(tChar, 0) + 1);
        }

        return  sCharFrequency.equals(tCharFrequency);
    }
}
