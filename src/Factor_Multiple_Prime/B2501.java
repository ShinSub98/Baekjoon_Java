package Factor_Multiple_Prime;
import java.util.Scanner;
public class B2501 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        System.out.print(factor(n,k));
    }

    static int factor(int n, int k) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
            if (cnt == k) {
                return i;
            }
        }
        return 0;
    }
}
