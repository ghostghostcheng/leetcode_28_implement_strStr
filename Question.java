package leetcode_28_implement_strStr;

public class Question {
	
	public static void main(String args[]) {
		String haystack = "mississippi";
		String needle = "pi";
		int idx;
		
		//System.out.print(haystack.substring(8, 10) + " ");
		
		idx = Solution.strStr(haystack, needle);
		
		System.out.print(idx);
	}
}
