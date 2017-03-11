package leetcode_28_implement_strStr;

public class Solution {
    public static int strStr(String haystack, String needle) {
        int resultIdx = -1;
        
        if (haystack.equals(needle)) {
            return 0;            
        }
        
        if (haystack.length() == 0) {
            return resultIdx;
        } else if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {        	
            if ((haystack.charAt(i) == needle.charAt(0)) && (i + needle.length() - 1 < haystack.length())) {
            	System.out.print(haystack.substring(i, i + needle.length()) + " ");
            	
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                	resultIdx = i;
                	break;
                }
            }
        }
        
        return resultIdx;
    }
}