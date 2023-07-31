package Factor_Multiple_Prime;
import java.util.Scanner;
public class B9506 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int n = s.nextInt();
            if (n == -1) {
                break;
            }
            int cnt = 0;
            int[] arr = new int[n/2];
            int total = 0;
            for (int i = 1; i <= (n/2); i++) {
                if (n%i == 0) {
                    total += i;
                    arr[cnt++] = i;
                }
            }
            cnt--;

            if (total == n) {
                StringBuilder sb = new StringBuilder();
                sb.append(n).append(" = ");
                for (int i = 0; i <= cnt; i++) {
                    sb.append(arr[i]);
                    if (i != cnt) {
                        sb.append(" + ");
                    }
                }
                System.out.println(sb);
            } else {
                System.out.printf("%d is NOT perfect.\n", n);
            }

        }
    }
}
