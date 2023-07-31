package Mathematics1;
import java.util.Scanner;
public class B1193 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int cnt = 1;
        int cnt2 = 2;
        int n = s.nextInt();
        boolean direction = true; // true: a 증가

        if (n == 1) {
            System.out.println("1/1");
        } else {
            while (true) {
                if (cnt + cnt2 < n) {
                    cnt += cnt2;
                    cnt2++;
                } else {
                    break;
                }
            }
            if (cnt2 % 2 == 0) {
                a = 1;
                b = cnt2;
                a += n-cnt-1;
                b -= n-cnt-1;
                System.out.printf("%d/%d", a, b);
            } else {
                a = cnt2;
                b = 1;
                a -= n-cnt-1;
                b += n-cnt-1;
                System.out.printf("%d/%d", a, b);
            }
        }

    }
}
