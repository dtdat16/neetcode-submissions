class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        Map<Character, Integer> sCharacterMap = new HashMap<>();
        Map<Character, Integer> tCharacterMap = new HashMap<>();

        for(int index = 0; index < s.length(); index ++) {
            char sCharacter = s.charAt(index);
            char tCharacter = t.charAt(index);

            sCharacterMap.put(sCharacter, sCharacterMap.getOrDefault(sCharacter, 0) + 1);
            tCharacterMap.put(tCharacter, tCharacterMap.getOrDefault(tCharacter, 0) + 1);
        }

        return sCharacterMap.equals(tCharacterMap);
    }
}
