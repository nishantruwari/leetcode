public class validAnagram {
    public static void main(String[] args) {
        String str = "anagramt";
        String str1[] = str.split("");
        String str2 = "nagram";
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (str2.contains(str1[i])) {

            } else {
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("anagram");
    }

}
