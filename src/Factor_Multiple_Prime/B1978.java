package Factor_Multiple_Prime;
import java.util.Scanner;
public class B1978 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = s.nextInt();
        }

        int cnt = 0;

        for (int i : arr) {
            if (check(i) == true) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean check(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
