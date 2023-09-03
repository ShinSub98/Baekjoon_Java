package BackTracking;
import java.util.*;
import java.io.*;
public class B15652 {
    public static int n; // 1부터 n까지의 자연수를
    public static int m; // m개의 수열로 나열
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        dfs(0, 1);
        System.out.println(sb);
    }

    static void dfs(int idx, int start) {
        if (idx == m) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = start; i <= n; i++) {
                arr[idx] = i;
                dfs(idx+1, i);
            }
        }
    }
}
