import java.util.*;

public class reverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        List<Character> temp = new LinkedList<>();
        char[] array = new char[]{'a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I'};
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            for (int j = 0; j < array.length; j++) {
                if (ch[i] == array[j]) {
                    temp.add(ch[i]);
                    break;
                }
            }
        }
        System.out.println(temp);
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (ch[i] == array[j] && !temp.isEmpty()) {
                    ch[i] = temp.getFirst();
                    temp.removeFirst();
                    break;
                }
            }
        }
        return new String(ch);
    }
}
