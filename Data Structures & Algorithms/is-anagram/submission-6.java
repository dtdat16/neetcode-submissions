class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        
        if(sLength != tLength) return false;

        Map<Character, Integer> sCharacterMap = new HashMap<>();
        Map<Character, Integer> tCharacterMap = new HashMap<>();

        for(int index = 0; index < tLength; index ++) {
            char sCharacter = s.charAt(index);
            char tCharacter = t.charAt(index);

            addCharacterCount(sCharacter, sCharacterMap);
            addCharacterCount(tCharacter, tCharacterMap);
        }

        int sCharacterMapSize = sCharacterMap.size();
        int tCharacterMapSize = tCharacterMap.size();
        System.out.println("sCharacterMapSize: " + sCharacterMapSize);

        if( sCharacterMapSize != tCharacterMapSize) return false;

        for (char character : sCharacterMap.keySet()) {
            int sCharCount = sCharacterMap.get(character);
            int tCharCount = tCharacterMap.get(character) == null ? 0 : tCharacterMap.get(character);
            if(sCharCount != tCharCount){
                return false;
            }
        }

        return true;
    }

    private void addCharacterCount(char character, Map<Character, Integer> map){
        if(map.containsKey(character)){
            map.put(character, map.get(character) + 1);
        }else {
            map.put(character, 1);
        }
    }
}
