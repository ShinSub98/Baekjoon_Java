package Combination;
import java.util.*;
import java.io.*;
public class B1010 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 | m == 0) {
                sb.append(1).append('\n');
                continue;
            }

            long a = 1;
            long b = 1;

            for (int k = m-n+1; k <= m; k++) {
                a = a*k;
            }
            for (int k = 1; k <= n; k++) {
                b = b*k;
            }

            sb.append((long)(a/b)).append('\n');
        }
        System.out.println(sb);
    }
}
