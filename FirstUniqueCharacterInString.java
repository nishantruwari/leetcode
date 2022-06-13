import java.util.HashMap;

import javax.lang.model.util.ElementScanner6;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String str = "bbabbc";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {

            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);

            } else {
                map.put(str.charAt(i), 2);
            }
        }
        for (int j = 0; j < str.length(); j++) {
            if (map.get(str.charAt(j)) == 1) {
                System.out.println(str.charAt(j));
                return;
            }

        }

        System.out.println("no such char found");

    }

}
