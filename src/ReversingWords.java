public class ReversingWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("   the     sky       is    blue  "));
    }
    public static String reverseWords(String s) {
        String[] fullStringArray = s.trim().split(" +");
       StringBuilder sb = new StringBuilder(fullStringArray.length);
        for (int i = fullStringArray.length - 1; i >= 0; i--) {
                if(i == 0) {
                    sb.append(fullStringArray[i]);
                }
                else {
                    sb.append(fullStringArray[i] + " ");
                }
        }
        return sb.toString();
    }
}
