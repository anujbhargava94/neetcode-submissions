class Solution {
    private static final String delimiterStr = "#";

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String str: strs){
            int size = str.length();
            encodedString.append(delimiterStr)
            .append(size)
            .append(delimiterStr)
            .append(str);
        }

        System.out.println(encodedString);
        return encodedString.toString();

    }

    int getSize(String str, int ptr){
        int curr = ptr+1;
        StringBuilder sb = new StringBuilder();
        while( curr < str.length() && str.charAt(curr)!='#'){
            sb.append(str.charAt(curr));
            curr++;
        }
        return Integer.parseInt(sb.toString());
    }

    public List<String> decode(String str) {

            int ptr = 0;
            int size = str.length();
            List<String> decodedString = new ArrayList<>();
            while(ptr<size){
                // int currentSize = getSize(str, ptr);
                // ptr = ptr+3;
                int curr = ptr+1;
                StringBuilder sb = new StringBuilder();
                while( curr < str.length() && str.charAt(curr)!='#'){
                    sb.append(str.charAt(curr));
                    curr++;
                }
                int currentSize = Integer.parseInt(sb.toString());
                ptr = curr+1;

                // System.out.println("ptr:"+ptr+"currentSize:"+currentSize);
                // System.out.println(decodedString);
                String currentString = str.substring(ptr, ptr+currentSize);
                decodedString.add(currentString);
                ptr = ptr+currentSize;
            }
            return decodedString;
    }
}
