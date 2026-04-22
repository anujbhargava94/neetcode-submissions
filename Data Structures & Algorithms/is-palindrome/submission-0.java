class Solution {
    public boolean isPalindrome(String s) {
        
        int l = 0;
        int r = s.length()-1;
        s = s.toLowerCase();

        while(l<=r){

            if(!isAlphaNum(s.charAt(l))){
                l++;
            }
            else if(!isAlphaNum(s.charAt(r))){
                r--;
            }
            
            else if(isAlphaNum(s.charAt(l)) 
            && isAlphaNum(s.charAt(r))
            && s.charAt(l) == s.charAt(r)
            ){
                l++;
                r--;
            }else{
                return false;
            }
            
        }
        return true;





    }

    boolean isAlphaNum(char c){
        if( c>='a' && c<='z' || 
        c>= 'A' && c<= 'Z' ||
        c>= '0' && c<='9')
        return true;
        else return false;
    }
}
