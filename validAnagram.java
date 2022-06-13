import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
        String str = "aabc";
        String s = "abbc";

        char c[] = str.toCharArray();
        char ch[] = s.toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);
        String sm1 = String.valueOf(c);
        String sm2 = String.valueOf(ch);
        if (sm1.equals(sm2)) {
            System.out.println("anagram");
            return;
        }
        System.out.println("not anagram");

    }

}
