package leetcode;

public class MergeStringsAlternately {
	public static void main(String[] args) {
		System.out.println(mergeAlternately(new String("ace"), new String("bdfkot")));
	}
	
    public static String mergeAlternately(String word1, String word2) {
    	StringBuilder sb = new StringBuilder();
    	int i = 0;
    	while(i < word1.length() || i < word2.length()) {
    		if(i < word1.length()) {
        		sb.append(word1.charAt(i));
        	}
        	if(i < word2.length()) {
        		sb.append(word2.charAt(i));
        	}
        	i++;
    	}
    	
    	
        return sb.toString();
    }
}

/*
 * public class MergeStringsAlternately { public static void main(String[] args)
 * { System.out.println(mergeAlternately(new String("ace"), new String("bdf")));
 * }
 * 
 * public static String mergeAlternately(String word1, String word2) {
 * StringBuilder sb = new StringBuilder(); int i = 0; while(i < word1.length()
 * && i < word2.length()) { sb.append(word1.charAt(i));
 * sb.append(word2.charAt(i)); i++; } if(word1.length() - word2.length() < 0) {
 * sb.append(word2.substring(i)); } if(word2.length() - word1.length() < 0) {
 * sb.append(word1.substring(i)); }
 * 
 * return sb.toString(); } }
 */