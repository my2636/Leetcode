package leetcode;

public class GcdOfStrings {
	public static void main(String[] args) {
		String  a = "LEET", b = "CODE";
		System.out.println(gcdOfStrings(a, b));
		
	}
	
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenated strings are equal or not, if not return ""
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

/*
 * public static String gcdOfStrings(String a, String b) { String c = "";
 * 
 * int i = 0; while(i < a.length() && a.charAt(i) == b.charAt(i)) { c +=
 * a.charAt(i); i++; int gcd = gcd if(a.charAt(i) == c.charAt(0)) break; }
 * return c; }
 */


/*
 * public String gcdOfStrings(String str1, String str2) { if (!(str1 +
 * str2).equals(str2 + str1)) { return ""; }
 * 
 * int a = str1.length(); int b = str2.length();
 * 
 * while (b != 0) { int temp = b; b = a % b; a = temp; }
 * 
 * return str2.substring(0, a); }
 */