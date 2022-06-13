import java.util.HashMap;

public class IntegerToRoman {
    public static void main(String[] args) {
        int n = 994;
        /*
         * HashMap<Integer, String> map = new HashMap<>();
         * map.put(1, "I");
         * map.put(5, "V");
         * map.put(10, "X");
         * map.put(50, "L");
         * map.put(100, "C");
         * map.put(500, "D");
         * map.put(1000, "M");
         */
        StringBuffer sb = new StringBuffer();
        while (n != 0) {
            if (n >= 1000) {
                sb.append("M");
                n = n - 1000;
                continue;

            }
            if (n < 1000 && n >= 900) {
                sb.append("CM");
                n = n - 900;
                continue;

            }
            if (n >= 500) {
                sb.append("D");
                n = n - 500;
                continue;
            }
            if (n < 500 && n >= 400) {
                sb.append("CD");
                n = n - 400;
                continue;
            }
            if (n >= 100) {
                sb.append("C");
                n = n - 100;
                continue;
            }
            if (n < 100 && n >= 90) {
                sb.append("XC");
                n = n - 90;
                continue;
            }
            if (n >= 50) {
                sb.append("L");
                n = n - 50;
                continue;
            }
            if (n < 50 && n >= 40) {
                sb.append("XL");
                n = n - 40;
                continue;
            }
            if (n >= 10) {
                sb.append("X");
                n = n - 10;
                continue;
            }
            if (n == 9) {
                sb.append("IX");
                n = n - 9;
                continue;
            }
            if (n >= 5) {
                sb.append("V");
                n = n - 5;
                continue;
            }
            if (n == 4) {
                sb.append("IV");
                n = n - 4;
                continue;
            }
            if (n >= 1) {
                sb.append("I");
                n = n - 1;
                continue;
            }

        }
        System.out.println(sb);

    }

}
