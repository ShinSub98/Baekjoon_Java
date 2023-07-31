package Factor_Multiple_Prime;
import java.util.Scanner;
public class B2581 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int min = 0;
        boolean c = false;

        int start = s.nextInt();
        int end = s.nextInt();

        for (int i = end; i >= start; i--) {
            if (check(i) == true) {
                sum += i;
                min = i;
                c = true;
            }
        }
        if (c == true) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

    }

    static boolean check(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < (int)Math.pow(n, 0.5)+1; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
