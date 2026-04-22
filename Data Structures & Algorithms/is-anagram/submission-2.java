class Solution {
    public boolean isAnagram(String s, String t) {

        if(s == null || t == null || s.length()!=t.length()) return false;

        int[] left = new int[26];
        int[] right = new int[26];

        for(int i=0;i<s.length();i++){
            left[s.charAt(i)-'a']++;
            right[t.charAt(i)-'a']++;
        }

        for(int i=0;i<left.length;i++){
            // System.out.println(left[i]);
            if(left[i]!=right[i]) return false;
        }
        return true;

    }
}
