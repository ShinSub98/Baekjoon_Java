package Mathematics1;
import java.util.Scanner;
public class B2292 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cycle = 1;
        int cnt = 1;

        if (n == 1) {
            System.out.println(1);
        } else {
            while (n > cycle) {
                cycle += 6*cnt;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
