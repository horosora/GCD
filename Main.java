import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        System.out.println(gcd(x, y));
    }

    private static long gcd(long x, long y) {
        if (x > y) {
            long tmp = x;
            x = y;
            y = tmp;
        }
        while (true) {
            long rem = x % y;
            if (rem == 0) {
                return y;
            }
            x = y;
            y = rem;
        }
    }
}
