package Combination;
import java.util.*;
import java.io.*;
public class B11050 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int k;
        int res1=1;
        int res2=1;

        String nk = br.readLine();
        StringTokenizer st = new StringTokenizer(nk);

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (k == 0) {
            System.out.println(1);
        } else {
            for (int i = n; i > n-k; i--) {
                res1*=i;
            }
            for (int i = 1; i <= k; i++) {
                res2*=i;
            }
            System.out.println(res1/res2);
        }
    }
}
