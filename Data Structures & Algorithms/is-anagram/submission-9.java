class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sCharacterCount = new HashMap<>();
        Map<Character, Integer> tCharacterCount = new HashMap<>();

        for (char c : s.toCharArray()){
            sCharacterCount.put(c, sCharacterCount.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()){
            tCharacterCount.put(c, tCharacterCount.getOrDefault(c, 0) + 1);
        }

        return sCharacterCount.equals(tCharacterCount);
    }
}
