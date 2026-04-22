class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        int[] charCountS = new int[26];
        int[] charCountT = new int[26];

        for(Character character:s.toCharArray()){
            // int count = 'a';
            // System.out.println(character+" "+count);
             charCountS[character-97]++;
        }

        for(Character character:t.toCharArray()){
            // int count = character;
            // System.out.println(character+" "+count);
             charCountT[character-97]++;
        }

    

        for(int i=0;i<26;i++){
            if(charCountS[i]!=charCountT[i])
            return false;
        }

        return true;




    }
}
