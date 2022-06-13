import java.util.HashMap;

public class romanTointeger {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String str = "XCIV";
        // char c[] = str.toCharArray();
        String c[] = str.split("");
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                sum = sum + map.get(c[i]);
                break;
            }
            if (map.get(c[i]) < map.get(c[i + 1])) {
                sum = sum - map.get(c[i]);
            } else {
                sum = sum + map.get(c[i]);

            }

        }
        System.out.println(sum);

    }

}
