// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        int l=0,r=1;
        while(r<s.length()){
            if(s.charAt(l)!=s.charAt(r)){
                sb.append(s.charAt(l));
            }
            l++;
            r++;
        }
                        sb.append(s.charAt(l));

        return sb.toString();
    }
}