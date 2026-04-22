class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        char[] c = s.toCharArray();
        Set<Character> charSet = new HashSet<>();
        
        int i = 0;
        int j=1;
        int max = 1;
        charSet.add(c[0]);
        while(j<s.length()){
            if(charSet.contains(c[j])){
                max = Math.max(j-i, max);
                i++;
                j=i+1;
                charSet.clear();
                charSet.add(c[i]);
            }else{
                charSet.add(c[j]);
                j++;
            }
        }
        max = Math.max(j-i, max);
        return max;
        
    }
}
