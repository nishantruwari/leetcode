import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {
    public static void main(String[] args) {
        String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        HashMap<String, List<String>> map = new HashMap<>();
        if (str.length == 0) {
            ArrayList arr = new ArrayList<>();
            return;

        }
        for (String s : str) {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        System.out.println(map.values());

    }

}
