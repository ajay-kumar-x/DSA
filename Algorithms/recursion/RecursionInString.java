package recursion;

public class RecursionInString {

	public static void main(String[] args) {
		
		//System.out.println(palindrome("acca",0,3));
		
		powerSet("abc", 0, "");

	}
	
	//to check if a number is palindrome or not using recursion
	public static boolean palindrome(String str,int l,int r) {
		
		if(l>=r) return true;
		
		if(str.charAt(l)!=str.charAt(r)) return false;
		
		return palindrome(str,l+1,r-1);
	}
	
	
	//all subsequence of a string | abc=> abc,ab,ac,a,bc,b,c,""
	public static void powerSet(String s,int i, String curr) {
		if(i==s.length()) {
			System.out.println(curr);
			return;
		}
		powerSet(s, i+1, curr+s.charAt(i));
		powerSet(s, i+1, curr);
	}

}
