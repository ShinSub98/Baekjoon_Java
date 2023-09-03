package Recursive;
import java.util.*;
public class B10870 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long n = s.nextLong();
        System.out.println(fibo(n));
    }

    static long fibo(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 | n == 2) {
            return 1;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
