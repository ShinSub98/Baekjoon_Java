package BackTracking;
import java.util.*;
import java.io.*;
public class B15650 {
    static int n;
    static int m;
    static int[] arr;
    static int[] used;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 1부터 n까지
        m = Integer.parseInt(st.nextToken()); // m개의 수열

        arr = new int[m];

        dfs(1, n-m+2, 0);
    }

    static void dfs(int start, int end, int idx) {
        if (idx == m) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(' ');
            }
            System.out.println(sb);
        } else {
            for (int i = start; i < end; i++) {
                arr[idx] = i;
                dfs(i+1, end+1, idx+1);
            }
        }
    }
}
