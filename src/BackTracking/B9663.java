package BackTracking;
import java.io.*;
public class B9663 {
    public static int n;
    public static int cnt = 0;
    public static int[] arr; // index는 x축, value는 y축
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        nQueens(0);
        System.out.println(cnt);


    }

    static boolean promising(int x) {
        for (int i = 0; i < x; i++) {
            if (arr[i] == arr[x] | Math.abs(x-i) == Math.abs(arr[x] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    static void nQueens(int x) {
        if (x == n) {
            cnt++;
        }  else {
            for (int i = 0; i < n; i++) {
                arr[x] = i;
                if (promising(x) == true) {
                    nQueens(x+1);
                }
            }
        }
    }
}
