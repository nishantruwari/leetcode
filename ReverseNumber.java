package leetcodepractice;

import java.util.Scanner;

public class ReverseNumber {
    public int reverse(int x) {
        int neg;
        if (x > 0)
            neg = 1;
        else
            neg = -1;
        long ans = 0;
        x = Math.abs(x);
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;

        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;
        return (int) ans * neg;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n = sc.nextInt();
        int rev = reverse(n);
        System.out.println("Reverse > " + rev);
    }

}
