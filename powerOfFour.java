import java.lang.Math.*;

public class powerOfFour {
    public static void main(String[] args) {
        int n = (int) Math.log(16) / (int) Math.log(4);
        double p = Math.log(16) / Math.log(4);

        System.out.println(n == p);

    }

}
