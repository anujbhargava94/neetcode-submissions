class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (int i=0; i<strs.length;i++)
        {
            int[] temp = new int[26];
            
            for(int j=0;j<strs[i].length();j++)
            {
                char[] c= strs[i].toCharArray();
                temp[c[j] - 'a']++;
            }
            String key = Arrays.toString(temp);
            if(anagramMap.containsKey(key))
            {
                List<String> anagrams = anagramMap.get(key);
                anagrams.add(strs[i]);
                anagramMap.put(key, anagrams);
            }else{
                List<String> anagrams = new ArrayList<>();
                anagrams.add(strs[i]);
                anagramMap.put(key, anagrams);
            }
        }
      return new ArrayList<>(anagramMap.values());
    }
}
