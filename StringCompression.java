public class StringCompression {
    public static void main(String[] args) {

        char ch[] = { 'a', 'b', 'b' };
        int n = ch.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n;) {
            int j;
            int count = 1;
            sb.append(ch[i]);
            for (j = i + 1; j < n; j++) {
                if (ch[i] != ch[j]) {
                    break;
                } else {
                    count++;
                }
            }
            if (count == 1) {
                i++;
                continue;
            } else {
                i = i + count;
                sb.append(count);

            }
        }
        // System.out.println(sb);

        String str = sb.toString();
        char ch1[] = str.toCharArray();
        for (int p = 0; p < str.length(); p++) {
            ch[p] = ch1[p];
        }
        // System.out.println(ch.length);
        // return str.length();
        System.out.println(str.length());
    }

}
